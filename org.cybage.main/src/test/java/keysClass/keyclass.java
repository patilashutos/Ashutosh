package keysClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@aria-label='Day']"));
	    
	    Actions A1=new Actions(driver);
	    A1.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(2000);
	    A1.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(2000);
	    A1.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(2000);
	    A1.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(2000);
	}

}
