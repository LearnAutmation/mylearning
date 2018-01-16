/*package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.testng.annotations.Test;
 
 
public class ReadExcelFile {
	
 public static void main (String args[]) throws IOException {
  

  File src=new File("E:\\Automation\\projects\\locators.xlsx");
  
 
   System.out.println("reading file");
   // load file
   FileInputStream fis=new FileInputStream(src);
 


XSSFWorkbook workbook = new XSSFWorkbook (fis);

    //Get first sheet from the workbook
    XSSFSheet sh1 = workbook.getSheetAt(0);

  
  // getRow() specify which row we want to read.
 
  // and getCell() specify which column to read.
  // getStringCellValue() specify that we are reading String data.
 
 
 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
 
 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
 
 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
 
 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
 
 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
 
 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
 
 fis.close(); workbook.close();
 
  } 
  
 // return;
 }
 
*/