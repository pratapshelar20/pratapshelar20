package Actions_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysClassEnterDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		//  actions.sendKeys(Keys.END)
		//  .perform();
		//
		//  Thread.sleep(2000);
		//
		//  actions.sendKeys(Keys.HOME)
		//  .perform();

		actions.sendKeys(driver.findElement(By.name("click")),Keys.ENTER).build().perform();
		Thread.sleep(2000);



		Alert alt = driver.switchTo().alert();
		alt.accept();

		//  driver.quit();

	}

}
