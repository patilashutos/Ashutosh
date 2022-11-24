package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocard {
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement Addcard;
	
	public addtocard (WebDriver driver){
		PageFactory.initElements(driver,this);}
	
	public void addC() {
		Addcard.click();
	}
	

}
