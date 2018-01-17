package testpages;

import org.testng.annotations.Test;

import cctvjavapages.manageusers;
import cctvjavapages.manageusersT1;
import utils.TestBase;

public class T1testCases extends TestBase {

	


	@Test(priority = 1)
	public void uploadT2users() throws Exception {
		manageusersT1 manage = new manageusersT1();
		manage.uploadT2();

	}

	@Test(priority = 2)
	public void creat1T1users() throws Exception {
		manageusersT1 manage = new manageusersT1();
		manage.creat1T1user("Federal Government", "Dell", "friend9831@gmail.com", "surname", "Given Name", "12345",
				"new Branch", "1234567899");

	}

	@Test(priority = 3)

	public void downloadT2uploadTemplate() throws InterruptedException {
		manageusersT1 manage = new manageusersT1();
		manage.downloadBulkT2UploadTemplate();

	}

}
