package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/FILES/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		

		WebElement doubleClick = driver.findElement(By.name("dblClick"));

		Actions actions=new Actions(driver);
		actions.doubleClick(doubleClick).build().perform();

	}

}
