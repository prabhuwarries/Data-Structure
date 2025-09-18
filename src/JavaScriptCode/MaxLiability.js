import { createInterface } from 'readline';

const opinions = [
    // Initial opinions if any go here
].sort((a, b) => {
    if (a.value !== b.value) return a.value - b.value;
    return a.condition === "Below" && b.condition === "Above" ? -1 : 1;
});

let lastTable = null;
let lastMaxLiability = 0;
let cashOut = 0;
let walletDebit = 0;

function buildLadderTable(opinions) {
    const breakpoints = new Set();
    for (const op of opinions) {
        breakpoints.add(op.value);
    }

    const sortedPoints = Array.from(breakpoints).sort((a, b) => a - b);

    const windows = [];
    windows.push({ label: `Below ${sortedPoints[0]}`, range: (p) => p < sortedPoints[0] });

    for (let i = 0; i < sortedPoints.length - 1; i++) {
        const low = sortedPoints[i];
        const high = sortedPoints[i + 1];
        windows.push({
            label: `${low} - <${high}`,
            range: (p) => p >= low && p < high,
        });
    }

    windows.push({
        label: `${sortedPoints[sortedPoints.length - 1]} and above`,
        range: (p) => p >= sortedPoints[sortedPoints.length - 1],
    });

    const result = [];
    let tableMaxLiability = 0;

    for (const win of windows) {
        let testPrice = null;
        if (win.label.includes("Below")) {
            testPrice = parseFloat(win.label.split(" ")[1]) - 1;
        } else if (win.label.includes("and above")) {
            testPrice = parseFloat(win.label) + 1;
        } else {
            const [low, high] = win.label.split("- <").map(Number);
            testPrice = low + 0.1;
        }

        let winningAmount = 0;

        for (const op of opinions) {
            const isMatch =
                (op.condition === "Above" && testPrice > op.value) ||
                (op.condition === "Below" && testPrice < op.value);

            if (isMatch) {
                winningAmount += op.amount * 2;
            }
        }

        const totalInvested = opinions.reduce((sum, op) => sum + op.amount, 0);
        const netProfit = winningAmount - totalInvested;
        tableMaxLiability = Math.max(tableMaxLiability, -1 * netProfit);

        result.push({
            Window: win.label,
            Winnings: netProfit,
        });
    }

    return { result, maxLiability: tableMaxLiability };
}

// Readline interface
const rl = createInterface({
    input: process.stdin,
    output: process.stdout
});

function ask(query) {
    return new Promise(resolve => rl.question(query, resolve));
}

async function main() {
    opinions.sort
    while (true) {
        const table = buildLadderTable(opinions);
        console.clear();
        console.log("Previous Ladder Table:");
        console.table(lastTable || []);
        console.log("Current Ladder Table:");
        console.table(table.result, ['Window', 'Winnings']);

        console.log(`New Max Liability: ${table.maxLiability}`);


        console.log(`Wallet Transaction to be done (-ve means Cash Out): ${table.maxLiability - lastMaxLiability}`);
        let walletTransact = table.maxLiability - lastMaxLiability;
        if (walletTransact < 0) {
            cashOut += -1 * walletTransact
        } else {
            walletDebit += walletTransact;
        }
        console.log(`Current Cash Out: ${cashOut}`);
        console.log(`Current Wallet Debit: ${walletDebit}`);
        console.log(`Left Investment: ${walletDebit - cashOut}`);


        console.log("Current Bets:", opinions);

        lastTable = table.result;
        lastMaxLiability = table.maxLiability;

        const choice = await ask("Enter 1 for Above or 2 for Below (or 'exit' to quit): ");
        if (choice.toLowerCase() === 'exit') break;

        const condition = choice === '1' ? 'Above' : choice === '2' ? 'Below' : null;
        if (!condition) {
            console.log("Invalid choice. Please enter 1 or 2.\n");
            continue;
        }

        const value = parseFloat(await ask("Enter value (number): "));
        const amount = parseFloat(await ask("Enter amount (number): "));

        if (isNaN(value) || isNaN(amount)) {
            console.log("Invalid value or amount. Try again.\n");
            continue;
        }

        const newOpinion = { condition, value, amount };
        opinions.push(newOpinion);
    }

    rl.close();
}

main();



// [-inf 100]= -400 [100 inf]=400

// below 150 300

// [-inf 150] = 300 [150 inf] = -300 

// [-inf 100]=-100 , [100 150] = 700 , [150 inf] = 100