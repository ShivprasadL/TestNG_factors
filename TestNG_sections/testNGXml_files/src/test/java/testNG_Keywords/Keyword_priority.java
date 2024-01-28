package testNG_Keywords;

import org.testng.annotations.Test;

public class Keyword_priority {
	
	//================== Test method's sequence of execution i.e. priority=1, 2, 3 ... ============================
	
	@Test(priority=3)
	public void testA() {
		System.out.println("Test - A");
	}
	
	@Test(priority=1)
	public void testB() {
		System.out.println("Test - B");

	}
	
	@Test(priority=2)
	public void testC() {
		System.out.println("Test - C");

	}

}
