package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

// listener - post actions results of methods i.e. pass, fail, skip
//ITestListener - interface is using

public class ListenerClass implements ITestListener
{
	
	// ================================== ITestContext will be used for 'onStart' & 'onFinish' methods ===========================
	@Test
	public void onStart(ITestContext result) {
		System.out.println("Started : "+result.getName());
	}
	
	@Test
	public void onFinish(ITestContext result) {
		System.out.println("Finished : "+result.getName());
	}
	
	
	//========================== ITestResult is used to check post actions results of methods i.e. pass, fail, skip
	
	@Test
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed : "+result.getName());
	}
	
	@Test
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped : "+result.getName());
	}
	
	@Test
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed : "+result.getName());
	}
}
