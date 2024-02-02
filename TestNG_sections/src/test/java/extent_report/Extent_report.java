package extent_report;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_report {

	ExtentSparkReporter htmlreporter;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void reportSetUp() 
	{
		//set path & html file name
		htmlreporter = new ExtentSparkReporter("TestReport.html");	
		
		//Attach report
		report = new ExtentReports();
		report.attachReporter(htmlreporter);
		
		//Add env. details
		report.setSystemInfo("Mahine", "PC1");
		report.setSystemInfo("OS", "Linux");
		report.setSystemInfo("user", "Shiv");
		report.setSystemInfo("Browser", "Chrome");
		
		//Configuration to change look & feel
		htmlreporter.config().getDocumentTitle();
		htmlreporter.config().setReportName(("Test Report"));
		htmlreporter.config().setTheme(Theme.STANDARD);
		htmlreporter.config().setTimeStampFormat("EEEE MM DD, YYYY,hh:mm a('zzz')");
	}

	
	@Test
	public void test() {
		int a=10;
		int b=2;
		int c=a/b;
		Assert.assertEquals(3, 5);
		
	}
	
	@AfterMethod
	public void getTestResults(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"FAIL",ExtentColor.RED));
		}
//		
//	@AfterTest
//	public void done() {
		report.flush();
	
		
	}
		
		
	
}
