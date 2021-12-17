package TestNG_Grouping;

import org.testng.annotations.Test;

public class TestNG_GroupingDemo01 {
	@Test(groups= {"sanity","regression"},priority=1)
	  public void login() {

		  System.out.println("Login successfully");
	  }
	  @Test(groups= {"sanity","regression"},priority=10)
	  public void logout() {
		  System.out.println("Logout successfully"); 
		  }
	  @Test(groups= {"sanity"},priority=4)
	  public void search() {
		  System.out.println("Search successfully");  
	}
	@Test(priority=2)
	public void addVendor() {
		System.out.println("Add vendor successfully"); 
	}
	@Test(groups= {"regression"},priority=3)
	public void advancedSearch() {
		System.out.println("Advanced search successfully"); 
	}
	@Test(groups= {"sanity","regression"},priority=5)
	public void prepaidRecharge() {
	System.out.println("Prepaid recharge successfully"); 
	}
	@Test(groups= {"regression"},priority=6)
	public void billPayments() {
	System.out.println("Bill payment successfully"); 
	}

}
//xml file:
//
//<?xml version="1.0" encoding="UTF-8"?>
//<suite name="Suite" parallel="false">
//  <test name="Test">
//  <groups>
//  <run>
//  <include name ="sanity"/>
//  </run>
//  </groups>
//    <classes>
//      <class name="TestNG_Grouping.ClassName1"/>  
//     </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->

