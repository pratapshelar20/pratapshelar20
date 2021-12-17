package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		System.getProperty("WebDriver.Chrome.driver","E://FILES//chromedriver_win32.zip/");
		WebDriver driver =new ChromeDriver();
		driver.get("(https://web.whatsapp.com/");
	}

}
