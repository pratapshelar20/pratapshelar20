package Actions_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://FILES//chromedriver.exe");
	
	//System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/delete_customer.php ");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.name("cusid")).sendKeys("53920");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("submit")).click();
	
	Thread.sleep(2000);
	
	Alert alt = driver.switchTo().alert();
	alt.accept();
	
	Thread.sleep(2000);
	
	alt.accept();
}}
