package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("isAgeSelected")).click();
		Thread.sleep(2000);

		Boolean abc = driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(abc);
	}

}
