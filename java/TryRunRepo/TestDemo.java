package TryRunRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericLibrary.BaseClass;

public class TestDemo extends BaseClass {

	static WebDriver driver = new ChromeDriver();

	public static void Calender(String Date, String Month, String Year) {
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[div[text()='Departure Date']]")).click();
		// String dynamicXPath =
		// String.format("//div[@data-testid='undefined-month-%s-%s']//div[@data-testid='undefined-calendar-day-%s']","Januray","2024","12");
		// WebElement CalenderClick = driver.findElement(By.xpath(dynamicXPath));

		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-picker']//div[div[contains(text(),'" + Month
				+ "') and text()='" + Year + "']]/following-sibling::div//div[text()='" + Date + "']")).click();

//	    String dynamicXPath = String.format("//div[@data-testid='undefined-month-%s-%s']//div[@data-testid='undefined-calendar-day-%s']", Month, Year, Date);
//		WebElement CalenderClick = driver.findElement(By.xpath("//div[@data-testid='undefined-month-May-2024']//div[@data-testid='undefined-calendar-day-12']"));
//		WebElement CalenderClick = driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+Month+"-"+Year+"']//div[@data-testid='undefined-calendar-day-"+Date+"']"));

	}

	public static void main(String[] args) {

		Calender("12", "Januray", "2024");
	}

}
