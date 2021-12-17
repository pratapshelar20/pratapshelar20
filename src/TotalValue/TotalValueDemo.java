package TotalValue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalValueDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement abc = driver.findElement(By.xpath("//select[@name='States']"));
		Select a = new Select(abc);
		
		List<WebElement>b = a.getOptions();
		
		for(int i=0;i<=b.size()-1;i++) {
			String c= b.get(i).getText();
			System.out.println(c);
			
	}
		//Print total options avialable on list with size.txt
		int d =b.size();
		System.out.println(d);
	}
}
