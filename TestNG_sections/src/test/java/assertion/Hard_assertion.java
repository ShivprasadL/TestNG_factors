package assertion;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Hard_assertion

//If test method fails anywhere, hard assertion immediate throw an exception & stops execution of code

{
	int a=6;
	int b=3;
	@Test
	public void division() {
		
		System.out.println("================  Hard_assertion Division =======================");
		int c=a/b;	//result=2				
		Assert.assertEquals(c, 5,"!!! ===================== Hard_assertion : division operation is not valid =====================");
		//failed here, next execution will be stopped

		System.out.println("================Hard_assertion: addition =======================");
		int d=a+b;		//result=9
		Assert.assertEquals(d, 9,"!!! =====================Hard_assertion: addition operation is not valid =====================");

		System.out.println("================Hard_assertion: multiplication =======================");
		int e=a*b;		//result=18
		Assert.assertEquals(e, 18,"!!! =====================Hard_assertion: multiply operation is not valid =====================");
		System.out.println("**************** Hard Assertion ****************");
	}
}
