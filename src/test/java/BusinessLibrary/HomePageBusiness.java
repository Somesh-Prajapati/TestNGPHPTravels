package BusinessLibrary;
import org.openqa.selenium.support.PageFactory;
import GenericLibrary.BaseClass;
import PageObjectRepositories.HomePage;

public class HomePageBusiness extends BaseClass{
	
//	public static HomePage home = PageFactory.initElements(driver, HomePage.class);

	
	public static void ClickOnSignUp() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnSignUp();
	}
	
	public static void ClickOnDemo() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnDemo();
	}

	public static void ClickOnPricing() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnPricing();
	}
	
	public static void ClickOnTheme() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnTheme();
	}
	
	public static void ClickOnProducts() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnProducts();
	}
	
	public static void ClickOnFeatures() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnFeatures();
	}
	
	public static void ClickOnCompany() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnCompany();
	}
	
	public static void LoginOnCompany() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.ClickOnDemo();
	}
}
