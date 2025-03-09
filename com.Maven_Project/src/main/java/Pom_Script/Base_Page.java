package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic_Library.WebDriver_Utility;

public class Base_Page {
	
	public Base_Page(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
}
