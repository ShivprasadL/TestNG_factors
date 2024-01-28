package testNG_Keywords;

import org.testng.annotations.Test;

public class Keyword_enabled {
	
	// execute methods which are enabled=true & not execute methods having enabled=false
	
	@Test(enabled=true)
	public void testMethodA() {
		System.out.println("test method A");
	}
	
	@Test(enabled=false)
	public void testMethodB() {
		System.out.println("test method B");
	}
	
	@Test(enabled=true)
	public void testMethodC() {
		System.out.println("test method C");
	}
	
	@Test(enabled=true)
	public void testMethodD() {
		System.out.println("test method D");
	}
	
	@Test(enabled=true)
	public void testMethodE() {
		System.out.println("test method E");
	}

}
