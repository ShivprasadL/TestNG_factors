package assertion;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	
	public class Soft_assertion

	//If test method fails, soft assertion doesn't immediate throw an exception & it execute the code
	//***** if 'assertAll' method not used last, we will not get details of failed test method

	{
		int a=6;
		int b=3;
		SoftAssert soft =new SoftAssert();
		
		@Test
		public void division() {
			
			int c=a/b;	//result=2				
			Assert.assertEquals(c, 5,"!!! ===================== division operation is not valid =====================");
		}
		
		@Test
		public void addition() {
			int d=a+b;		//result=9
			Assert.assertEquals(d, 9,"!!! ===================== addition operation is not valid =====================");

		}
		
		@Test
		public void multiply() {
			int e=a*b;		//result=18
			Assert.assertEquals(e, 18,"!!! ===================== multiply operation is not valid =====================");
			
		}
	

}
