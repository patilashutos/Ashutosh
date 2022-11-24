package Ola;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class olafoundation {
	@FindBy(xpath="//a[text()='Ola Foundation']")
	WebElement click61;
	
	@FindBy(xpath="//button[text()='Know More']")
	WebElement click62;
	
	olafoundation(WebDriver driver){
		PageFactory.initElements(driver,this);}
	
	private WebDriver driver;
	
	public void m61() {
		click61.click();}
	
	public void m62() {
		click62.click();}
	
    public void m63() {
    	Navigation NV6=driver.navigate();
    	NV6.back();}
		
	public void m64() {
		Navigation NV7=driver.navigate();
    	NV7.back();}}
		
		
	
	
	
		
