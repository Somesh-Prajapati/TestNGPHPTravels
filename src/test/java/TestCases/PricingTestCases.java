package TestCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import BusinessLibrary.HomePageBusiness;
import BusinessLibrary.PricingBusiness;
import DataProvider.Resouces.DemoDataProvider;
import GenericLibrary.BaseClass;


public class PricingTestCases extends BaseClass{
		
	@BeforeMethod
	public void GearUp() {
		LaunchBrowser("Chrome");
		OpenUrl("https://phptravels.com/");
	}
	
	
	@Test(dataProvider = "pricing-data-provider", dataProviderClass = DemoDataProvider.class)
	public void PricingRegistrationVerification(String companyname, String email, String PhoneNo, String firstname, String lastanme, String Budget, String startdate,String startmonth,String startyear, String message) throws InterruptedException {
		HomePageBusiness.ClickOnPricing();
		implicitWait();
		SwitchToIframe(PricingBusiness.SwitchFrame());
		PricingBusiness.EnterComapnyName(companyname);
		PricingBusiness.EnterEmail(email);
		PricingBusiness.EnterWhatsAppPhone(PhoneNo);
		PricingBusiness.EnterFirstName(firstname);
		PricingBusiness.EnterLastName(lastanme);
		PricingBusiness.SelectBudget(Budget);
		PricingBusiness.EnterStartDate(startdate,startmonth,startyear);
		PricingBusiness.EnterMessage(message);
		JavascriptExecutor  js  = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(20000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PricingBusiness.SubmitButton())));
//		handleActionOperations.interactwithElementAndClickONTHat(element1);	
		PricingBusiness.SubmitButton();
		Assert.assertEquals(PricingBusiness.DataInsertionAlert().getText(),"Thank you!","Correct");
	}	
	
	@Test (description = "Testing For Title Validation")
	public void titleValidation() {
		HomePageBusiness.ClickOnPricing();
		Assert.assertEquals(driver.getTitle(),"Phptravels Plans & Pricing | One Time Payment","This Is Correct");
	}
	
	@Test (description = "Testing For URL Validation")
	public void URLValidation() {
		HomePageBusiness.ClickOnPricing();
		Assert.assertEquals(driver.getCurrentUrl(),"https://phptravels.com/pricing","This Is Correct Url");
	}
	
	@AfterMethod (description = "Browser Quit Method")
	public void TearDown() {
		driver.quit();
	}
}
