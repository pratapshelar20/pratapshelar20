package methods_of_WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeSizeOfBrowser_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");

		Thread.sleep(1000);

		Dimension d = new Dimension(300,700);

	driver.manage().window().setSize(d);

	}

}
