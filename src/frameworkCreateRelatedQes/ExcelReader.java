package frameworkCreateRelatedQes;
//import org.apache.poi.ss.usermodel.*;

import jdk.internal.access.JavaNetUriAccess;

import java.io.FileInputStream;

public class ExcelReader {
    public static <Workbook> String getCellData(String file, String sheet, int row, int col) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        // Use Apache POI to read the Excel file
        // For demonstration, returning a dummy value
        JavaNetUriAccess WorkbookFactory = null;
//        Workbook workbook = (Workbook) WorkbookFactory.create(fis);
//        return wb.getSheet(sheet).getRow(row).getCell(col).toString();

//        Sheet sheetObj = workbook.getSheet(sheet);
//        Row rowObj = sheetObj.getRow(row);
//        Cell cell = rowObj.getCell(col);
//        String cellData = cell.getStringCellValue();
//        return  wb.getsheet(sheet).getRow(row).getCell(col).getStringCellValue();

//        workbook.close();
        fis.close();
        return "DummyData"; // Replace with actual cell data

    }
    public static void main(String[] args) throws Exception {
        String value = getCellData("TestData.xlsx", "Sheet1", 1, 0);
        System.out.println("Data: " + value);
    }


    }
