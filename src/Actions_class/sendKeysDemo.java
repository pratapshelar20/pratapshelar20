package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendKeysDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("searchDropdownBox")).click();

		Thread.sleep(2000);


		Actions a = new Actions(driver);

		for(int i=7;i>=0;i--) {
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		}

		Thread.sleep(2000);


		for(int i=0;i<=6;i++) {
		a.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(2000);
		}

	}

}
