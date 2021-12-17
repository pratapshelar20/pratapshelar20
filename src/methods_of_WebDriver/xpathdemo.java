package methods_of_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

//		Thread.sleep(2000);
//		1)X-path by attribute
//		2)X-path by text
//		3)x-path by contains
//		4)x-path by index
//		5)Absolute x path 
//		6)Relative x path
//
//		1)X-path by attribute
//		Syntax:
//		driver.findElement(By.xpath("//tagname[@attributename='attributevalue']"));
//
//		Ex:
		driver.findElement(By.xpath("//a[@class='gb_g']"));
//		----------------------------------------------------------------
//		2)X-path by text
//		Syntax:
//		driver.findElement(By.xpath("//tagname[text()='textname']"));
//
//		Ex;
//		Syntax:
//		driver.findElement(By.xpath("//a[text()='Gmail']"));
//		----------------------------------------------------------------------------
//		3)x-path by contains
//
//		Syntax:
//		driver.findElement(By.xpath("//tagname[contains(text(),'textname')]"));
//
//		Ex:
//		driver.findElement(By.xpath("//a[contains(text(),'Gm')]"));
//		-----------------------------------------------------------------------------
//		4)x-path by index
//		Syntax:
//		driver.findElement(By.xpath("//tagname[@attributename='attributevalue'][index]"));
//
//		Ex:
//		driver.findElement(By.xpath("//a[@class='gb_g'][2]"));
//		-------------------------------------------------------------------------
//		5)Absolute x path :
//		1)In this focus is on the html tag
//
//		/html/head/body/div[4]/input[3]
//		2)Each tag are seperated by / (slash)
//		3)It is use to navigate from root of parent to immediate child
//
//		Disadvantages
//		1)X path is too long and time consuming
//		2)Developing html tree diagram is difficult
//		------------------------------------------------------------------------
//		6)Relative x path :
//		1)In this focus is on the html tag
//
//		//body//div[4]//input[3]
//		2)Each tag are seperated by // (slash)
//		3)It is use to navigate from any parent to immediate child
//
//		Disadvantages
//		1)X path is too long and time consuming
//		2)Developing html tree diagram is difficult








	}

}
