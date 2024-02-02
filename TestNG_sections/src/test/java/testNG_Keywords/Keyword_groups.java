package testNG_Keywords;

import org.testng.annotations.Test;

public class Keyword_groups {
	
	@Test(groups="Regression")
	public void testW() {
		System.out.println("Test - W");
	}
	
	@Test(groups="Smoke")
	public void testX() {
		System.out.println("Test - X");
	}
	
	@Test(groups={"Smoke","Functional"})
	public void testY() {
		System.out.println("Test - Y");
	}
	
	@Test(groups={"Functional","Regression"})
	public void testZ() {
		System.out.println("Test - Z");

	}

}
