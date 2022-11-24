package instagram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signuppage {
    
	@FindBy(xpath="//input[@aria-label='Mobile Number or Email']")
	private WebElement entermobileno;
	
	@FindBy(xpath="//input[@aria-label='Full Name']")
	private WebElement enterfullname;
	
	@FindBy(xpath="//input[@aria-label='Username']")
	private WebElement enterusername;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement enterpassword;
	
	@FindBy(xpath="//button[@class='sqdOP yWX7d     _8A5w5    ']")
	private WebElement clickonshowpass;


   public void enterM() {
	   entermobileno.sendKeys("1234567890");}
   
   public void enterFN() {
	   enterfullname.sendKeys("ABC");}
   
   public void enterUN() {
	   enterusername.sendKeys("abc123");}
   
   public void enterPass() {
	   enterpassword.sendKeys("abc@123");}
   
   public void clickonSP() {
	   clickonshowpass.click();
   }
	   
	
	
	
	
}
