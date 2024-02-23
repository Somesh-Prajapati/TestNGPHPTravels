package PageObjectRepositories;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BaseClass;

public  class HomePage extends BaseClass {

	//Navigation Bar
	
	//text[text()='PHPTRAVELS  ']
	//text[text()='Travel Tech Partner']
	//a[@href='https://phptravels.org]
	//a[@href='https://phptravels.org/register.php']
	
	
	@FindBy  (xpath = "//li[a[text()='Demo']]")
	private  WebElement TopDemo;
	
	@FindBy  (xpath = "//li[a[text()='Pricing']]")
	private  WebElement Pricing;
	
	@FindBy  (xpath = "//li[a[text()='Themes']]")
	private  WebElement Themes;
	
	@FindBy  (xpath = "//a/span[text()='Product']")
	private  WebElement Product;
	
	@FindBy  (xpath = "//a/span[text()='Features']")
	private  WebElement Features;
	
	@FindBy  (xpath = "//a/span[text()='Company']")
	private  WebElement Company;
	
	@FindBy  (xpath = "//a/span[text()='Features']")
	private  WebElement Login;
	
	@FindBy  (xpath = "//a[@href='https://phptravels.org/register.php']")
	private  WebElement SignUp;
	
	
	public void ClickOnSignUp() {
		SignUp.click();
	}
	
	public void ClickOnDemo() {
		TopDemo.click();
	}
	
	public void ClickOnPricing() {
		Pricing.click();
	}
	
	public void ClickOnTheme() {
		Themes.click();
	}
	
	public void ClickOnProducts() {
		Product.click();
	}
	
	public void ClickOnFeatures() {
		Features.click();
	}
	
	public void ClickOnCompany() {
		Company.click();
	}
	
	public void LoginOnCompany() {
		Login.click();
	}
}
