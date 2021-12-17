package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		

		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		searchbox.sendKeys("Selenium");
	}

}
