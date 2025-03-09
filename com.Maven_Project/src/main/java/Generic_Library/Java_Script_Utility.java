package Generic_Library;

import org.openqa.selenium.JavascriptExecutor;

public class Java_Script_Utility {
	
	JavascriptExecutor js;
	
	public Java_Script_Utility() {
		js = (JavascriptExecutor) WebDriver_Utility.dr;
	}
	
	public void scroll_Up(int x, int y) {
		js.executeScript("window.scrollBy("+x+","+y+");");
	}
	
	public void scroll_Down(int x, int y) {
		js.executeScript("window.scrollBy("+x+","+-y+");");
	}
	
	public void scroll_Bottom() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	public void scroll_Top() {
		js.executeScript("window.scrollTo(0,document.body.scrollTop);");
	}
}
