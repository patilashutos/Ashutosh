package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser(String browser) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();} //Launch browser
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("WebDriver.firefox.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\firefox.exe");
			driver=new FirefoxDriver();}
		
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("WebDriver.IE.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\IE.exe");
			driver=new InternetExplorerDriver();}
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
	}
	


