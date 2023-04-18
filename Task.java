package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./Driver/chromedriver.exe");
		
			ChromeDriver driver = new ChromeDriver();
		
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			driver.manage().window().maximize();
			
		
			
			WebElement we= driver.findElementById("iframeResult");
			driver.switchTo().frame(we);
		    WebElement we1= driver.findElementByXPath("//button[@onclick='myFunction()']");
			we1.click();
			Alert at= driver.switchTo().alert();
			at.accept();
			driver.switchTo().defaultContent();
			
			
	
	
	

}
}