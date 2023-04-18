package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", 
					"./Driver/chromedriver.exe");
			
				ChromeDriver driver = new ChromeDriver();
			
				
				driver.get("https://www.tutorialsteacher.com/codeeditor?cid=js-3");
				driver.manage().window().maximize();
//				driver.findElement(By.name("q")).sendKeys("accenture",Keys.ENTER);
				
//				driver.findElementByXPath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span").click();
				
				
//				driver.findElementByXPath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input").click();
				
				
//				driver.findElementByXPath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input").click();
				//  driver.findElementByXPath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input").click();
				
//				Alert alt=driver.switchTo().alert();
//				alt.sendKeys("raj");
//				
//				alt.accept();
				
				
//				frames
//			    WebElement frame = driver.findElementByClassName("demo-frame");
//			    driver.switchTo().frame(frame);
//				driver.findElementByXPath(" //*[@id=\"selectable\"]/li[4]").click();
//				driver.switchTo().defaultContent();
//				
				
				
//				 WebElement slt = driver.findElementByClassName("cars");
//				 Select st=new Select (slt);
//				 st.selectByVisibleText(" ");
//				
//				
//		
				
				
				
								
				
		
				
		}

		
	}


