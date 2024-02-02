package assertion;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

	
	public class Soft_assertion_with_assertAll

	//If test method fails, soft assertion doesn't immediate throw an exception & it execute the code
	//***** if 'assertAll' method used last, we will get details of failed test cases

	{
		int a=6;
		int b=3;
		SoftAssert soft =new SoftAssert();
		
		@Test
		public void division() {
			
			System.out.println("================ Division (Soft Assertio _All) started =======================");
			int c=a/b;	//result=2				
			soft.assertEquals(c, 5,"!!! =====================Soft Assertio _All: division operation is not valid =====================");

			System.out.println("================Soft Assertio _All: addition started=======================");
			int d=a+b;		//result=9
			soft.assertEquals(d, 9,"!!! =====================Soft Assertio _All: addition operation is not valid =====================");

			System.out.println("================Soft Assertio _All: multiplication started=======================");
			int e=a*b;		//result=18
			soft.assertEquals(e, 19,"!!! =====================Soft Assertio _All: multiply operation is not valid =====================");
			System.out.println("**************** Soft_assertion_with_assertAll ****************");

			//Report all failed results
			soft.assertAll();

		}
	

}
