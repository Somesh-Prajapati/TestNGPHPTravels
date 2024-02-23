package TryRunRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;

public class Demo extends BaseClass{
	

	@FindBy (xpath = "//div[div[text()='Departure Date']]")
	private  WebElement CalnederOpen;
	
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")
	private  WebElement NextButton;
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")
	private  List<WebElement>  MonthYearPicker;
	
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1loqt21 r-19bllq0 r-u8s1d r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")
	private  WebElement PreviousButton;
	
	public void CalenderOpen() {
		CalnederOpen.click();
	}
	
	public void NextButton() {
		NextButton.click();
	}
	
	public static void Calender(String Date,String Month,String Year) {
		WebElement CalenderClick =  driver.findElement(By.xpath("div[@data-testid='undefined-month-'"+Month+"'-'"+Year+"]//div[@data-testid='undefined-calendar-day-"+Date+"']"));
		System.out.println("Hello");
	}

	
	public void DatePicker(String Month, String Year, String Date) {
		implicitWait();
		CalenderOpen();
		List<WebElement> MonthYearPick = MonthYearPicker;
		WebElement NextButton1 = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']"));
		for (int i = 0; i < MonthYearPick.size(); i++) {
			if(MonthYearPick.get(i).getText().equalsIgnoreCase(Month+" "+Year)) {
//				WebElement CalenderClick = driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+Month+"-"+Year+"']//div[@data-testid='undefined-calendar-day-"+Date+"']"));
//				CalenderClick.click();
				break;
			}
			if((i%2)!=0) {
				NextButton1.click();
			}
		}
	}
	
	public static void DatePickerBusiness(String Month,String Year,String Date) {
		Demo demo = PageFactory.initElements(driver, Demo.class);
		demo.DatePicker(Month, Year, Date);
	}
	
	
	@BeforeMethod
	public void GearUp() {
		LaunchBrowser("Chrome");
		OpenUrl("https://www.spicejet.com/");
	}
	
	@Test
	public void Test() {
		Demo.DatePickerBusiness("Januray","2025","12");
	}
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/pricing");
		driver.findElement(By.xpath("//h1[@id='h1']/strong")).getText();;
		
	}
	
	
	
	
	
//Months
//data-testid="undefined-month-January-2024"

//	@FindBy (xpath = "div[@data-testid='undefined-month-January-2024']//div[@data-testid=\"undefined-calendar-day-13']")
//	private List<WebElement> Months;

//	public void DateSelector(String Month, String Year, String Date) {
//		CalenderOpen();
//		Calender(Date, Month, Year);
//		List<WebElement> MonthBlockChecker = Months;
//		for (int i = 0; i < MonthBlockChecker.size(); i++) {
//			String string = "undefined-month-"+Month+"-"+Year;
//			if(MonthBlockChecker.get(i).getAttribute("data-testid").equalsIgnoreCase(string)) {
//				
//			};
//		}
	
//	public static void DateSelectorBusiness(String Month, String Year, String Date) {
//		Demo demo = PageFactory.initElements(driver, Demo.class);
//		demo.DateSelector( Month,  Year,  Date);
//	}
//	
//	@Test
//	public void DateSelection() {
//		Demo.DateSelectorBusiness("May","2024","12");
//	}
	
}
