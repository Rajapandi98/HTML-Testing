package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertt {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./Driver/chromedriver.exe");
		
			ChromeDriver driver = new ChromeDriver();
		
			
			driver.get("https://www.tutorialsteacher.com/codeeditor?cid=js-3");
         	driver.manage().window().maximize();

			//--------------1------------------			
			
			
//			WebElement we= driver.findElementById("iframeResult");
//			driver.switchTo().frame(we);
//		    WebElement we1= driver.findElementByXPath("//button[@onclick='displayInfo()']");
//			we1.click();
//			Alert at= driver.switchTo().alert();
//			Thread.sleep(1000);
//			at.accept();
//			at.accept();
//			at.accept();
//			at.accept();
//			driver.switchTo().defaultContent();
			
			
			//  ----------------2---------------
			
			
//			WebElement we= driver.findElementById("iframeResult");
//			driver.switchTo().frame(we);
//		    WebElement we1= driver.findElementByXPath("//button [@onclick='save()']");
//			we1.click();
//			Alert at= driver.switchTo().alert();
//			Thread.sleep(1000);
//			at.dismiss();
//			driver.switchTo().defaultContent();
//			
			
			//---------------3-----------------
         	
         	WebElement we= driver.findElementById("iframeResult");
			driver.switchTo().frame(we);
		    WebElement we1= driver.findElementByXPath("//button[@onclick='myinput()']");
			we1.click();
			Alert at= driver.switchTo().alert();
			at.sendKeys("Rajapandi");
			at.accept();
			driver.switchTo().defaultContent();
			
	
			
			
			
			
}
}
