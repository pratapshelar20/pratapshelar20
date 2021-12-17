package methods_of_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionofWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
						
//		driver.get("https://www.google.co.in/");
//		driver.manage().window().maximize();
//						
//		Thread.sleep(2000);
//						
//		String abc = driver.findElement(By.linkText("Facebook")).getText();
//		System.out.println(abc);
						
//		2)isEnabled()
//		driver.get("https://www.google.co.in/");
//		driver.manage().window().maximize();
//						
//		Thread.sleep(2000);
//						
//		Boolean abc = driver.findElement(By.linkText("Gmail")).isEnabled();
//		System.out.println(abc);

		
//		3)isSelected()
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//						
//		driver.findElement(By.id("email")).click();
//						
//		Thread.sleep(2000);
//
//		Boolean abc = driver.findElement(By.id("email")).isSelected();
//		System.out.println(abc);

		
//		4)isDisplayed
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Boolean abc = driver.findElement(By.className("gmail")).isDisplayed();
		System.out.println(abc);

	}

}
