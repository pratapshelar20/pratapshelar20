package methods_of_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/FILES/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://techcanvass.com/Examples/multi-select.html");
		WebElement a  = driver.findElement(By.xpath("/html/body/div/form/fieldset/select"));

		Select s = new Select(a);

//		s.selectByIndex(3);

//		1.s.selectByIndex();
//		2.s.selectByVisibleText();
//		s.selectByVisibleText("Hyundai");

//		3. s.selectByValue();
//		s.selectByValue("honda");

//		Following methods are used for deselect the option from listbox
//
//		1.s.deselectByIndex();
//		2.s.deselectByVisibleText();
//		3. s.deselectByValue();
//		4. s.deselectAll();

//		getFirstSelectedOption()

//		s.selectByIndex(0);//volvo
//
//		WebElement b = s.getFirstSelectedOption();
//		String c = b.getText();
//		System.out.println(c);
	
//		isMultiple()
		
		s.selectByIndex(3);
		s.selectByIndex(0);
		s.selectByIndex(5);

		Boolean sm = s.isMultiple();
		System.out.println(sm);


	}

}
