package PageObjectRepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage {
	
	@FindBy (xpath = "//input[@class='first_name form-control']")
	private WebElement FirstName;
	
	@FindBy (xpath = "//input[@class='last_name form-control']")
	private WebElement LastName; 

	@FindBy (xpath = "//input[@placeholder='Business Name']")
	private WebElement BusinessName; 

	@FindBy (xpath = "//input[@placeholder='Email']")
	private WebElement Email; 

	@FindBy (xpath = "//span[@id='numb1']")
	private WebElement CaptchaNum1; 
	
	@FindBy (xpath = "//span[@id='numb2']")
	private WebElement CaptchaNum2; 

	@FindBy (xpath = "//input[@placeholder='Result ?']")
	private WebElement CaptchaBox; 

	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement SubmitButton;
	
		
	public void EnterFirstName(String string) {
		FirstName.sendKeys(string);
	}
	
	public void EnterLastName(String string) {
		LastName.sendKeys(string);
	}
	
	public void EnteBusinessname(String string) {
		BusinessName.sendKeys(string);
	}
	public void EnterEmail(String string) {
		Email.sendKeys(string);
	}

	public void CaptchaSubmit() {
		String num1 = CaptchaNum1.getText();
		int a = Integer.parseInt(num1);
		String num2 = CaptchaNum2.getText();
		int b =  Integer.parseInt(num2);
		int c = a + b ;
		CaptchaBox.sendKeys(String.valueOf(c));
	}
	public WebElement submitbutton() {
		return SubmitButton;
	}
	public void SubmitDemo() {
		SubmitButton.click();
	}
	
}
