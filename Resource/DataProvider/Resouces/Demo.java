package DataProvider.Resouces;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
		
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	AssertUserDefined assert1 = new AssertUserDefined();

	
	public void Test() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/");
		driver.findElement(By.xpath("//a[text()='Demo']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Somesh");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prajapati");
		driver.findElement(By.xpath("//input[@placeholder='Business Name']")).sendKeys("Bitsquad");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Demo132@gmail.com");
		String s1 =driver.findElement(By.xpath("//span[@id='numb1']")).getText();
		String s2 =   driver.findElement(By.xpath("//span[@id='numb2']")).getText();
		int c = Integer.parseInt(s2) + Integer.parseInt(s1);
		driver.findElement(By.xpath("//input[@placeholder='Result ?']")).sendKeys(String.valueOf(c));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Submit']"))));
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.getPageSource().contains(" Thank you!");
		driver.quit();
	}
	
	public static void main(String[] args) {
		Demo t = new Demo();
		t.Test();
	}
}