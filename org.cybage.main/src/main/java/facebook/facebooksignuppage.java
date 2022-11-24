package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooksignuppage {
	@FindBy(xpath="(//a[@role='button'])[2]")
    private WebElement button;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement password;
	
	public facebooksignuppage(WebDriver driver){
		PageFactory.initElements(driver, this);}
	
	public void button() {
		button.click();}
		
	public void enterfirstname(){
		firstname.sendKeys("abc");}
	
	public void enterlastname(){
		lastname.sendKeys("xyz");}
	
	public void enterpass() {
		password.sendKeys("abc@xyz");
	
	
	}
		
		
		
	
}
