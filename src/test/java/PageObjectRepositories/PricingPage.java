package PageObjectRepositories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BaseClass;

public class PricingPage extends BaseClass {
	
	@FindBy (xpath = "//input[@id='company-fb5550d8-09b3-42c6-aed0-6e7f5ad60f43' ]")
	private WebElement CompanyName;
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement Email; 

	@FindBy (xpath = "//input[@name='phone']")
	private WebElement Phone; 

	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement FirstName; 

	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement LastName; 
	
	@FindBy (xpath = "//select[@name='budget']")
	private WebElement Budget; 

	@FindBy (xpath = "//input[@name='start_date']")
	private WebElement StartDate; 

	@FindBy (xpath = "//textarea[@name='message']")
	private WebElement Message;
	
	@FindBy (xpath = "//div[@class='actions']/input")
	private WebElement Submitbutton;
	
	private String SubmitButton = "//div[@class='actions']/input";
	
	@FindBy (xpath = "//iframe[@class='hs-form-iframe']")
	private WebElement Iframe1;
	
	@FindBy (xpath = "//h1[@id='h1']/strong")
	private WebElement SuccesText;
	
	
	public String SubmitButton() {
		return SubmitButton;
	}
	
	public WebElement SwitchFrame() {
		return Iframe1;
	}
	
	public void EnterComapnyName(String string) {
		CompanyName.sendKeys(string);
	}
	
	public void EnterEmail(String string) {
		Email.sendKeys(string);
	}
	
	public void EnterWhatsAppPhone(String string) {
		Phone.sendKeys(string);
	}
	
	public void EnterFirstName(String string) {
		FirstName.sendKeys(string);
	}
	
	public void EnterLastName(String string) {
		LastName.sendKeys(string);
	}
	
	
	public void SelectBudget(String string) {
		SelectByVisibleText(Budget,"$"+string+" >");
	}
	
	public void EnterStartDate(String date,String month,String year) {
		StartDate.sendKeys(date+"/"+month+"/"+year);
	}
	
	public void EnterMessage(String string) {
		Message.sendKeys(string);
	}
	
	public void ClickSubmit() {
		Submitbutton.click();
	}
	
	public WebElement ClickButton() {
		return Submitbutton;
	}
	
	public WebElement DataInsertionAlert() {
		return SuccesText;
	}

}
