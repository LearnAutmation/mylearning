
package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	@FindBy(xpath = "html/body/section/section/div/div/article/div/div[2]/a") @CacheLookup
	private WebElement acceptAndContinue;
	@FindBy(xpath = "html/body/section/div/section/div/form/div[2]/button[1]") @CacheLookup
	private WebElement loginbutton;
	@FindBy(xpath = ".//*[@id='cred_userid_inputtext']") @CacheLookup
	private WebElement userId;
	@FindBy(xpath = ".//*[@id='cred_password_inputtext']") @CacheLookup
	private WebElement password;
	@FindBy(xpath = ".//*[@id='cred_sign_in_button']") @CacheLookup
	private WebElement SignInButton;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void login(String username, String pwd) {

		click(acceptAndContinue);
		click(loginbutton);
		sendKeys(userId, username);
		sendKeys(password, pwd);
		click(SignInButton);

	}

}