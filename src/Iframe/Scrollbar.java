package Iframe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.exicuteScript("window.scrollBy(0,300)");
		j.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(2000);
		//JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-1300)");
	}

}
