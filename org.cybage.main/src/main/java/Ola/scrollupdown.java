package Ola;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scrollupdown {
	@FindBy(xpath="//div[@class='indiv-fleet slick-slide slick-active']")
	WebElement scroll51;
	
	private WebDriver driver;
	
     scrollupdown(WebDriver driver){
	  PageFactory.initElements(driver, this);}
     
     public void m51() {
    	JavascriptExecutor J=(JavascriptExecutor)driver;
    	J.executeScript("window.scrollBy(0,2000)");}
    		
    public void m52() {
    JavascriptExecutor J2=(JavascriptExecutor)driver;
    J2.executeScript("window.scrollBy(0,2000)");}
    		
    public void m53() {
    	WebElement bike = null;
    	scroll51.click();
    	 JavascriptExecutor J3=(JavascriptExecutor)driver;
        J3.executeScript("arguments[0].scrollIntoView(true)",bike);}
    
    public void m54() {
    	Navigation NV4=driver.navigate();
    	NV4.refresh();}}
    	
    	
       
    
   
    		
    	 
     
	
	
	
	

