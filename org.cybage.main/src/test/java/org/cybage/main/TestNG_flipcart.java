package org.cybage.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flipkart.addtocard;
import flipkart.chageaddress;
import flipkart.fillupdeatils;
import flipkart.loginpageinstagram;
import flipkart.serachproduct;

public class TestNG_flipcart {
	WebDriver driver;
	loginpageinstagram login;
	 serachproduct search;
	 addtocard addC;
	 chageaddress CA;
	 fillupdeatils FullD;

      @BeforeClass
      public void m1() throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	    driver=new ChromeDriver();
    		driver.get("https://www.flipkart.com/");
    		Thread.sleep(5000);
    		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);}
    		
        @BeforeMethod
      public void m2() throws InterruptedException {
    	  login=new loginpageinstagram(driver);
    	  login.EnterMob();
    	  Thread.sleep(5000);
    	  login.EnterPass();
    	  Thread.sleep(5000);
    	  login.clickLogin();
    	  Thread.sleep(5000);}
      
      @Test
      public void m3() throws InterruptedException {
    	  search=new serachproduct(driver);
    	  search.Search1();
    	  Thread.sleep(5000);
    	  search.Search2();
    	  Thread.sleep(5000);
    	  search.search3();
    	  Thread.sleep(5000);
          
           addC=new addtocard(driver);
           addC.addC();
           Thread.sleep(5000);
           
           CA=new chageaddress(driver);
           CA.Change1();
           Thread.sleep(5000);
           CA.Change2();
           Thread.sleep(5000);
           
           FullD=new fillupdeatils(driver);
           FullD.FD1();
           Thread.sleep(5000);
           FullD.FD2();
           Thread.sleep(5000);
           FullD.FD3();
           Thread.sleep(5000);
           FullD.FD4();
           Thread.sleep(5000);
           FullD.FD5();
           Thread.sleep(5000);
           FullD.FD6();
           Thread.sleep(5000);
           FullD.FD7();
           Thread.sleep(5000);
           FullD.FD8();
           Thread.sleep(5000);}
           
        @AfterMethod
      public void m4() throws IOException, InterruptedException {
    	 File soure=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 File Destination=new File("C:\\Users\\HP\\Desktop");
    	 FileHandler.copy(soure, Destination);
    	 Thread.sleep(5000);}
      
      @AfterClass
      public void m5() throws InterruptedException {
    	  driver.close();
    	  Thread.sleep(5000);
      
      
      }
      
      
      }
    	  
      

