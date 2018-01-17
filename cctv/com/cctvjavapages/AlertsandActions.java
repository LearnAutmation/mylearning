package cctvjavapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class AlertsandActions extends TestBase {
	
	//Alerts and actions page elements
	
	@FindBy(xpath=".//*[@href=\"/Alert/Alerts\"]") @CacheLookup WebElement AlertsLink;
	@FindBy(xpath=".//*[@id='regtypeselect']") @CacheLookup WebElement AlertTypeDropDown;
	@FindBy(xpath=".//*[@id='dateP']/i") @CacheLookup WebElement fromDateCalIcon;
	@FindBy(xpath="html/body/div[1]/div[1]/table/tbody/tr[3]/td[3]") @CacheLookup WebElement dateFromCalwindow;
	@FindBy(xpath=".//*[@id='alertAndAction']/div/form/div/div[4]/div/div/i") @CacheLookup WebElement toDateCalIcon;
	@FindBy(xpath="html/body/div[1]/div[1]/table/tbody/tr[3]/td[4]") @CacheLookup WebElement dateToCalWindow;
	
	
	
	@FindBy(xpath=".//*[@ng-click=\"GetSearchedAlerts(alertSearchDTO)\"]") @CacheLookup WebElement searchButton;
	@FindBy(css=".ui-grid-selection-row-header-buttons.ui-grid-icon-ok.ng-scope") @CacheLookup WebElement selectFirstActiveRec;
	@FindBy(xpath=".//*[@ng-click=\"ClickToSuppress(selectedRows,alertSearchDTO);\"]") @CacheLookup WebElement suppressButton;
	
	@FindBy(css=".btn.btnWidth.btnInline.btn-sm.btn-custom-blue") @CacheLookup WebElement oksuppress;
	@FindBy(xpath=".//*[@id='confirm']/div/p") @CacheLookup WebElement suppressAlertPopUpText;
	
	
	public AlertsandActions() {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void alertAndActions() throws Exception {
		
		try {
		
		click(AlertsLink);
		Thread.sleep(12000);
		select("All",AlertTypeDropDown);
		Thread.sleep(7000);
		click(fromDateCalIcon);
		Thread.sleep(4000);
		click(dateFromCalwindow);
	    click(toDateCalIcon);
	    click(dateToCalWindow);
	    click(searchButton);
	    Thread.sleep(14000);
	    click(selectFirstActiveRec);
	    click(suppressButton);
	    getText(suppressAlertPopUpText);
	    click(oksuppress);
	    
		}
		
		catch(Exception e) {
			
			System.out.println("Test Case failed");
			
		}
	    
	}
	
	
	
}
