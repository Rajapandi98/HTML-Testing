package org.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNg{
//	//This Is Independent method so It will be executed.
//	@Test(priority=1)
//	public void Login() {
//	System.out.println("LogIn Test code.");
//	//Bellow give assertion will fail to fail Login() method Intentionally.
//	Assert.assertTrue(7>6, "Condition Is false.");
//	} 
//
//	//This method Is depends on Login method.
//	//This method's execution will be skipped from execution because Login() method will fail.
//
//	@Test(priority=2, dependsOnMethods={"Login"},alwaysRun=true) //,alwaysRun=true
//	public void checkMail() {
//	System.out.println("checkMail Test code."); 
//	}
//
//	//This method Is depends on Login and checkMail methods.
//	//This method's execution will be skipped from execution because Login() method will fail.
//	@Test(priority=3,dependsOnMethods={"Login","checkMail"})
//	public void LogOut() {
//	System.out.println("LogOut Test code."); 
//	}
//
//	//This Is Independent method so It will be executed.
//	@Test(priority=4)
//	public void checkLogInValidations() {
//	System.out.println("checkLogInValidations Test code."); 
//	}
	
                       //	Threadpool Size//
	
	
	          @Test(invocationCount=4,threadPoolSize=4)   
	          public void f() throws InterruptedException {    
	        	//  System.out.println("Thread pool size");      

	  	     	System.setProperty("webdriver.chrome.driver", 
	  				"./Driver/chromedriver.exe");
  			   ChromeDriver driver = new ChromeDriver();
	          driver.get("http://www.google.com");      
	          Thread.sleep(3000);         
	          driver.manage().window().maximize(); 
	          
	          driver.close();  
	          }
	}



