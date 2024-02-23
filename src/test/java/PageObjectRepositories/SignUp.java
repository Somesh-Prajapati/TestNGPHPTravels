package PageObjectRepositories;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GenericLibrary.BaseClass;

public class SignUp extends BaseClass {

	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement Email;
	
	@FindBy (xpath = "//div[@class='selected-dial-code']")
	private WebElement DialCodeSelected;
	
	@FindBy (xpath = "//input[@name='phonenumber']")
	private WebElement PhoneNo;
	
	@FindBy (xpath = "//li[@class='country']")
	private List<WebElement> DialCodeList;
	
	@FindBy (xpath = "//input[@name='companyname']")
	private WebElement CompanyName;
	
	@FindBy (xpath = "//input[@name='address1']")
	private WebElement AddressLine1;
	
	@FindBy (xpath = "//input[@name='address2']")
	private WebElement AddressLine2;
	
	@FindBy (xpath = "//input[@name='city']")
	private WebElement City;
	
	@FindBy (xpath = "//input[@name='state']")
	private WebElement State;
	
	@FindBy (xpath = "//input[@name='postcode']")
	private WebElement PostCode;
	
	@FindBy (xpath = "//select[@name='country']")
	private WebElement Country;
	
	@FindBy (xpath = "//input[@id='customfield2']")
	private WebElement MobileNo;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy (xpath = "//input[@name='password2']")
	private WebElement ConfirmPassword;
	
	@FindBy (xpath = "//button[@data-targetfields='inputNewPassword1,inputNewPassword2']")
	private WebElement GeneratePasswordButton;
	
	@FindBy (xpath = "//span[@class='bootstrap-switch-handle-on bootstrap-switch-success']")
	private WebElement MailListCheckBox;
	
	@FindBy (xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement Captcha;
	
	@FindBy (xpath = "//input[@value='Register']")
	private WebElement Register;

	@FindBy (xpath = "//div[@class='alert alert-danger']//strong[text()='The following errors occurred:']")
	private WebElement ErrorTextValidation;	
	
	public void EnterFirstName(String string) {
		FirstName.sendKeys(string);
	}
	
	public String ErrorTextValidation() {
		return ErrorTextValidation.getText();
	}
	
	public void EnterLastName(String string) {
		LastName.sendKeys(string);
	}
	
	public void EnterEmail(String string) {
		Email.sendKeys(string);
	}

	public void EnterPhoneNo(String string) {
		PhoneNo.sendKeys(string);
	}
	
	public void EnterCompanyName(String string) {
		CompanyName.sendKeys(string);
	}
	
	
	public void EnterStreetAddress(String string) {
		AddressLine1.sendKeys(string);
	}
	

	public void EnterStreetAddress2(String string) {
		AddressLine2.sendKeys(string);
	}
	

	public void EnterCity(String string) {
		City.sendKeys(string);
	}
	
	public void EnterState(String string) {
		State.sendKeys(string);
	}
	
	public void EnterPostCode(String string) {
		PostCode.sendKeys(string);
	}
	
	public void EnterMobileNo(String string) {
		MobileNo.sendKeys(string);
	}
	
	public void EnterPassword(String string) {
		Password.sendKeys(string);
	}
	
	public void EnterConfirmPassword(String string) {
		ConfirmPassword.sendKeys(string);
	}
	
	public void AutoGeneratePassword() {
		GeneratePasswordButton.click();
	}
	
	public void MailListCheckbox() {
		MailListCheckBox.click();
	}
	
	public void CaptchaVerify() {
		Captcha.click();
	}
	
	public void RegisterButton() {
		Register.click();
	}
	
	
	public void EnterCountryName(String string) {
		SelectByVisibleText(Country,string);
	}
	
	
	public void EnterCountryCode(String string) throws InterruptedException {
		DialCodeSelected.click();
		List<WebElement> CodeList = DialCodeList;
		for (int i = 0; i < CodeList.size(); i++) {
			String code = CodeList.get(i).getAttribute("data-dial-code");
			if(code.equalsIgnoreCase(string)) {
				CodeList.get(i).click();
				break;
			}
		}
	}
	
//li[@class='country']/div/following-sibling::span[contains(text(),'India')] - > Code Country List By Visible Text

	
}
