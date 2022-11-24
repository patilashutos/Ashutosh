package org.cybage.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cricbuzz.Homepage_Matchresults;
import cricbuzz.Homepage_dropdowns;
import cricbuzz.Homepage_searchplayer;
import cricbuzz.Loginpage;

public class TestNG_cricbuzz {
	WebDriver driver;
	Homepage_dropdowns HD;
	Homepage_Matchresults MR;
	Homepage_searchplayer SP;
	Loginpage  Login;
	Navigation NV=driver.navigate();
    @BeforeClass
    public void m10() throws InterruptedException {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
  	    driver=new ChromeDriver();
  		driver.get("https://www.cricbuzz.com/");
  		Thread.sleep(5000);
  		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);}
    
    @BeforeMethod
    public void m11() throws InterruptedException  {
    	HD=new Homepage_dropdowns(driver);
    	HD.m1();
    	Thread.sleep(5000);
    	NV.back();}
    	
   @Test
    public void m12() throws InterruptedException{
    	HD=new Homepage_dropdowns(driver);
    	HD.m2();
    	Thread.sleep(5000);
    	NV.back();
    	HD.m3();
    	Thread.sleep(5000);
    	NV.back();
    	
        MR=new Homepage_Matchresults(driver);
    	MR.m4();
    	Thread.sleep(5000);
    	NV.back();
    	
    	SP=new Homepage_searchplayer(driver);
    	SP.m5();
    	Thread.sleep(5000);
    	NV.back();
    	
    	Login=new Loginpage(driver);
    	Login.m6();
    	Thread.sleep(5000);
    	Login.m7();
    	Thread.sleep(5000);
    	NV.back();}
    
    @AfterMethod
    public void m13() throws IOException, InterruptedException {
  	 File soure=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	 File Destination=new File("C:\\Users\\HP\\Desktop");
  	 FileHandler.copy(soure, Destination);
  	 Thread.sleep(5000);}
    
    @AfterClass
    public void m14() {
    	driver.close();
    	
    	
    	
    	
    
    	
    }
    
  		

}
