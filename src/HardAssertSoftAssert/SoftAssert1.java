package HardAssertSoftAssert;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	public void verifyPageTitle() {
		String expected_Title = "Google";
		String actual_Title = "Google1";
		
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("Test case exicution started");
		softassert.assertEquals(actual_Title, expected_Title);
		
		String expected_PageUrl = "google.com";
		String actual_PageUrl = "google.com1";
		
		
		softassert.assertEquals(expected_PageUrl, actual_PageUrl);
		System.out.println("Test case exicution finished");


	}
}
