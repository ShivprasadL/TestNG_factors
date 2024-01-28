package testNG_Keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annoatations {
  @Test
  public void testmethod1() {
	  System.out.println("1 - Test method - executed");
  }
  
  @Test
  public void testmethod2() {
	  System.out.println("2 - Test method - executed");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod - executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod - executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass - executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass - executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest - executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest - executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite - executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite - executed");
  }
  
// ======================================== Order of execution ====================================================
  
//  beforeSuite - executed
//  beforeTest - executed
//  beforeClass - executed
  
//  beforeMethod - executed
//  1 - Test method - executed
//  afterMethod - executed
  
//  beforeMethod - executed
//  2 - Test method - executed
//  afterMethod - executed
  
//  afterClass - executed
//  afterTest - executed

}
