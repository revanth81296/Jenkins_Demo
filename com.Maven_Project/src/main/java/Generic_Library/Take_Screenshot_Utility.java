package Generic_Library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;

public class Take_Screenshot_Utility {
	
	public static void takescreenshot(String name) throws IOException {
		TakesScreenshot TS = (TakesScreenshot) WebDriver_Utility.dr;
		File source = TS.getScreenshotAs(OutputType.FILE);
		File destination = new File(Iconstant.errorshot_Path+"\\"+name+".png");
		Files.copy(source, destination);
	}
}
