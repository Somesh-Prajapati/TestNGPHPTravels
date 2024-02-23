package GenericWindowLibrary;

import java.util.Iterator;
import java.util.Set;

import GenericLibrary.BaseClass;

public class WindowHandle extends BaseClass {

	public static void NavigateToLastWindow() {
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
        Iterator<String> I1 = windows.iterator();
        while(I1.hasNext()) {
        	String child_window = I1.next();
        	if(!parent.equals(child_window)) {
        	driver.switchTo().window(child_window);
        	}
        }
	}
}
