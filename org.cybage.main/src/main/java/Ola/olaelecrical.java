package Ola;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class olaelecrical {
	@FindBy(xpath="//a[@event-name='desktop_top_menu_ola_electric']")
	WebElement click31;
	
	@FindBy(xpath="//div[@class='HambergerMenu_hamberGerIcons__KvD8e']")
	WebElement click32;
	
	@FindBy(xpath="//div[text()='Design']")
	WebElement click33;
	
	private WebDriver driver;
	
    public olaelecrical(WebDriver driver){
    	PageFactory.initElements(driver,this);}
    
    public void m31() {
    	click31.click();}
    
    public void m32() {
    	click32.click();}
    
    public void m33() {
    	click33.click();}
    
    public void m34() throws IOException {
    	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File destination=new File("C:\\\\Users\\\\HP\\\\Desktop");
    	FileHandler.copy(source, destination);}
    
    Navigation NV2=driver.navigate();
     public void m35() {
    	NV2.back();}
    
    public void m36() {
    	NV2.back();}
    
    	
    }


