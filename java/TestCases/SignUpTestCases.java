package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BusinessLibrary.HomePageBusiness;
import BusinessLibrary.SignUpPageBusiness;
import GenericLibrary.BaseClass;
import GenericWindowLibrary.WindowHandle;


public class SignUpTestCases extends BaseClass{	
	
	@BeforeMethod
	public void GearUp() {
		LaunchBrowser("Chrome");
		OpenUrl("https://phptravels.com");

	}
	
	@Test (description = "Testing For Personal Information Validation")
	public void Personalnformation() throws InterruptedException {
		implicitWait();
		HomePageBusiness.ClickOnSignUp();
		WindowHandle.NavigateToLastWindow();
		SignUpPageBusiness.EnterFirstName("Ramesh");
		SignUpPageBusiness.EnterLastName("Paliwal");
		SignUpPageBusiness.EnterEmail("Demo@123.com");
		SignUpPageBusiness.EnterCountryCode("91");
		SignUpPageBusiness.EnterPhoneNo("1234567890");
		SignUpPageBusiness.EnterCompanyName("Bitsquad");
		SignUpPageBusiness.EnterStreetAddress("Indargarh");
		SignUpPageBusiness.EnterStreetAddress2("Indargarh");
		SignUpPageBusiness.EnterCity("Dewas");
		SignUpPageBusiness.EnterState("Madhya Pradesh");
		SignUpPageBusiness.EnterPostCode("452001");
		SignUpPageBusiness.EnterCountryName("India");
		SignUpPageBusiness.EnterMobileNo("1236547890");
		SignUpPageBusiness.RegisterButton();
		Assert.assertEquals(SignUpPageBusiness.ErrorTextValidation(),"The following errors occurred:","This Is Correct Error Message");	
	}
		
	@Test (description = "Testing For Title Validation")
	public void titleValidation() {
		HomePageBusiness.ClickOnSignUp();
		WindowHandle.NavigateToLastWindow();
		Assert.assertEquals(driver.getTitle(),"Register - PHPTRAVELS","This Is Correct");
	}
	
	@Test (description = "Testing For URL Validation")
	public void URLValidation() {
		HomePageBusiness.ClickOnSignUp();
		WindowHandle.NavigateToLastWindow();
		Assert.assertEquals(driver.getCurrentUrl(),"https://phptravels.org/register.php","This Is Correct Url");
	}
	
	
}
