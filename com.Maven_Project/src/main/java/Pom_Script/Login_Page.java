package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {
	
	public Login_Page(WebDriver dr) {
		super(dr);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Login_Button;
	
	public WebElement email() {
		return Email;
	}
	
	public WebElement password() {
		return Password;
	}
	
	public WebElement login_button() {
		return Login_Button;
	}

}
