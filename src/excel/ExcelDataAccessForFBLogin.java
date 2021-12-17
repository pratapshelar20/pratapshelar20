package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataAccessForFBLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		FileInputStream f=new FileInputStream("C:/Users/REALDOTCOMP PVT.LTD/Desktop/Sheet1.xlsx");
		Sheet a= WorkbookFactory.create(f).getSheet("poiu");
		
		String b= a.getRow(0).getCell(0).getStringCellValue();
		String c=a.getRow(0).getCell(1).getStringCellValue();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(b);
		driver.findElement(By.id("pass")).sendKeys(c);
		
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}
