package methods_of_WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxgetOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://techcanvass.com/Examples/multi-select.html");


		WebElement a  = driver.findElement(By.xpath("/html/body/div/form/fieldset/select"));

		Select s = new Select(a);

		List<WebElement> b = s.getOptions();
		int c =b.size();//6
		System.out.println(c);

		for(int i=0;i<=c-1;i++) {//0,1,2,3,4,5,
		String d =b.get(i).getText();
		System.out.println(d);//volvo
		Thread.sleep(2000);


		}

		driver.close();

	}

}
