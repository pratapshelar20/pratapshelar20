package TestNG_Parallel_Test_Exicution_Classes;

import org.testng.annotations.Test;

public class TimeOutDemo {
	@Test
	public void ContactVerify(){
	   System.out.println("Contact validation is successful");
	}
	@Test(timeOut = 1000)
	public void LandingPage(){
	   System.out.println("Landing page verification is successful");
	}
	@Test
	public void LoanContact(){
	   System.out.println("Loan contact details verification is successful");
	}


}
