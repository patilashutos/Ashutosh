package cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath="//span[@class='cb-plus-ico cb-user-icon']")
	private WebElement login;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	public Loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);}
		
		public void m6() {
			login.click();}
		
		public void m7() {
			email.sendKeys("dkedjed");}
		
	}
	


