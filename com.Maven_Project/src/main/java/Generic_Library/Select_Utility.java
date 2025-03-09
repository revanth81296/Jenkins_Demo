package Generic_Library;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Utility {
	
	public Select s;
	
	public Select_Utility(WebElement element) {
		s=new Select(element);
	}
	
	public void Select_byIndex(int index) {
		s.selectByIndex(index);
	}
	
	public void Select_byValue(String value) {
		s.selectByValue(null);
	}
	
	public void Select_byVisibleText(String text) {
		s.selectByVisibleText(text);
	}
	
	public void Deselect_byIndex(int index) {
		s.deselectByIndex(index);
	}
	
	public void Deselect_byValue(String value) {
		s.deselectByValue(value);
	}
	
	public void Deselect_byVisibleText(String text) {
		s.deselectByVisibleText(text);
	}
	
	public void Deselect_all() {
		s.deselectAll();
	}
	
	public List<WebElement> Get_alloptions() {
		List<WebElement> alloptions = s.getOptions();
		return alloptions;
	}	
	public List<WebElement> Get_allSelectedOptions() {
		List<WebElement> selectedoption = s.getAllSelectedOptions();
		return selectedoption;
		}

	public WebElement Get_firstselectedoptions() {
		WebElement Getfirstselectedoption = s.getFirstSelectedOption();
		return Getfirstselectedoption;
	}
	
	public boolean is_singleonmultipleof() {
		boolean b = s.isMultiple();
		return b;
	
	}	
}
