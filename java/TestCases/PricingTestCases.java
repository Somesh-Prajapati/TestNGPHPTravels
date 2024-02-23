package TestCases;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BusinessLibrary.HomePageBusiness;
import BusinessLibrary.PricingBusiness;
import GenericLibrary.BaseClass;
import GenericLibrary.handleActionOperations;

public class PricingTestCases extends BaseClass{
	
	@BeforeMethod
	public void GearUp() {
		LaunchBrowser("Chrome");
		OpenUrl("https://phptravels.com/");
	}
	
	
	@Test
	public void PricingRegistrationVerification() throws InterruptedException {
		HomePageBusiness.ClickOnPricing();
		implicitWait();
		SwitchToIframe(PricingBusiness.SwitchFrame());
		PricingBusiness.EnterComapnyName("Bitquad");
		PricingBusiness.EnterEmail("Demo123@gmail.com");
		PricingBusiness.EnterWhatsAppPhone("123467890");
		PricingBusiness.EnterFirstName("Rakesh");
		PricingBusiness.EnterLastName("Patel");
		PricingBusiness.SelectBudget("20,000");
		PricingBusiness.EnterStartDate("12", "01", "2000");
		PricingBusiness.EnterMessage("According to the definition, a company profile is a professional introduction of the business which aims to inform the audience about its products and services. Or it is defined as the firms historical description, its structure, resources, the rate of performance as well as its reputation.");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PricingBusiness.SubmitButton())));
		handleActionOperations.interactwithElementAndClickONTHat(element1);	
		element1.click();
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
}
