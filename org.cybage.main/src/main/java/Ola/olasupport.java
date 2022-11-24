package Ola;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class olasupport {
	@FindBy(xpath="//a[@event-name='desktop_top_menu_support']")
	WebElement click41;
	
	@FindBy(xpath="a[text()='How to create an Ola account?']")
	WebElement click42;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement click43;
	
   private WebDriver driver;
	
	olasupport(WebDriver driver){
		PageFactory.initElements(driver, this);}
	
	public void m41() {
		click41.click();}
	
	public void m42() {
		click42.click();}

	public void m43() {
		Actions act=new Actions(driver);
		act.doubleClick(click43);}
	
	Navigation NV3=driver.navigate();
	public void m44() {
		NV3.back();}
	
	public void m45() {
		NV3.back();}
	
	public void m46() {
		NV3.back();}}
	
		
		
	
	

	

