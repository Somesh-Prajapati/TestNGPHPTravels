package GenericLibrary;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static Select select;
	public static WebDriverWait wait;
	
	public static void LaunchBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}
	
	public static void SelectByVisibleText(WebElement element, String string) {
		select = new Select(element);
		select.selectByVisibleText(string);
	}
	
	public static void OpenUrl(String url) {
		driver.get(url);
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static void QuitBrowser() {
		driver.quit();
	}
	
	public static void ElementClickable(WebElement webelement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}
	
	public static void SwitchToIframe(WebElement webelement) {
		driver.switchTo().frame(webelement);
	}
	
}
