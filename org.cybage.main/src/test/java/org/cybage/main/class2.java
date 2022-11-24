package org.cybage.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebook.facebooksignuppage;

public class class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	facebooksignuppage fb=new facebooksignuppage(driver);
	fb.button();
	Thread.sleep(2000);
	fb.enterfirstname();
	Thread.sleep(2000);
	fb.enterlastname();
	Thread.sleep(2000);
	fb.enterpass();
	Thread.sleep(2000);
	
	
	
	
	}}
