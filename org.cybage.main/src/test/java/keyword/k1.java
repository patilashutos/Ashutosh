package keyword;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class k1 {
	public static void main(String[] args) throws InterruptedException, IOException {
	 	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 		WebDriver driver=new ChromeDriver();
	 	    driver.get("https://www.flipkart.com/");
	 		Thread.sleep(2000);
	 		
	 		driver.manage().window().maximize();
	 		
	 		Actions a=new Actions(driver);
	 		a.sendKeys(Keys.ARROW_DOWN);
	 		

}}
