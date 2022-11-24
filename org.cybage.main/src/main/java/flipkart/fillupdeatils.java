package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fillupdeatils {
	@FindBy(xpath="//input[@class='_1w3ZZo O6YMOO _2mFmU7']")
	private WebElement addname;
	
	@FindBy(xpath="(//input[@class='_1w3ZZo _2mFmU7'])[1]")
	private WebElement c;

	@FindBy(xpath="(//input[@class='_1w3ZZo _2mFmU7'])[2]")
	private WebElement pincode;

	@FindBy(xpath="(//input[@class='_1w3ZZo _2mFmU7'])[3]")
	private WebElement address1;
	
    @FindBy(xpath="//textarea[@class='_1sQQBU _1w3ZZo _1TO48q']")
	private WebElement fulladdress;

	@FindBy(xpath="(//input[@class='_1w3ZZo _2mFmU7'])[5]")
	private WebElement city;

	@FindBy(xpath="(//input[@class='_1w3ZZo _2mFmU7'])[6]")
	private WebElement address2;
	
	@FindBy(xpath="//input[@name='alternatePhone']")
	private WebElement alternameno;
	
	public fillupdeatils(WebDriver driver){
		PageFactory.initElements(driver,this);}
	
	public void FD1() {
		addname.sendKeys("Ashutosh Patil");}
	
	public void FD2() {
		addname.sendKeys("9049776629");}
	
	public void FD3() {
		 pincode.sendKeys("416 205");}
	
	public void FD4() {
		address1.sendKeys("abc fgh ijk");}
	
	public void FD5() {
		 fulladdress.sendKeys("jdedkededmle");}
	
	public void FD6() {
		city.sendKeys("Kolhapur");}
	
	public void FD7() {
		 address2.sendKeys("wdh3id3jd3d");}
	
	public void FD8() {
		alternameno.sendKeys("2226788292");
		
	}}
	

	



