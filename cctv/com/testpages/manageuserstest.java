package testpages;

import org.testng.annotations.Test;

import cctvjavapages.manageusers;
import cctvjavapages.manageusersT1;
import utils.TestBase;

public class manageuserstest extends TestBase {

	@Test(priority = 1)
	public void editt0test() throws Exception {

		Thread.sleep(4000);
		manageusers manage = new manageusers(driver);
		manage.editt0details("alok", "Rai", "1234555555", "1235555544", "ADM");

		/*
		 * String fileName = new Object() { }.getClass().getEnclosingMethod().getName();
		 * screenshot screen = new screenshot(); screen.screenshottaker(fileName,
		 * driver);
		 */

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

	@Test(priority = 4)
	public void uploadT2users() throws Exception {
		manageusersT1 manage = new manageusersT1();
		manage.uploadT2();

	}

	@Test(priority = 5)
	public void creat1T1users() throws Exception {
		manageusersT1 manage = new manageusersT1();
		manage.creat1T1user("Federal Government", "Dell", "friend9831@gmail.com", "surname", "Given Name", "12345",
				"new Branch", "1234567899");

	}

	@Test(priority = 6)

	public void downloadT2uploadTemplate() throws InterruptedException {
		manageusersT1 manage = new manageusersT1();
		manage.downloadBulkT2UploadTemplate();

	}

}
