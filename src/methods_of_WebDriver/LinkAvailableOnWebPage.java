package methods_of_WebDriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAvailableOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		
		List<WebElement> abc = driver.findElements(By.tagName("a"));
		int num = abc.size();
		System.out.println(num);
		
		for(int i=0;i<=num-1;i++) {
			String c = abc.get(i).getText();
			Thread.sleep(1000);
			System.out.println(c);
	}
	}
}
