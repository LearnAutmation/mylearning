package testpages;

import org.testng.annotations.Test;

import javapages.ManageT1;
import utils.TestBase;

public class ManageT1Test extends TestBase {

	//public static ManageT1 manage = new ManageT1();
    

	@Test(priority = 4)
	public void uploadT2users() throws Exception {
		ManageT1 manage = new ManageT1();
		manage.uploadT2();

	}

	@Test(priority = 2)
	public void creat1T1users() throws Exception {
		ManageT1 manage = new ManageT1();
		manage.creat1T1user("Federal Government", "Dell", "friend9831@gmail.com", "surname", "Given Name", "12345",
				"new Branch", "1234567899");

	}

	@Test(priority = 3)

	public void downloadT2uploadTemplate() throws InterruptedException {
        ManageT1 manage = new ManageT1();
		manage.downloadBulkT2UploadTemplate();

	}

}
