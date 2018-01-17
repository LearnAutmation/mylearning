package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelToDataProvider {
	
	public static void main(String[] args) {
		
		loginData();
		
	}
	
	
	@DataProvider(name="empLogin")
	public static Object[][] loginData() {
		Object[][] arrayObject = getExcelData("D:\\Users\\Alok\\gitnew\\cctv\\excelfile.xls","Sheet1");
		System.out.println(arrayObject);
		return arrayObject;
	}

	public static String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (BiffException e) {
			e.printStackTrace();
		}
		System.out.println(arrayExcelData);
		return arrayExcelData;
	}

}