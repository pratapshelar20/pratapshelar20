package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoiframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/FILES/chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/seleniu\r\n" + 
				"m/package-summary.html");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("org.openqa.selenium.cli")).click();

		
//		Switch the selenium control from one frame to another frame

Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
                     //driver.switchTo().defaultContent();
		
		Thread.sleep(1000);

		driver.switchTo().frame(2);

     	               driver.findElement(By.linkText("TakesScreenshot")).click();
Thread.sleep(2000);

driver.switchTo().frame(1);
driver.findElement(By.linkText("AcceptedW3CCapabilityKeys"));

Thread.sleep(2000);
	}

}
