package TestCases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BusinessLibrary.DemoBusiness;
import BusinessLibrary.HomePageBusiness;
import GenericLibrary.BaseClass;
import GenericWindowLibrary.WindowHandle;

public class DemoTestCases extends BaseClass{

		@BeforeMethod
		public void GearUp() {
			LaunchBrowser("Chrome");
			OpenUrl("https://phptravels.com");
			implicitWait();
		}
		
		@Test (description = "Demo Register Form")
		public void DemoRegister() {
			HomePageBusiness.ClickOnDemo();
			DemoBusiness.EnterFirstName("Somesh");
			DemoBusiness.EnterLastName("Prajapati");
			DemoBusiness.EnterEmail("prajapatiDemo123@gmail.com");
			DemoBusiness.EnteBusinessname("BitTorrDroid");
			DemoBusiness.CaptchaSubmit();
			ElementClickable(DemoBusiness.SubmitButton());
			DemoBusiness.SubmitDemo();
			if (DemoBusiness.SuccessAlert()) {
				System.out.println("Validated");
			} else {
				System.out.println("Failed");
			}
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
}
