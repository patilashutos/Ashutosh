package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chageaddress {
   @FindBy(xpath="//button[@class='_32l7f0'][2])")
   private WebElement changeA;
   
   @FindBy(xpath="//button[@class='_1MM7ZD']")
   private WebElement ChangeB;
   
   public chageaddress(WebDriver driver){
	   PageFactory.initElements(driver, this);}
   
   public void Change1() {
	   changeA.click();}

   public void Change2() {
	   ChangeB.click();
	   
   }
   
   
   }
   

