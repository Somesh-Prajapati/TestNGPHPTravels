package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;

import BusinessLibrary.HomePageBusiness;
import BusinessLibrary.SignUpPageBusiness;
import DataProvider.Resouces.DemoDataProvider;
import GenericLibrary.BaseClass;
import GenericLibrary.WindowHandle;

public class SignUpTestCases extends BaseClass{	
	
	
	@BeforeMethod
	public void GearUp() {
		LaunchBrowser("Chrome");
		OpenUrl("https://phptravels.com");
		implicitWait();
	}
	
	@Test(dataProvider = "register-data-provider", dataProviderClass = DemoDataProvider.class)
	public void Personalnformation(String firstname,String lastname,String email,String dialcode,String phoneno,String comapnyname,String street1,String street2,String city,String state,String pincode,String Country,String whatsapp,String password,String confirmpassword, String expected_text,String message) throws InterruptedException {
		implicitWait();
		HomePageBusiness.ClickOnSignUp();
		WindowHandle.NavigateToLastWindow();
		SignUpPageBusiness.EnterFirstName(firstname);
		SignUpPageBusiness.EnterLastName(lastname);
		SignUpPageBusiness.EnterEmail(email);
		SignUpPageBusiness.EnterCountryCode(dialcode);
		SignUpPageBusiness.EnterPhoneNo(phoneno);
		SignUpPageBusiness.EnterCompanyName(comapnyname);
		SignUpPageBusiness.EnterStreetAddress(street1);
		SignUpPageBusiness.EnterStreetAddress2(street2);
		SignUpPageBusiness.EnterCity(city);
		SignUpPageBusiness.EnterState(state);
		SignUpPageBusiness.EnterPostCode(pincode);
		SignUpPageBusiness.EnterCountryName(Country);
		SignUpPageBusiness.EnterMobileNo(whatsapp);
		SignUpPageBusiness.EnterPassword(password);
		SignUpPageBusiness.EnterPassword(confirmpassword);
		SignUpPageBusiness.MailListCheckbox();
		SignUpPageBusiness.RegisterButton();
		Assert.assertEquals(SignUpPageBusiness.ErrorTextValidation(),expected_text,message);	
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
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
