package testpages;

import org.testng.annotations.Test;

import javapages.ManageT0;
import utils.TestBase;

public class ManageT0Test extends TestBase{
	
	@Test(priority = 1)
	public void editt0test() throws Exception {

		Thread.sleep(4000);
		ManageT0 manage = new ManageT0(driver);
		manage.editt0details("alok", "Rai", "1234555555", "1235555544", "ADM");


	}

	@Test(priority = 2)
	public void searchT0users() throws Exception {
		Thread.sleep(2000);
		ManageT0 manage = new ManageT0(driver);
		manage.searchT0Users("alok", "rai");
		Thread.sleep(5000);
		//manage.searchOnlyArchivedT0Users();

	}
	

	@Test(priority = 3)
	public void creatingt0user1() throws Exception {

		Thread.sleep(2000);
		ManageT0 manage1 = new ManageT0(driver);
		manage1.creatingt0user("alok.rai@itcinfotech.com", "Alok", "Rai", "12345888888");

	}
	
	/*@DataProvider(name="empLogin")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("D:/sampledoc.xls","Sheet1");
		return arrayObject;
	}
	
	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			XSSFWorkbook workbook = new XSSFWorkbook (fs);
			//Get first sheet from the workbook
			XSSFSheet sh = workbook.getSheet(sheetName);
			
			
			int totalNoOfCols = sh.getLastRowNum();
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
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}*/

}
