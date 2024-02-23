package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BusinessLibrary.HomePageBusiness;
import GenericLibrary.BaseClass;

public class HomePageTestCases extends BaseClass{
	
	@BeforeMethod
	public void GearUp() {
		LaunchBrowser("Chrome");
		OpenUrl("https://phptravels.com/");
	}
	
	@Test
	public void SignUp() {
		HomePageBusiness.ClickOnSignUp();
	}

}
