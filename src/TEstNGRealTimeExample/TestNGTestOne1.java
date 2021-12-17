package TEstNGRealTimeExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGTestOne1 {
	WebDriver driver;
  	
	  @Test
	  public void f() {
	  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
	  	  System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
	  	 
	  	//Setting the driver to chrome driver
	  	  driver = new ChromeDriver();
	  	  String url = "https://www.google.com";
	  	  driver.get(url);
	  	  //Capturing the title and validating if expected is equal to actual
	  	  String expectedTitle = "Google";
	  	  String actualTitle = driver.getTitle();
	  	  Assert.assertEquals(actualTitle, expectedTitle);
	    }
	  @BeforeMethod
	  public void beforeMethod() {
	  	  System.out.println("Starting the browser session");
	  }
	 
	  @AfterMethod
	  public void afterMethod() {
	  	  System.out.println("Closing the browser session");
	  	  driver.quit();
	  }
}
