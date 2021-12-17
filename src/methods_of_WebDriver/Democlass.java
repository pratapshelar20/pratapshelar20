package methods_of_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Democlass {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("Webdriver.chrome.driver","E:/FILES/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//driver.get("https://www.google.com/");

		
	driver.get("https://www.Flipkart.com/");
	

	Thread.sleep(5000);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.google.com/");
	}

}
