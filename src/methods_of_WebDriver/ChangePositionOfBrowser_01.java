package methods_of_WebDriver;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePositionOfBrowser_01 {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.google.com/");

		Thread.sleep(1000);

		Point p = new Point(600,100);
driver.manage().window().setPosition(p);
		//driver.manage().window().setPosition(p);



	}

}
