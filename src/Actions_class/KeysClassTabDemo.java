package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysClassTabDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("8329080292");

		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();

	//	 driver.findElement(By.name("pass")).sendKeys("Sandip@123");

	}

}
