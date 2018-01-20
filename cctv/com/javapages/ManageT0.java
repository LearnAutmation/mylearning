
package javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class ManageT0 extends TestBase {

	WebDriver driver;
	
	//search t0 users 

	@FindBy(xpath = ".//*[@id='dvsearchT0user']/div[1]/fieldset/div[1]/input") @CacheLookup
	WebElement firstname;
	@FindBy(xpath = ".//*[@id='dvsearchT0user']/div[1]/fieldset/div[2]/input") @CacheLookup
	WebElement surname;
	@FindBy(xpath = ".//*[@id='dvsearchT0user']/div[1]/fieldset/div[3]/button") @CacheLookup
	WebElement searchbutton;
	@FindBy(xpath = ".//*[@id='archived']") @CacheLookup
	WebElement archivedcheck;
	@FindBy(xpath = ".//*[@id='RegistrationPanel']/div/h4/a") @CacheLookup
	WebElement manageuserslink;
	
	@FindBy(xpath = ".//*[@ng-show=\"grid.options.totalItems > 0\"]") @CacheLookup
	WebElement countOfSearchResults;
	
	// create t0 user field locators

	@FindBy(xpath = ".//*[@id='emailAddress']") @CacheLookup
	WebElement emailfield;
	@FindBy(xpath = ".//*[@id='surname']") @CacheLookup
	WebElement createt0surname;
	@FindBy(xpath = ".//*[@id='givenName']") @CacheLookup
	WebElement createt0givenname;
	@FindBy(xpath = ".//*[@id='phoneNumber']") @CacheLookup
	WebElement createt0phonenumber;
	@FindBy(xpath = ".//*[@id='empNumber']") @CacheLookup
	WebElement createt0empnumber;
	@FindBy(xpath = ".//*[@id='branchArea']") @CacheLookup
	WebElement createt0brancharea;
	@FindBy(xpath = ".//*[@id='btnsubmitT0']") @CacheLookup
	WebElement createnewt0submit;
	@FindBy(xpath = "//button[text()='Create New T0 Account']") @CacheLookup
	WebElement createnewt0button;
	@FindBy(xpath = ".//*[@id='userT0Msg']/div/div/div[1]/p") @CacheLookup
	WebElement successAlert;	
	@FindBy(xpath = ".//*[@id='userT0Msg']/div/div/div[2]/button") @CacheLookup
	WebElement successAlertOkButton;
	
	
	// edit t0 field locators
    @FindBy(xpath=".//*[@id='searchPanel']/div/h4/a") @CacheLookup WebElement EditMydetailsLink;
	@FindBy(xpath = ".//*[@value=\"Edit Profile\"]") @CacheLookup
	WebElement editdetails;
	@FindBy(xpath = ".//*[@id='RegistrationPanel']/div/h4/a") @CacheLookup
	WebElement ManageUsers;
	@FindBy(xpath = ".//*[@id='surname']") @CacheLookup
	WebElement surnameeditt0;
	@FindBy(xpath = ".//*[@id='givenName']") @CacheLookup
	WebElement givenName;
	@FindBy(xpath = ".//*[@id='phoneNumber']") @CacheLookup
	WebElement phonenumber;
	@FindBy(xpath = ".//*[@id='empNumber']") @CacheLookup
	WebElement empNumber;                          
	@FindBy(xpath = ".//*[@id='branchArea']") @CacheLookup
	WebElement branchArea;
	@FindBy(xpath = ".//*[@id='logout']/div/h4/a") @CacheLookup
	WebElement logout;
	@FindBy(xpath = ".//*[@id='dvupdateT0user']/div/div/div[2]/input[3]") @CacheLookup
	WebElement savechanges;
	@FindBy(xpath = ".//*[@id='dvupdateT0user']/div/div/div[1]/p[1]/strong") @CacheLookup
	WebElement savesuccess;

	// Search only archived T0 users fields

	@FindBy(xpath = ".//*[@id='archived']") @CacheLookup
	WebElement archivedcheckbox;

	public ManageT0(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void editt0details(String string, String string2, String string3, String string4, String string5) {
		
		log.info("****************Started editing t0****************");
		click(EditMydetailsLink);
		click(editdetails);
	    sendKeys(surnameeditt0,string);
		sendKeys(givenName,string2);
		sendKeys(phonenumber,string3);
		sendKeys(empNumber,string4);
		sendKeys(branchArea,string5);
		click(savechanges);
		log.info("****************editing t0 done****************");
		

	}

	public void searchT0Users(String Firstname, String Lastname) throws Exception {
		log.info("****************Search T0 started ****************");
	    click(manageuserslink);
		sendKeys(firstname,Firstname);
		sendKeys(surname,Lastname);
		click(searchbutton);
		getText(countOfSearchResults);
		log.info("****************Search T0 finished ****************");

	}

	public void searchOnlyArchivedT0Users() {
		
		
		click(manageuserslink);
		click(archivedcheckbox);
		click(searchbutton);
		
	}

	public void creatingt0user(String string11, String string222, String string333, String string444) throws Exception {

		log.info("****************Create T0 started****************");
		click(manageuserslink);
		Thread.sleep(3000);
		click(createnewt0button);
		sendKeys(emailfield,string11);
		sendKeys(createt0surname,string222);
		sendKeys(createt0givenname,string333);
		sendKeys(createt0phonenumber,string444);
		click(createnewt0submit);
		Thread.sleep(3000);
		getText(successAlert);
		click(successAlertOkButton);
			
		log.info("****************Create T0 finished****************");

	}

	public void moveToT1Tab() {

	}

}