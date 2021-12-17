package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomDemo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		
		PomDemo1  pom = new PomDemo1(driver);
		pom.search();
		
		Thread.sleep(2000);
		
		PomDemo2  pom1 = new PomDemo2(driver);
		pom1.gmail();

	}

}
