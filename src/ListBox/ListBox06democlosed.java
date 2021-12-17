package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox06democlosed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement abc = driver.findElement(By.xpath("//select[@name='States']"));
		Select a = new Select(abc);
		a.selectByIndex(2);
		//a.selectByVisibleText("New Jersey");//Select By Visible Text
		//a.selectByValue("2");
		
		Thread.sleep(7000);
		driver.close();
	}

}
