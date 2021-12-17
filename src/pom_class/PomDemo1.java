package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDemo1 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  @FindBy(xpath="//input[@name='q']")  private WebElement SEARCH;
		
		public PomDemo1(WebDriver driver)
		{
		    PageFactory.initElements(driver,this) ;
		}
		
		
		public void search() {
			
			SEARCH.sendKeys("Selenium");
		}

}
