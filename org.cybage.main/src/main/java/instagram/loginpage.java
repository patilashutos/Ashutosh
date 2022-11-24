package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(xpath="//span[text()='Sign up']")
	private WebElement signuppageclick;
	
	public loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);}
	
	public void clicksignup() {
		signuppageclick.click();
	}

	public void EnterMob() {
		// TODO Auto-generated method stub
		
	}
	

}
