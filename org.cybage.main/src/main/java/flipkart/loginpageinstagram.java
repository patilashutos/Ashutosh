package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageinstagram {
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement entermobno;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement enterpass;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement clickonloginbutton;
	
	public loginpageinstagram(WebDriver driver){
		PageFactory.initElements(driver,this);}
	
	public void EnterMob() {
    entermobno.sendKeys("9049776629");	}
	
	public void EnterPass() {
	enterpass.sendKeys("Ashutosh@123");}
	
	public void clickLogin() {
	clickonloginbutton.click();
	}
	
}
