package GenericLibrary;

import java.io.File;
import java.lang.module.ModuleDescriptor.Exports;
import java.sql.Date;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;


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
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
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
	
	public static void ElementPresence(String Xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
	}
	
	public static void GetScreenShot(String testname) {
		Random random = new Random();
		int randomInRange = random.nextInt(1000);
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File source =  screenshot.getScreenshotAs(OutputType.FILE);
		String destination = "C:\\Users\\HP\\eclipse-workspace\\PHPTravels\\ScreenshotRepo\\"+testname+"_"+randomInRange+".png";
		File destinationFile = new File(destination);
		try {
			FileUtils.copyFile(source, destinationFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public static void main(String[] args) {
		Random random = new Random();
		int randomInRange = random.nextInt(1000);
		System.out.println(randomInRange);
	}
	
	public static void SwitchToIframe(WebElement webelement) {
		driver.switchTo().frame(webelement);
	}
}
