package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class Soft_assertion_No_assertAll

	//If test method fails, soft assertion doesn't immediate throw an exception & it execute the code
	//***** if 'assertAll' method not used last, we will not get details of failed test case ---****-----it will pass all test cases

	{
		int a=6;
		int b=3;
		SoftAssert soft =new SoftAssert();
		@Test
		public void division() {
			
			System.out.println("================ Division (Soft Asset) started=======================");
			int c=a/b;	//result=2				
			soft.assertEquals(c, 5,"!!! =====================Soft Asset: division operation is not valid =====================");
			// Failed here ------- but it will not stop execution

			System.out.println("================Soft Asset: addition started =======================");
			int d=a+b;		//result=9
			soft.assertEquals(d, 1,"!!! =====================Soft Asset: addition operation is not valid =====================");

			System.out.println("================Soft Asset: multiplication started =======================");

			int e=a*b;		//result=18
			soft.assertEquals(e, 77,"!!! =====================Soft Asset: multiply operation is not valid =====================");
			System.out.println("**************** Soft_assertion_No_assertAll ****************");

			
		}
}
