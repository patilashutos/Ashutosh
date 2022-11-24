package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class selectclass {
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createnewaccount;
	
	@FindBy(xpath="//select[@aria-label='Day']")
	private WebElement day;
	
	public selectclass(WebDriver driver){
		PageFactory.initElements(driver,this);}
		
		public void m1() {
			createnewaccount.click();}
		
		
		public void m2() {
			Select s5=new Select(day);
			s5.selectByValue("20");
		
			
			
		}
	
	
	
	

}
