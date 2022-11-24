package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alertpopup {
	@FindBy(xpath="//input[@type='submit']")
	private WebElement button;
	
	public alertpopup(WebDriver driver){
		PageFactory.initElements(driver,this);}
	
	public void clickon() {
		button.click();
		
	}
	
	

}
