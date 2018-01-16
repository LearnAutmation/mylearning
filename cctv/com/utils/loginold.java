/*package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginold {
	
	public static WebDriver driver;
	

	
	public void logincctv() throws IOException {
		
		System.out.println("login started from login class");
		
		System.setProperty("webdriver.gecko.driver", "E://Automation//geckodriver-v0.19.0-win64//geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E://Automation//CCTV//chromedriver_win32//chromedriver.exe");

		FileInputStream fis= new FileInputStream("E://Automation//projects//datadetails1");	
	
		
		Properties prop= new Properties();	
		prop.load(fis);
		prop.getProperty("browser");
		
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
		//driver= new ChromeDriver();
	    driver= new FirefoxDriver();
			
		}
		prop.getProperty("password");	
		
		System.out.println(prop.getProperty("login", "ALddddok"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.linkText("Accept & Continue")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);// 1 minute 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='deskShow']/button[1]")));
		
		driver.findElement(By.xpath("//div[@class='deskShow']/button[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='cred_userid_inputtext']")));

		driver.findElement(By.xpath(".//*[@id='cred_userid_inputtext']")).sendKeys(prop.getProperty("T0login", "ALok"));
		driver.findElement(By.xpath(".//*[@id='cred_password_inputtext']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(".//*[@id='cred_sign_in_button']")).click();
		//return driver;
				
		}
		
		
	}
	



*/