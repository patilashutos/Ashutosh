package org.cybage.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import instagram.loginpage;
import instagram.signuppage;

public class class4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	loginpage Login=new loginpage(driver);
    Login.clicksignup();
    
    signuppage Sign=new signuppage();
    Sign.enterM();
    Thread.sleep(2000);
    Sign.enterFN();
    Thread.sleep(2000);
    Sign.enterUN();
    Thread.sleep(2000);
    Sign.enterPass();
    Thread.sleep(2000);
    Sign.clickonSP();
    Thread.sleep(2000);
    
    
    
	
	
	
	}}
	


