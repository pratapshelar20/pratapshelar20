package failedTestCaseScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenshot extends MainTest {
	public static String capture(String screenshotName) throws IOException  {
		File o = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File r = new File("C:/Users/REALDOTCOMP PVT.LTD/Desktop/rrr.bmp");
		
		FileUtils.copyFile(o,r);
		return screenshotName;
		
	}
}
