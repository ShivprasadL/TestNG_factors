package testNG_Keywords;

import org.testng.annotations.Test;

public class Keyword_dependsOnMethods extends Keyword_priority
{
	
	//======= dependsOnMethods is responsible to test2(running) based on test1(dependsOnMethods="test2")==========Both test1 & test2 will run ======
		
	@Test(enabled=true)
	public void testMethodA() {
		System.out.println("test method A");
	}
	
	@Test(enabled=false)
	public void testMethodB() {
		System.out.println("test method B");
	}
		
	// ========== testA(inherited), testMethodD & then testMethodC will run =============
	@Test(enabled=true, dependsOnMethods="testMethodD")				
	public void testMethodC() {
		System.out.println("test method C");
	}
	
	// ========= testA (from another class) =========== testMethodD will run if current class inherited the parent class(having testA)
	@Test(enabled=true, dependsOnMethods="testA")
	public void testMethodD() {
		System.out.println("test method D");
	}
	
	@Test(enabled=true, dependsOnMethods="testMethodB")			// ======== 
	public void testMethodE() {
		System.out.println("test method E");
	}

}
