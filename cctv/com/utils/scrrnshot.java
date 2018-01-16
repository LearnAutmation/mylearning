package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class scrrnshot {

	//WebDriver driver;
	
	public void screenshottaker(WebDriver driver) {
		
		/*login login1= new login();
		this.driver=login1.driver;	*/	
		//driver.manage().window().maximize();	 			 
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("E:\\Automation\\projects\\screeenshots\\PASS.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
		
	}
	
	
	
	
}
