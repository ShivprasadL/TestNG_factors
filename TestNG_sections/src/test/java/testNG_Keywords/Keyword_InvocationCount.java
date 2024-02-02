package testNG_Keywords;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Keyword_InvocationCount {
	
	// InvocationCount used when we need to run single test case multiple time
	
	int count;

	
	@Test(invocationCount=3)		// method will execute 3 times
	public void test_1() {
		System.out.println("=============== Test 1 is executed ===============");
	}
	
	@Test(invocationCount=4)
	public void test_2(ITestContext context) {
		int a =context.getAllTestMethods()[1].getCurrentInvocationCount();
		a++;
		System.out.println("================ Test 2 : current InvoCount =============="+a);
	}
	
	@Test(invocationCount=3)		// method will execute 3 times
	public void test_3() {
		count++;
		System.out.println("=============== Test 3  ==============="+count);
	}

}
