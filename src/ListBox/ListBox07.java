package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox07 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.tagName("all"));
		Select s = new Select(we);
		boolean a = s.isMultiple();
		System.out.println(a);
		if(a==true)
		{
			System.out.println("Selected list Multiselected");
		}
		else
		{
			System.out.println("Selected list is  single selected");

		}
	}

}
