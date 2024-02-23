package BusinessLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseClass;
import PageObjectRepositories.PricingPage;

public class PricingBusiness extends BaseClass {

	
	public static void EnterComapnyName(String string) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.EnterComapnyName(string);
	}
	
	public static void EnterEmail(String string) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.EnterEmail(string);
	}
	
	public static void EnterWhatsAppPhone(String string) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.EnterWhatsAppPhone(string);
	}
	
	public static void EnterFirstName(String string) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.EnterFirstName(string);
	}
	
	public static void EnterLastName(String string) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.EnterLastName(string);
	}
	
	public static void SelectBudget(String string) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.SelectBudget(string);
	}
	
	public static void EnterStartDate(String date,String month,String year) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.EnterStartDate(date, month, year);
	}
	
	public static void EnterMessage(String string) {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.EnterMessage(string);
	}
	
	public static void ClickSubmit() {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		pricingpage.ClickSubmit();
	}
	
	public static WebElement ClickButton() {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		return pricingpage.ClickButton();
	}
	
	public static WebElement SwitchFrame() {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		return pricingpage.SwitchFrame();
	}
	

	public static WebElement DataInsertionAlert() {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		return pricingpage.DataInsertionAlert();
	}
	
	public static String SubmitButton() {
		PricingPage pricingpage = PageFactory.initElements(driver ,PricingPage.class );
		return pricingpage.SubmitButton();
	}
	
	
}
