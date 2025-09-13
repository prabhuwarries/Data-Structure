package OOPsRelatedQnA;

public class staticKeyword {
    public static class Counter {
        private static int count = 0; // Static variable to keep track of the count

        // Constructor increments the count each time a new object is created
        public Counter() {
            count++;
        }

        // Static method to get the current count
        public static int getCount() {
            return count;
        }
    }
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();
        System.out.println("Number of Counter objects created: " + Counter.getCount()); // Output: 5

    }
}

// In this example, the static variable count is shared among all instances of the Counter class.
// Each time a new Counter object is created, the constructor increments the count variable.
// The static method getCount() is used to retrieve the current value of the count variable.
// Since the count is static, it retains its value across all instances of the Counter class.
// When we create five Counter objects in the main method, the count variable is incremented to 5,
// and calling Counter.getCount() returns this value.