package TestNG_Parallel_Test_Exicution_Classes;

import org.junit.Test;

public class TestNG_Parallel_Test_Exicution_ClassesDemo02 {
	@Test
	  public void testCase5() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 5 is successful"+" Thread id :"+id);
	  }
	  @Test
	  public void testCase6() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 6 is successful"+" Thread id :"+id);
	  } 
}
//------------

//XML file:
//
//<?xml version="1.0" encoding="UTF-8"?>
//<suite name="Suite" parallel="classes">
//
//<test name="Test" thread-count="4" >
//  <classes>
//    <class name="ParallelTestExicution.ParallelTestExicutionClass1"/>
//    <class name="ParallelTestExicution.ParallelTestExicutionClass2"/>
//  </classes>
//</test> <!-- Test -->
//</suite> <!-- Suite -->

//}
