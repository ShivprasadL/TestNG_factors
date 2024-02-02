package listeners;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


// integrate listener class with test class by 
// 1) @Listeners(PkgName.ListenerClassName.class)
// 2) testNG.xml file suite>listeners>listener name ------->

@Listeners(listeners.ListenerClass.class)
public class Test_class

//If test method fails anywhere, hard assertion immediate throw an exception & stops execution of code

{
	int a=6;
	int b=3;
	@Test
	public void division() {
		
		int c=a/b;	//result=2	
		System.out.println("================ Division ======================="+c);
		Assert.assertEquals(c, 5,"!!! ===================== division operation is not valid =====================");

	}

	@Test(dependsOnMethods="division")
	public void addition() {
		int d=a+b;		//result=9
		System.out.println("================ addition ======================="+d);
	}
	
	@Test
	public void multiplication() {
		int e=a*b;		//result=18
		System.out.println("================ multiplication ======================="+e);

	}
}
