package BusinessLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import GenericLibrary.BaseClass;
import PageObjectRepositories.DemoPage;

public class DemoBusiness extends BaseClass{
	
	public static DemoPage Demo = PageFactory.initElements(driver, DemoPage.class);
	
	public static void EnterFirstName(String string) {
//		DemoPage Demo = PageFactory.initElements(driver, DemoPage.class);
		Demo.EnterFirstName(string);
	}
	
	public static void EnterLastName(String string) {
		Demo.EnterLastName(string);
	}
	
	public static  void EnteBusinessname(String string) {
		Demo.EnteBusinessname(string);
	}
	
	public static void EnterEmail(String string) {
		Demo.EnterEmail(string);
	}
	
	public static void CaptchaSubmit() {
		Demo.CaptchaSubmit();
	}
	
	public static  void SubmitDemo() {
		Demo.SubmitDemo();
	}
	public static  WebElement SubmitButton() {
		return Demo.submitbutton();
	}
	
	public static boolean SuccessAlert() {
		return driver.getPageSource().contains(" Thank you!");
	}
	
}
