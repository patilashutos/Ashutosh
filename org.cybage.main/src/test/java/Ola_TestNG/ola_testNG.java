package Ola_TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ola.olaelecrical;
import Ola.olafoundation;
import Ola.olasupport;
import Ola.scrollupdown;
import Ola.searchtab1;
import Ola.searchtab2;

public class ola_testNG {
	  WebDriver driver;
      searchtab1 ST1;
      searchtab2 ST2;
      olaelecrical OE;
      olasupport OS;
      scrollupdown SUD;
      olafoundation OF;
      Navigation NV=driver.navigate();
      
      @BeforeClass
       public void m71() throws InterruptedException {
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  	driver.get("https://www.olacabs.com/");
  	Thread.sleep(5000);
  	driver.manage().window().maximize();
  	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);}
      
      @BeforeMethod
      public void m72() throws InterruptedException {
      ST1.m11();
      Thread.sleep(5000);
      ST1.m12();
      Thread.sleep(5000);
      ST1.m13();
      Thread.sleep(5000);
      ST1.m14();
      Thread.sleep(5000);
      ST1.m15();
      Thread.sleep(5000);}
      
      @Test
      public void m73() throws InterruptedException {
      ST2.m21();
      Thread.sleep(5000);
      ST2.m22();
      Thread.sleep(5000);
      ST2.m23();
      Thread.sleep(5000);
      ST2.m24();
      Thread.sleep(5000);
      ST2.m25();
      Thread.sleep(5000);
      ST2.m26();
      Thread.sleep(5000);
      ST2.m27();
      Thread.sleep(5000);}
      
      public void m74() throws IOException, InterruptedException {
      OE.m31();
      Thread.sleep(5000);
      OE.m32();
      Thread.sleep(5000);
      OE.m33();
      Thread.sleep(5000);
      OE.m34();
      Thread.sleep(5000);
      OE.m35();
      Thread.sleep(5000);
      OE.m36();
      Thread.sleep(5000);}
      
      public void m75() throws InterruptedException {
      OS.m41();
      Thread.sleep(5000);
      OS.m42();
      Thread.sleep(5000);
      OS.m43();
      Thread.sleep(5000);
      OS.m44();
      Thread.sleep(5000);
      OS.m45();
      Thread.sleep(5000);
      OS.m46();
      Thread.sleep(5000);}
      
      public void m76() throws InterruptedException {
      SUD.m51();
      Thread.sleep(5000);
      SUD.m52();
      Thread.sleep(5000);
      SUD.m53();
      Thread.sleep(5000);
      SUD.m54();
      Thread.sleep(5000);}
      
      @AfterMethod
      public void m77() throws InterruptedException {
      OF.m61();
      Thread.sleep(5000);
      OF.m62();	 
      Thread.sleep(5000);
      OF.m63();	 
      Thread.sleep(5000);
      OF.m64();	 
      Thread.sleep(5000);}
      
      @AfterClass
      public void m78() {
      driver.close();}}
    	  
      
      
   
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

