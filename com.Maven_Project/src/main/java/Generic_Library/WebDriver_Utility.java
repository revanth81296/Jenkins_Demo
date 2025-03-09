package Generic_Library;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	
	public static WebDriver dr;
	
	public static void OpenUrl(String url) {
		dr.get(url);
	}
	
	public static String CurrentUrl() {
		String url = dr.getCurrentUrl();
		return url;
	}
	
	public static String Title() {
		String title = dr.getTitle();
		return title;
	}
	
	public static void Refresh() {
		dr.navigate().refresh();
	}
	
	public static void Navigateforward() {
		dr.navigate().forward();
	}
	
	public static void Navigateback() {
		dr.navigate().back();
	}
	
	public static String windowHandle() {
		String Handle = dr.getWindowHandle();
		return Handle;
	}
	
	public static void Switchwindow(String url) {
		Set<String> address = dr.getWindowHandles();
		for (String s: address) {
			dr.switchTo().window(s);
			if(dr.getCurrentUrl().contains(url)) {
				break;
			}
		}
	}
	
	public static void pageLoad(String url) {
		WebDriverWait w = new WebDriverWait(dr,Duration.ofSeconds(15));
		w.until(ExpectedConditions.urlContains(url));
	}
	
	public static void WedElementload(WebElement element) {
		WebDriverWait w = new WebDriverWait(dr,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void switchTo() {
		dr.switchTo().newWindow(WindowType.TAB);
	}
	
	public static void MaxBrowser() {
		dr.manage().window().maximize();
	}
	
	public static void WaitBrowser() {
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public static void CloseUrl() {
		dr.quit();
	}

}
