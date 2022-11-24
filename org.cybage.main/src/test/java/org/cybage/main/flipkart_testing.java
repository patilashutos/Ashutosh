package org.cybage.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkart_testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		Thread.sleep(2000);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//a[text()='Login']")).click();
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9049776629");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashutosh@123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone13pro");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro (Gold, 1 TB)']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_32l7f0'][2])")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_1MM7ZD']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='_1w3ZZo O6YMOO _2mFmU7']")).sendKeys("Ashutosh");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@class='_1w3ZZo _2mFmU7'])[1]")).sendKeys("9049776629");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@class='_1w3ZZo _2mFmU7'])[2]")).sendKeys("416205");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@class='_1w3ZZo _2mFmU7'])[3]")).sendKeys("Patil galli");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//textarea[@class='_1sQQBU _1w3ZZo _1TO48q']")).sendKeys("At post-Panhala  city-Kolhapur");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@class='_1w3ZZo _2mFmU7'])[5]")).sendKeys("Kolhapur");
	Thread.sleep(2000);
	
	WebElement state=driver.findElement(By.xpath("//select[@class='_1EDlbo _1lRtwc jE2jGc _2gIrb5']"));
	Select s1=new Select(state);
	s1.selectByValue("Maharashtra");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@class='_1w3ZZo _2mFmU7'])[6]")).sendKeys("Panhala fort");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='alternatePhone']")).sendKeys("9975383481");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _1JDhFS _3AWRsL']")).click();
	Thread.sleep(2000);
	
}}
