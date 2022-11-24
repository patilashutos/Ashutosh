package org.cybage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipkart.addtocard;
import flipkart.chageaddress;
import flipkart.fillupdeatils;
import flipkart.loginpageinstagram;
import flipkart.serachproduct;
import instagram.loginpage;

public class flipkartclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		Thread.sleep(2000);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	 
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	loginpageinstagram Log1=new loginpageinstagram(driver);
	Log1.EnterMob();
	Log1.EnterPass();
	Log1.clickLogin();
	
    serachproduct Search=new serachproduct(driver);
	Search.Search1();
	Search.Search2();
	
	addtocard C1=new addtocard(driver);
	C1.addC();
	
	chageaddress C2=new chageaddress(driver);
	C2.Change1();
	C2.Change2();
	
	fillupdeatils F1=new fillupdeatils(driver);
	F1.FD1();
	F1.FD2();
	F1.FD3();
	F1.FD4();
	F1.FD5();
	F1.FD6();
	F1.FD7();
	F1.FD8();
	
	
	
	
	 
	
	

}}
