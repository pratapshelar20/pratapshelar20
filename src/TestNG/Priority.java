package TestNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	@BeforeTest
	  public void login() {

		  System.out.println("Test Login successfully");
	  }
	  @AfterTest
	  public void logout() {
		  System.out.println("Test Logout successfully"); 
		  }
	
	 @Test(priority=2)
	  public void verifyTitle() {

		  System.out.println("Verify Title method");
	  }
	 
	  @Test(priority=1)
	  public void abcd() {
		  System.out.println("abcd method");  }
	  
	  @Test(priority=3)
	  public void abc() {
		  System.out.println("abc method"); 
	  }}
//}
//Suite file is:
//
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="TestNG.DependsOnMethods"/>
//       <class name="TestNG.Abc"/>
//       <class name="TestNG.Priority"/>
//     
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->
