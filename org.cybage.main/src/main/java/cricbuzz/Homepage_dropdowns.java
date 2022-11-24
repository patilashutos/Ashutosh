package cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage_dropdowns {
  @FindBy(xpath="//div[@id='newsDropDown']")
  private WebElement newdropdown;
  
  @FindBy(xpath="teamDropDown")
  private WebElement team;
  
  @FindBy(xpath="//div[@id='rankingDropDown']")
  private WebElement ranking;
  
  public Homepage_dropdowns(WebDriver driver){
	  PageFactory.initElements(driver, this);}

  public void m1() {
	  Select s1=new Select(newdropdown);
	  s1.selectByValue("All Stories");}
  
  public void m2() {
	  Select s2=new Select(team);
	  s2.selectByValue("india");}
  
  public void m3() {
	  Select s3=new Select(ranking);
	  s3.selectByValue("ICC Rankings-Men");}
  
}
  
  
  
  

