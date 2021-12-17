package TestNG_Parallel_Test_Exicution_Classes;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	@Test(invocationCount = 5)
    public void test1(){
      System.out.println("Invocation count demo1");
}}
