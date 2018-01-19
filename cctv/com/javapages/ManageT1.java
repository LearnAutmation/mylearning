package javapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class ManageT1 extends TestBase {

	// WebDriver driver;
	@FindBy(xpath = ".//*[@id='page-content-wrapper']/div/ul/li[2]/a") @CacheLookup
	WebElement clickT1Tab;
	@FindBy(xpath = ".//*[@id='btnsearchT']") @CacheLookup
	WebElement seatchT1Button;
	@FindBy(xpath = ".//*[@id='RegistrationPanel']/div/h4/a")
	WebElement manageUsersLink;
	@FindBy(xpath = ".//*[@id='orgType']") @CacheLookup
	WebElement OrgTypeDropdown;

	@FindBy(xpath = ".//*[@id='dvsearchT1user']/div[1]/fieldset/div[2]/input") @CacheLookup
	WebElement orgName;
	@FindBy(xpath = ".//*[@id='dvsearchT1user']/div[1]/fieldset/div[3]/input") @CacheLookup
	WebElement firstName;
	@FindBy(css = ".fa.fa-upload") @CacheLookup
	WebElement bulkUploadT2;
	@FindBy(xpath = ".//*[@id='uploadexcel']") @CacheLookup
	WebElement bulkUploadT2Selectfile;
	@FindBy(xpath = ".//*[@id='dvupload']/div[3]/button[1]") @CacheLookup
	WebElement finalUploadbutton;

	// create t1 user fields below
	@FindBy(xpath = ".//button[@id='btnCrateT1']") @CacheLookup
	WebElement createt1button;
	@FindBy(xpath = ".//*[@id='orgTypeT1']") @CacheLookup
	WebElement orgTypeDropDown;
	@FindBy(xpath = "//select[@id=\"orgNameT1\"]") @CacheLookup
	WebElement orgNameDropDown;
	@FindBy(xpath = "	.//*[@id=\"emailAddressT1\"]") @CacheLookup
	WebElement emailAddress;
	@FindBy(xpath = ".//*[@id='surnameT1']") @CacheLookup
	WebElement surName;
	@FindBy(xpath = ".//*[@id='givenNameT1']") @CacheLookup
	WebElement givenName;
	@FindBy(xpath = ".//*[@id='phoneNumberT1']") @CacheLookup
	WebElement phoneNumber;
	@FindBy(xpath = ".//*[@id='empNumberT1']") @CacheLookup
	WebElement empNo;
	@FindBy(xpath = ".//*[@id='branchAreaT1']") @CacheLookup
	WebElement branchAreaT1;
	@FindBy(xpath = ".//*[@id='cameraPermission1T1']") @CacheLookup
	WebElement accessToAllCamerasCheckBox;
	@FindBy(xpath = ".//*[@name=\"viewConnectedCamerasT1\"]") @CacheLookup
	WebElement viewConnectedCamerasCheckBox;
	@FindBy(xpath = ".//*[@id='btnsubmitT1']") @CacheLookup
	WebElement submitButton;
	@FindBy(xpath = ".//*[@id='userT1Msg']/div/div/div[1]/p") @CacheLookup
	WebElement userT1Msg;
	@FindBy(xpath = ".//*[@id='userT1Msg']/div/div/div[2]/button") @CacheLookup
	WebElement Successalert;
	@FindBy(xpath = ".//*[@id='uploadsuccess']/div/div/div[2]/button") @CacheLookup
	WebElement uploadsuccess;
	@FindBy(xpath = ".//*[@href='/Content/Excel/Bulk Upload Template for T2 User.xlsx']") @CacheLookup
	WebElement bulkuploadT2Template;
	
	
	
	public ManageT1() {
		PageFactory.initElements(driver, this);
	}

	public void uploadT2() throws Exception {
		log.info("******** T2 upload started *********");
		Thread.sleep(3000);
		click(manageUsersLink);
		//Thread.sleep(6000);
		click(clickT1Tab);
		//Thread.sleep(3000);
		click(seatchT1Button);
		Thread.sleep(3000);
		bulkUploadT2.click();
		log.info("Selecting upload file");
		Thread.sleep(3000);
		sendKeys(bulkUploadT2Selectfile, "E:\\t2upload\\T2.xlsx");
		click(finalUploadbutton);
		click(uploadsuccess);
		log.info("********T2 uploaded Successfully*******");

	}

	public void creat1T1user(String orgType, String orgName, String email, String SurName, String GivenName,
			String EmpNO, String branch, String phoneNo) throws InterruptedException {

		log.info("************Creating new T1 user**********");
		Thread.sleep(3000);
		click(manageUsersLink);
	//	Thread.sleep(3000);
		click(clickT1Tab);
		//Thread.sleep(2000);
		click(createt1button);
		Thread.sleep(4000);
		select(orgType, orgTypeDropDown);
		select(orgName, orgNameDropDown);
		sendKeys(emailAddress, email);
		sendKeys(surName, SurName);
		sendKeys(givenName, GivenName);
		sendKeys(empNo, EmpNO);
		sendKeys(branchAreaT1, branch);
		sendKeys(phoneNumber, phoneNo);
		click(accessToAllCamerasCheckBox);
		click(viewConnectedCamerasCheckBox);
		click(submitButton);
		Thread.sleep(4000);
		getText(userT1Msg);
		Thread.sleep(3000);
		click(Successalert);

		log.info("************New T1 user crrated**********");

	}
	
	public void downloadBulkT2UploadTemplate() throws InterruptedException {
		
		log.info("******* T2 template download started********");
		click(manageUsersLink);
		Thread.sleep(3000);
		click(clickT1Tab);
		click(bulkuploadT2Template);
		
		log.info("******* T2 template download finished********");
		
	}

}
