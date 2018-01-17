package testpages;

import org.testng.annotations.Test;

import cctvjavapages.manageusers;
import utils.TestBase;

public class T0testCases extends TestBase{
	
	@Test(priority = 1)
	public void editt0test() throws Exception {

		Thread.sleep(4000);
		manageusers manage = new manageusers(driver);
		manage.editt0details("alok", "Rai", "1234555555", "1235555544", "ADM");


	}

	@Test(priority = 2)
	public void searchT0users() throws Exception {
		Thread.sleep(2000);
		manageusers manage = new manageusers(driver);
		manage.searchT0Users("alok", "rai");
		Thread.sleep(5000);
		//manage.searchOnlyArchivedT0Users();

	}
	

	@Test(priority = 3)
	public void creatingt0user1() throws Exception {

		Thread.sleep(2000);
		manageusers manage1 = new manageusers(driver);
		manage1.creatingt0user("alok.rai@itcinfotech.com", "Alok", "Rai", "12345888888");

	}
}
