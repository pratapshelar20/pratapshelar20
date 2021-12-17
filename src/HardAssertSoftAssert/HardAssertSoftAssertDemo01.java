package HardAssertSoftAssert;

import org.junit.Assert;
import org.junit.Test;

public class HardAssertSoftAssertDemo01 {
	@Test
	public void verifyPageTitle() {
		String expected_Title = "Google";
		String actual_Title = "Google1";
		System.out.println("Test case exicution started");
		Assert.assertEquals(actual_Title, expected_Title);
		System.out.println("Test case exicution finished");


	}

}
