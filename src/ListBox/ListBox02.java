package ListBox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement abc = driver.findElement(By.name("States"));
		
		Select s = new Select(abc);
		
		List<WebElement> a = s.getOptions();
		int size = a.size();
		System.out.println(size);
		
		for(int i=0;i<a.size();i++) {
			String ab =a.get(i).getText();
			System.out.println(ab);
			
			Thread.sleep(2000);
	}

}}
