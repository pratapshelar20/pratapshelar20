package TestNG_Parallel_Test_Exicution_Classes;

import org.testng.annotations.Test;

public class EnabledequaltoFalseDemo {
	@Test(enabled = false)
    public void btest1() {
        System.out.println("B.btest1");
	}
}
