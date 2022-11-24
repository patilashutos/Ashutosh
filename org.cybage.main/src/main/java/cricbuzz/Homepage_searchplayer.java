package cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_searchplayer {
 @FindBy(xpath="//span[@class='cb-ico cb-search-input-icon cb-search-input-icon-nav']")
 private WebElement player;
 
 public Homepage_searchplayer(WebDriver driver){
	 PageFactory.initElements(driver,this);}
 
 public void m5() {
	 player.sendKeys("Virat Kohli");
 }
 
}
