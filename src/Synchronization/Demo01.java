package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/FILES/chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.google.com/");

	Thread.sleep(2000);
	driver.findElement(By.linkText("Gmail")).click();
}}
