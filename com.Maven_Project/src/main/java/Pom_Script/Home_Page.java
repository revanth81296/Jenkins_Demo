package Pom_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generic_Library.WebDriver_Utility;

public class Home_Page extends Base_Page {
	
	public Home_Page(WebDriver dr) {
		super(dr);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement reg_Link;
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login_link;
	
	@FindBy(xpath = "//a[text()='Shopping cart']")
	private WebElement shopping_cart_link;
	
	@FindBy(xpath = "//a[contains(text(),'Digital downloads')]")
	private WebElement digital_downloads_link;
	
	public WebElement get_reg_Link() {
		return reg_Link;
	}
	
	public WebElement get_digital_downloads_link() {
		return digital_downloads_link;
	}
	
	public WebElement get_login_Link() {
		return login_link;
	}
	
	public WebElement get_shopping_Cart() {
		return shopping_cart_link;
	}
	
	

}
