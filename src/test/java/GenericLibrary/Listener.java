package GenericLibrary;

import java.util.Random;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener implements ITestListener {
	
	ExtentReports extent = ExtentReporter.GenerateExtentReport();
	ExtentTest test;
	Random random = new Random();
	int randomInRange = random.nextInt(1000);
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Successfull");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.addScreenCaptureFromBase64String("C:\\Users\\HP\\eclipse-workspace\\PHPTravels\\ScreenshotRepo\\"+result.getMethod().getMethodName()+"_"+randomInRange+".png");
		BaseClass.GetScreenShot(result.getMethod().getMethodName());
		test.fail(result.getThrowable());
	}

//	@Override
//	public void onTestSkipped(ITestResult result) {
//		
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		result.getThrowable();
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//
//	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	

}
