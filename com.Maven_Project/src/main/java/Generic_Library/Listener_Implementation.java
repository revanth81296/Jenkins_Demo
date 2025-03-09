package Generic_Library;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_Implementation implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Testcase Failed",true);
		try {
			Take_Screenshot_Utility.takescreenshot(result.getName());
			} catch (IOException e)	{
				e.printStackTrace();
			}
	}
}
