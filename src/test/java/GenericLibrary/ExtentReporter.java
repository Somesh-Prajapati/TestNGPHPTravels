package GenericLibrary;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	static ExtentReports extent;
	
	public static ExtentReports GenerateExtentReport(){
		String path = System.getProperty("user.dir")+"\\reports.html";
		ExtentSparkReporter Reporter = new ExtentSparkReporter(path);
		Reporter.config().setReportName("Extent Report");
		Reporter.config().setDocumentTitle("Test Results");
		Reporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(Reporter);
		extent.setSystemInfo("Tester","Somesh Prajapati");
		return extent;
	}
}
