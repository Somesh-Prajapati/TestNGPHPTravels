package TestCases;
import org.testng.Assert;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import BusinessLibrary.DemoBusiness;
import BusinessLibrary.HomePageBusiness;
import DataProvider.Resouces.DemoDataProvider;
import GenericLibrary.BaseClass;

public class DemoTestCases extends BaseClass{
	
	
		@BeforeMethod
		public void GearUp() {
			LaunchBrowser("Chrome");
			OpenUrl("https://phptravels.com");
			implicitWait();
		}
		
		@Test(dataProvider = "demo-data-provider",dataProviderClass = DemoDataProvider.class)
		public void DemoRegister(String firstname, String lastName, String email, String CompanyName) throws InterruptedException {
			implicitWait();
			HomePageBusiness.ClickOnDemo();
			DemoBusiness.EnterFirstName(firstname);
			DemoBusiness.EnterLastName(lastName);
			DemoBusiness.EnterEmail(email);
			DemoBusiness.EnteBusinessname(CompanyName);
			DemoBusiness.CaptchaSubmit();
			ElementClickable(DemoBusiness.SubmitButton());
			DemoBusiness.SubmitDemo();
			Assert.assertEquals(DemoBusiness.SuccessAlert(), true);
		}
		
		@Test (description = "Testing For Title Validation")
		public void titleValidation() {
			HomePageBusiness.ClickOnDemo();
			Assert.assertEquals(driver.getTitle(),"Book Your Free Demo Now - Phptravels","This Is Correct");
		}
		
		
		@Test (description = "Testing For URL Validation")
		public void URLValidation() {
			HomePageBusiness.ClickOnDemo();
			Assert.assertEquals(driver.getCurrentUrl(),"https://phptravels.com/demo","This Is Correct Url");
		}
		
		
		@AfterMethod (description = "Browser Quit Method")
		public void teardown() {
			driver.quit();
		}
		
}
