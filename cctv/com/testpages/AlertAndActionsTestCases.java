package testpages;

import org.testng.annotations.Test;

import cctvjavapages.AlertsandActions;
import utils.TestBase;

public class AlertAndActionsTestCases extends TestBase {
	
	@Test
	
	public void searchAlerts() throws Exception {
		
		AlertsandActions action1= new AlertsandActions();
		
		action1.alertAndActions();
		
	}

}
