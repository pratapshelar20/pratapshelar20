package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgDemoAnnotation01 {
	public WebDriver driver;
    
    @BeforeSuite
    public void setUp() throws InterruptedException
    {   
        System.setProperty("webdriver.chrome.driver", "C:/FILES/chromedriver.exe");
        driver=new ChromeDriver();
        Thread.sleep(2000);
        System.out.println("The setup process is completed");
    }
    
    @BeforeTest
    public void profileSetup()
    {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
        
    }
    
    @BeforeClass
    public void appSetup()
    {
        driver.get("https://www.facebook.com/");
        System.out.println("The app setup process is completed");
    }
    
    @BeforeMethod
    public void checkLogin()
    {
          driver.get("https://www.facebook.com/");

                       //Here in username and password field(sendKeys) enter your fb username and password

          driver.findElement(By.name("email")).sendKeys("8329080292");
          driver.findElement(By.name("pass")).sendKeys("Sandip@123");
          driver.findElement(By.name("login")).click();
          System.out.println("The login process on facebook test is completed");
    }
    
    @Test
    public void testCurrentUrl() throws InterruptedException
    {
        
        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.facebook.com/");
        System.out.println("The url validation test is completed");
    }
    
    @AfterMethod
    public void screenShot() throws IOException
    {
    	File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
    	//Here enter the path of bmp file 
    	
		File d = new File("C:/Users/REALDOTCOMP PVT.LTD/Desktop/poi.bmp");
		
		FileUtils.copyFile(s, d);
    }
    
    @AfterClass
    public void closeUp()
    {
        driver.close();
        System.out.println("The close_up process is completed");
    }
    
    @AfterTest
    public void reportReady()
    {
        System.out.println("Report is ready to be shared, with screenshots of tests");
    }
    
    @AfterSuite
    public void cleanUp()
    {
        
        System.out.println("All close up activities completed");
    }
    
}
