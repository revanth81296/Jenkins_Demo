package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Action_Utility {
	
	public Actions a;
	
	public Action_Utility (WebDriver dr) {
		a=new Actions(dr);
	}
	
	
	public void double_Click(WebElement element) {
		a.doubleClick(element).perform();
	}
	
	public void right_Click(WebElement element) {
		a.contextClick(element).perform();
	}
	
	public void drag_drop(WebElement source, WebElement destination) {
		a.dragAndDrop(source, destination).perform();
	}
	
	public void mouse_Hover(WebElement element) {
		a.moveToElement(element).perform();
	}
}
