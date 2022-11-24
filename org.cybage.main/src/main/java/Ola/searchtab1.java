package Ola;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class searchtab1 {
	@FindBy(xpath="//div [@class='middle h-full text value']")
	WebElement search11;

	@FindBy(xpath="//div [@class='middle h-full text placeholder']")
	WebElement search12;
	
	@FindBy(xpath="//select[@class='ola-select']")
	WebElement select11;
	
	@FindBy(xpath="//select[@id='datepicker']")
	WebElement select12;
	
	@FindBy(xpath="(//button[@class='ow-button ow-button--secondary'])")
	WebElement click11;

	searchtab1(WebDriver driver){
	  PageFactory.initElements(driver, this);}
	
	public void m11() {
		search11.sendKeys("Panhala");}
	
	public void m12() {
		search12.sendKeys("Kolhapur");}
	
	public void m13() {
	Select s1=new Select(select12);
	s1.selectByIndex(1);}
	
	public void m14() {
		Select s2=new Select(select12);
		s2.selectByValue("Tomorrow");}
	
	public void m15() {
		click11.click();}}
	
		
	
	

	
	


