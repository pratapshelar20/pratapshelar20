package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://FILES//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		//WebElement a = driver.findElement(By.linkText("Gmail"));//clicking gmail
		WebElement a = driver.findElement(By.linkText("Images"));// clicking Images
		Actions b = new Actions(driver);
		b.click(a).build().perform();

	}

}
