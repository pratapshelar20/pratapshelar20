package Iframe;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/FILES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(2000);
		
		Set<String> s= driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> it = s.iterator();
		
		it.next();
	  	String w2nd = it.next();
	    
	           driver.switchTo().window(w2nd);
	    
	    	Thread.sleep(2000);
	    
	    driver.findElement(By.name("emailid")).sendKeys("hanuman12@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("btnLogin")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Click Here")).click();
	

	}

}
//
//Window popup
//
//Set<String>ss = driver.getWindowHandles();
//Iterator<String>is = ss.iterator();
//String MainWindow =is.next();
//String ChildWindow = is.next();
//driver.switchTo().window(ChildWindow);
//
//Alert popup
//
//Alert alt =  driver.switchTo().alert();
//String a = alt.getText();
//alt.accept();
//alt.dissmiss();
//
//Checkbox
//
//driver.findElement(By.xpath("xpathexp")).click();
//
//Dropdown
//
//WebElement we = driver.findElement(By.xpath("xpathexp")).click();
//Select sel = new Select(we);
//sel.selectByVisibleText("Text");
//sel.selectByValue(0);
//sel.selectByIndex();
//
//Mouse
//
//WebEelement mouse = driver.findElement(By.xpath("xpathExp"));
//Actions act = new Actions(driver);
//act.moveToElement(mouse).build().perform();
//
//Scrollbar
//
//JavascriptExicutor j = (JavascriptExicutor)driver;
//j.exicuteScript("window.scrollBy(0,300)");
//
//Screenshot
//
//File a = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
//File b = new File("filepath");
//FileUtils.copy(a,b);
