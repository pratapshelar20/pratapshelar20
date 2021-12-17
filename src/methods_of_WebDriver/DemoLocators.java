package methods_of_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);
//Tagname
		driver.findElement(By.tagName("a")).click();
//2)id()

driver.findElement(By.id("email")).sendKeys("836543");
//3)name()
driver.findElement(By.name("email")).sendKeys("836543");
//--------------------------------------------------------------------
//4)className()
//
driver.findElement(By.className("gb_f")).click();
//---------------------------------------------------------------------
//5)linkText()
//
driver.findElement(By.linkText("Images")).click();
//-----------------------------------------------------------
//6)partialLinkText()
//
driver.findElement(By.partialLinkText("Im")).click();

	}

}
