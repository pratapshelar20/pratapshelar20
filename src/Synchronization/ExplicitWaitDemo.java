package Synchronization;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
//Explicit Wait:
//		driver.get("https://www.google.co.in/");
//
//		driver.manage().window().maximize();
//
//
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement searchbox =        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//		searchbox.sendKeys("Selenium");

		
//		C)fluentWait():
		FluentWait <WebDriver>wait2 = new FluentWait<WebDriver>(driver); wait2.withTimeout(20,TimeUnit.SECONDS);
		wait2.pollingEvery(5,TimeUnit.SECONDS);
		wait2.ignoring(NoSuchElementException.class);

	}

}
