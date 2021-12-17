package failedTestCaseScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	@Test
	public static void captureScreenshot() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
	  String title =driver.getTitle();
//		  //Facebook - 
		  Assert.assertEquals("Google1", title);
//		  
		  Thread.sleep(2000);
		   
		   driver.close();
	}
}
