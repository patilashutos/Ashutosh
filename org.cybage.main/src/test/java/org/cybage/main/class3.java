package org.cybage.main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import popups.alertpopup;

public class class3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	
	alertpopup A1=new alertpopup(driver);
	
	Alert AL=driver.switchTo().alert();
    AL.accept();
	//AL.dismiss();
	//AL.getText();
	//AL.sendKeys("cancel this pop up");
	
	
}}
