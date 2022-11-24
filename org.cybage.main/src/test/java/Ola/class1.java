package Ola;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class class1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		Thread.sleep(2000);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.olacabs.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//1111(Search Tab1)-------------------------------------------------------------------------------------------
	
	searchtab1 obj1=new searchtab1(driver);
	obj1.m11();
	Thread.sleep(2000);
	obj1.m12();
	Thread.sleep(2000);
	obj1.m13();
	Thread.sleep(2000);
	obj1.m14();
	Thread.sleep(2000);
	obj1.m15();
	
	//2222(Search Tab2)-----------------------------------------------------
	
	searchtab2 obj2=new searchtab2(driver);
	obj2.m21();
	Thread.sleep(2000);
	obj2.m22();
	Thread.sleep(2000);
	obj2.m23();
	Thread.sleep(2000);
	obj2.m24();
	Thread.sleep(2000);
	obj2.m25();
	Thread.sleep(2000);
    obj2.m26();
	Thread.sleep(2000);
	obj2.m27();
	Thread.sleep(2000);
	
	//3333(Ola Electrical)--------------------------------------------------------------------------
	
	olaelecrical obj3=new olaelecrical(driver);
	obj3.m31();
	Thread.sleep(2000);
	obj3.m32();
	Thread.sleep(2000);
	obj3.m33();
	Thread.sleep(2000);
	obj3.m34();
	Thread.sleep(2000);
	obj3.m35();
	Thread.sleep(2000);
	obj3.m36();
	Thread.sleep(2000);
	
	//4444(Ola support)-----------------------------------------------------------------------------------
	
	olasupport obj4=new olasupport(driver);
	obj4.m41();
	Thread.sleep(2000);
	obj4.m42();
	Thread.sleep(2000);
	obj4.m43();
	Thread.sleep(2000);
	obj4.m44();
	Thread.sleep(2000);
	obj4.m45();
	Thread.sleep(2000);
	obj4.m46();
	Thread.sleep(2000);

	//5555(scroll up-down)--------------------------------------------------------------------------------------------
	
	scrollupdown obj5=new scrollupdown(driver);
	obj5.m51();
	Thread.sleep(2000);
	
	obj5.m52();
	Thread.sleep(2000);
	
	obj5.m53();
	Thread.sleep(2000);
	
	obj5.m54();
	Thread.sleep(2000);
	
    //6666(Ola foundation)-----------------------------------------------------------------------------------------------
	
	olafoundation obj6=new olafoundation(driver);
	obj6.m61();
	Thread.sleep(2000);
	
	obj6.m62();
	Thread.sleep(2000);
	
	obj5.m53();
	Thread.sleep(2000);
	
	obj5.m53();
	Thread.sleep(2000);
	
	//7777(Close browser)-------------------------------------------------------------------------------------------------
	
    driver.quit();
    Thread.sleep(2000);}}


