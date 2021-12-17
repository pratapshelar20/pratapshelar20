package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("(//span[@draggable=\"true\"])[1]"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source,dest).perform();
	}

}
