package TestNG_Parallel_Test_Exicution_Classes;

import org.junit.Test;

public class TestNG_Parallel_Test_Exicution_ClassesDemo01 {
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
