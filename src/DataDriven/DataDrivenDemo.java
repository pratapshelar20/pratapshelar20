package DataDriven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenDemo {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Open the Excel sheet
		
		FileInputStream excel = new FileInputStream("C:/Users/REALDOTCOMP PVT.LTD/Desktop/rest.xlsx");
		
       Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
		
		String b= a.getRow(1).getCell(1).getStringCellValue();
		String c=a.getRow(2).getCell(1).getStringCellValue();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys(b);
		driver.findElement(By.name("pass")).sendKeys(c);
		
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();	
	}

}
