package TestNG_Parallel_Test_Exicution;

import org.junit.Test;

public class TestNG_Parallel_Test_ExicutionDemo1 {
	@Test
	  public void testCase1() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 1 is successful"+" Thread id :"+id);
	  }
	  @Test
	  public void testCase2() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 2 is successful"+" Thread id :"+id);
	  }
	  @Test
	  public void testCase3() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 3 is successful"+" Thread id :"+id);
	  }
	  @Test
	  public void testCase4() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 4 is successful"+" Thread id :"+id);
	  }

}

//XML file:
//
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite" parallel="methods" thread-count="2">
//  <test name="Test">
//    <classes>
//      <class name="TestNG_Parallel_Test_Exicution.ParallelTestExicutionMethods"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->

