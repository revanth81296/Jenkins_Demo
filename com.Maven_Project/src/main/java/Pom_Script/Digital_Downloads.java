package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digital_Downloads extends Base_Page {
	
	public Digital_Downloads(WebDriver dr) {
		super(dr);
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement Third_album_add_to_cart ;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement Music_2_add_to_cart ;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	private WebElement Music_22_add_to_cart ;
	
	
	public WebElement third_album_add_to_cart() {
		return Third_album_add_to_cart;
	}
	
	public WebElement music_2_add_to_cart() {
		return Music_2_add_to_cart;
	}
	
	public WebElement music_22_add_to_cart() {
		return Music_22_add_to_cart;
	}
}
