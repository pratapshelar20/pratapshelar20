package failedTestCaseScreenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

//public class ListenerTest {
public class ListenerTest implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		
		try {
			GetScreenshot.capture(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();

}
}}