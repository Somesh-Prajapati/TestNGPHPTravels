package BusinessLibrary;

import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseClass;
import PageObjectRepositories.SignUp;

public class SignUpPageBusiness extends BaseClass {
	

	public static void EnterFirstName(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterFirstName(string);
	}
	
	public static void EnterLastName(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterLastName(string);
	}
	
	public static void EnterEmail(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterEmail(string);
	}

	public static  void EnterPhoneNo(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterPhoneNo(string);
	}
	
	public static  void EnterCompanyName(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterCompanyName(string);
	}
	
	
	public static  void EnterStreetAddress(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterStreetAddress(string);
	}
	
	public static void EnterStreetAddress2(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterStreetAddress2(string);
	}
	
	public static void EnterCity(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterCity(string);
	}
	
	public static  void EnterState(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterState(string);
	}
	
	public static void EnterPostCode(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterPostCode(string);
	}
	
	public static void EnterMobileNo(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterMobileNo(string);
	}
	
	public static String ErrorTextValidation() {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		return register.ErrorTextValidation();
	}
	
	public static void EnterPassword(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterPassword(string);
	}
	
	public static  void EnterConfirmPassword(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterConfirmPassword(string);
	}
	
	public static  void AutoGeneratePassword() {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.AutoGeneratePassword();
	}
	
	public static  void MailListCheckbox() {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.MailListCheckbox();
	}
	
	public static  void CaptchaVerify() {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.CaptchaVerify();
	}
	
	public static  void RegisterButton() {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.RegisterButton();
	}
	
	
	public static  void EnterCountryName(String string) {
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterCountryName(string);
	}
	
	public static  void EnterCountryCode(String string) throws InterruptedException{
		SignUp register = PageFactory.initElements(driver, SignUp.class);
		register.EnterCountryCode(string);
	}
	
}
