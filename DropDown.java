package org.test;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", 
				"./Driver/chromedriver.exe");
		
			ChromeDriver driver = new ChromeDriver();
		
			
			driver.get("https://www.irctc.co.in/nget/train-search");
			
         	driver.manage().window().maximize();
         	  
         //	Thread.sleep(1000);
//         	driver.findElementByXPath("//a[contains(text(),'BUSES')]").click();
//         	Set<String> winhandles =driver.getWindowHandles();
//         	System.out.println(winhandles.size());
//         	Thread.sleep(1000);
        	String parentwindow =driver.getWindowHandle();
         	System.out.println(parentwindow);
//         	
//         	
//         	int i =1;
//         	
//         	for(String winhandle: winhandles);
//         	{
//         		if(!parentwindow.equalsIgnoreCase(winhandle));
//         		{
//         		driver.switchTo().window(winhandle);
//         		  
//         	}
//         	i++;
//         	Thread.sleep(1000);
//         	driver.findElementByXPath("//a/span[contains(text(),'Tour Packages')]");
         	
         	
         	

            
            
           	
           	
           	
           	
           	

         	
}

}
