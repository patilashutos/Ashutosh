package Ola;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchtab2 {
	@FindBy(xpath="//button[text()='Continue']")
	WebElement click21;
	
	@FindBy(xpath="//a[@event-name='desktop_top_menu_book_now']")
	WebElement click22;
	
	@FindBy(xpath="//button[text()='Continue to next step']")
	WebElement click23;

	private WebDriver driver;

    public searchtab2(WebDriver driver){
  	  PageFactory.initElements(driver, this);}
    
    public void m21() {
    	click21.click();}
    
    public void m22() {
    Alert A1=driver.switchTo().alert();
	A1.accept();}
	
	public void m23() {
	String mainID=driver.getWindowHandle();
	driver.switchTo().window(mainID);}
	
    public void m24() {
    	click22.click();}
    
    public void m25() {
    	click23.click();}
    
    Navigation NV1=driver.navigate();
    public void m26() {
    	NV1.back();}
    
    public void m27() {
    	NV1.back();}}
    	
    
    
    
    
    
    
	
	
	

