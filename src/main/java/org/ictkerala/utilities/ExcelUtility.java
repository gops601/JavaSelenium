package org.ictkerala.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static XSSFWorkbook excelWbook;
	private static XSSFSheet excelWSheet;
   

    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.

    public static String getCellData(int RowNum, int ColNum) throws IOException {
        
        // Open the Excel file
    	 FileInputStream ExcelFile = new FileInputStream("D:\\ST March\\saucedemolive\\src\\main\\resources\\testData.xlsx");
    	 excelWbook = new XSSFWorkbook(ExcelFile);
         excelWSheet = excelWbook.getSheetAt(0);
         return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
     }

}
