package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//7)@BeforeSuite
//8)@AfterSuite

public class TestNGDependsonMethod00 {

	 @BeforeClass
	  public void login() {

		  System.out.println("Login successfully");
	  }
	  @AfterClass
	  public void logout() {
		  System.out.println("Logout successfully"); 
		  }
	  @Test(priority=2)
	  public void addProduct() {
		  System.out.println("Add product successfully");  
	}
	@Test(priority=1)
	public void addVendor() {
		System.out.println("Add vendor successfully"); 
	}
	@Test(priority=3)
	public void addCurrency() {
		System.out.println("Add currency  successfully"); 
	}
}
