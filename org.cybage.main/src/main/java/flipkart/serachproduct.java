package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class serachproduct {
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement searchpro;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement clickonsearch;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 13 Pro (Gold, 128 GB)']")
	private WebElement clickonproduct;
	
	public serachproduct(WebDriver driver){
		PageFactory.initElements(driver, this);}
	
	public void Search1() {
		searchpro.sendKeys("APPLE iPhone 13 Pro (Gold, 1 TB)");}
	
	public void Search2() {
		clickonsearch.click();}
	
	public void search3() {
		clickonproduct.click();
		
		
		
	}
	}
	


