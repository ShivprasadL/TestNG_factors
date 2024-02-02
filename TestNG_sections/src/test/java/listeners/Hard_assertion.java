package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assertion

//If test method fails anywhere, hard assertion immediate throw an exception & stops execution of code

{
	int a=6;
	int b=3;
	@Test
	public void division() {
		
		System.out.println("================ Division =======================");
		int c=a/b;	//result=2				
		Assert.assertEquals(c, 5,"!!! ===================== division operation is not valid =====================");
		//failed here, next execution will be stopped

		System.out.println("================ addition =======================");
		int d=a+b;		//result=9
		Assert.assertEquals(d, 9,"!!! ===================== addition operation is not valid =====================");

		System.out.println("================ multiplication =======================");
		int e=a*b;		//result=18
		Assert.assertEquals(e, 18,"!!! ===================== multiply operation is not valid =====================");
	}
}
