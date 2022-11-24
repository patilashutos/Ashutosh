package cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Matchresults {
  @FindBy(xpath="(//div[@class='cb-ovr-flo'])[2]")
  private WebElement result;
  
  public Homepage_Matchresults(WebDriver driver){
	  PageFactory.initElements(driver, this);}
  
  public void m4() {
	  result.click();
  }
  
}
