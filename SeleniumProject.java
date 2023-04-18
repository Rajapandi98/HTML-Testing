package org.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumProject {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"./Driver/chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
	
		
		driver.get("file:///C:/Users/Windows/Desktop/controls.html");
		driver.manage().window().maximize();
		
		 WebElement frst=driver.findElementByName("firstname");
		 WebElement lst=driver.findElementByName("lastname");
		 frst.sendKeys("raj");
		 lst.sendKeys("p");
		 
		 WebElement rdo=driver.findElementByXPath("//input[@value='female']");
	     rdo.click();
		 
		 WebElement frst1=driver.findElementByXPath("/html/body/form[3]/input[1]");
		 WebElement lst1=driver.findElementByXPath("/html/body/form[3]/input[2]");
		 frst1.sendKeys("kumar");
		 lst1.sendKeys("kavi");
		 
		 WebElement slt = driver.findElementByName("cars");
		 Select st=new Select (slt);
		 st.selectByVisibleText("Fiat");
		 
		 WebElement txt = driver.findElementByName("message");
		 txt.sendKeys("hello world");
		 
		 WebElement txt1=driver.findElementByXPath("/html/body/form[9]/textarea"); 
		 txt1.sendKeys("hi there");
		 
		 
		 WebElement clk=driver.findElementByXPath("/html/body/button");
		 clk.click();
		  Alert at= driver.switchTo().alert();
		 at.accept();
		 
		
		 
		 WebElement cik = driver.findElementByName("vehicle1");
		 cik.click();
		 
		 WebElement email = driver.findElementByName("email");
		 email.sendKeys("raj2344@gmail.com");
		 
		 
		 WebElement value = driver.findElementByName("quantity");
		 value.sendKeys("40");
		 
		 WebElement search = driver.findElementByName("googlesearch");
		 search.sendKeys("Amazon.com");
		 
		 
		 WebElement Phone = driver.findElementByName("usrtel");
		 Phone.sendKeys("9876453423");
		 
		 WebElement Page = driver.findElementByName("homepage");
		 Page.sendKeys("facebook.com");
		 
		 WebElement ft = driver.findElementByName("fname");
		 ft.sendKeys("danial");
		 
		 
		 WebElement lt = driver.findElementByName("lname");
		 lt.sendKeys("MP");
		 

		 WebElement mail = driver.findElementByXPath("//input[@autocomplete='off']");
		 mail.sendKeys("danial1@gmail.com");
		 
		 WebElement ml = driver.findElementByName("user_email");
		 ml.sendKeys("vino23@gmail.com");
		 
	
		 
		
}
}