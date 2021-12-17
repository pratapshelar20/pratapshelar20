package methods_of_WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo00 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
				
		driver.manage().window().maximize();
			
		Thread.sleep(2000);
				
		File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		File d = new File("C://Users//REALDOTCOMP PVT.LTD//Desktop//New Bitmap Image.bmp/");
				
		FileUtils.copyFile(s, d);
				
				

	}

}
