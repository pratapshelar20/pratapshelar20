package file_upload_download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload_download_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");

		WebDriver driver=new ChromeDriver();


		driver.get("http://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();

		Thread.sleep(2000);


		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field

		uploadElement.sendKeys("C://Users//REALDOTCOMP PVT.LTD//Desktop//jawa1//JAWA//ARMSTRONG_NUMBER.txt/");


		// check the "I accept the terms of service" check box

		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button

		driver.findElement(By.name("send")).click();

	}

}
