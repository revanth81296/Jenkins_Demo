package Pom_Script;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_Cart_Page extends Base_Page {
	
	public Shopping_Cart_Page(WebDriver dr) {
		super(dr);
	}
	
	@FindBy(xpath = "(//a[@class='product-name'] )")
	private List<WebElement> productcount;
	
	public List<WebElement> getProductCount() {
		return productcount;
	}
}
