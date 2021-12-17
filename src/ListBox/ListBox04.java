package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement abc = driver.findElement(By.name("States"));
		
		
		
		Select s = new Select(abc);
		s.selectByIndex(1);
		
		WebElement b = s.getFirstSelectedOption();
		System.out.println(b.getText());
	}

}
