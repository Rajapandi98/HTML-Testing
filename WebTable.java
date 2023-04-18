package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver", 
			"./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
     	driver.manage().window().maximize();
     	
    WebElement table= 	driver.findElementById("customers");
   // table.getText();
    List<WebElement> row=table.findElements(By.tagName("tr"));
    System.out.println(row.size());
    List<WebElement> col=table.findElements(By.tagName("th"));
    System.out.println(col.size());
    
    System.out.println(col.get(0).getText());

}
}