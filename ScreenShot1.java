package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ScreenShot1
{
//	public static void main(String[] args) throws IOException{
//		
//		System.setProperty("webdriver.chrome.driver", 
//				"./Driver/chromedriver.exe");
//			ChromeDriver driver = new ChromeDriver();
//	
//	  driver.get("https://www.google.com/");
//    driver.manage().window().maximize();
	 TakeScreenshot tk =(TakeScreenshot) driver;
//    
//    ExtentReports suite = new ExtentReports("./Snap/automationdemoWithScreen.html");
//    
//    ExtentTest test = suite.startTest("Login Test case", "This is used to enter into login page");
//    
//    File src = driver.getScreenshotAs(OutputType.FILE);
//    File dest = new File("./Snap/pic/snap1.jpg");
//    FileUtils.copyFile(src, dest);
//    
//    test.log(LogStatus.PASS, "Username Entered successfully");
//    test.log(LogStatus.PASS, "Password Entered successfully");
//    
//    test.log(LogStatus.FAIL, "Login button not working");
//    
//    suite.endTest(test);
//    suite.flush();
//
//}
//	
	
	@Test
	public void TestMethod() {
		System.out.println("first test");
	}
	
	@Test
	
	public void TestMethod1() {
	System.out.println("test two");
	}
	
}