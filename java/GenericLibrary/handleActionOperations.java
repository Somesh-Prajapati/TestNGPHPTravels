package GenericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class handleActionOperations extends BaseClass{
	
	public static void interactwithElementAndClickONTHat(WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.scrollToElement(element);
		element.click();
	}

}
