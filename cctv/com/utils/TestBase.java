package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase extends TestData {

	protected static WebDriver driver;

	protected final static Logger log = Logger.getLogger(TestBase.class.getName());

	/*
	 * String browserType = "firefox"; String appURL = "https://www.flipkart.com/";
	 */
	static String chromeDriverPath = "E:\\Automation\\chromedriver_win32\\";

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String appURL) throws FileNotFoundException, IOException {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}

		PropertyConfigurator.configure("log4j.properties");
		log.info("log4j setting done");

	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) throws FileNotFoundException, IOException {
		System.out.println("Launching Firefox browser..");
		log.info("log4j set");
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		return driver;
	}

	public void doLogin() throws InterruptedException {

		log.info("***********Started logging in **********");
		LoginPage login = new LoginPage();
		login.login(TestData.USER_NAME, TestData.PASSWORD);
		log.info("***********Logging in done *************");
	}

	public void select(String name, WebElement element) {

		Select s = new Select(element);
		s.selectByVisibleText(name);
		log.info("Selected element --" + name);

	}

	public void waitForVisibilityOfElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 9);
		try {

			wait.until(ExpectedConditions.visibilityOf(element));
		}

		catch (Exception e) {

			log.info(element + "not found" + e);
		}

	}

	public void click(WebElement element) {

		waitForVisibilityOfElement(element);
		element.click();
		log.info("Clicked element-- " + element.toString());

	}

	public void sendKeys(WebElement element, String keyword) {

		waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(keyword);

	}

	public boolean isElementDisplayed(WebElement element) {

		waitForVisibilityOfElement(element);
		return element.isDisplayed();

	}

	public String getText(WebElement element) {
		
		waitForVisibilityOfElement(element);
		element.getText();
		log.info("Element text is--" + element.getText());
		return element.getText();
		
		

	}

	@BeforeClass
	@Parameters({ "browserType", "appURL" })
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);
			doLogin();
		} catch (Exception e) {
			System.out.println("Error....." + e.getMessage());
		}

	}

	/*
	 * @AfterClass public void tearDown() { driver.quit(); }
	 */
	// TestListener already has screenshot method
	/*
	 * @AfterMethod public void takeScreenShotOnFailure(ITestResult testResult)
	 * throws IOException { if (testResult.getStatus() == ITestResult.FAILURE) {
	 * String failedTestName = testResult.getTestName(); File scrFile =
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(scrFile, new
	 * File(".\\screenshots\\"+failedTestName+".jpg")); }
	 */

}