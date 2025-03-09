package Generic_Library;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(Listener_Implementation.class)
public class Base_Class extends WebDriver_Utility {
	
	@BeforeSuite
	public void ConnectServer() {
		Reporter.log("Connect to the Server",true);
	}
	
	@BeforeTest
	public void ConnectDB() {
		Reporter.log("Connect to the DB",true);
	}
	
	@BeforeClass
	public void OpenBrowser() throws IOException {
		dr = new ChromeDriver();
		MaxBrowser();
		WaitBrowser();
		OpenUrl(Property_Utility.getData("url"));
	}
	
	@AfterClass
	public void CloseBrowser() {
	//	CloseUrl();
	}
	
	@AfterTest
	public void DisconnectDB() {
		Reporter.log("Disconnected from the DB",true);
	}
	
	@AfterSuite
	public void DisconnectionServer() {
		Reporter.log("Disconnected from the Server",true);
	}

}
