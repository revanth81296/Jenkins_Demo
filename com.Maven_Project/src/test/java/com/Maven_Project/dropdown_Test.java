package com.Maven_Project;

import java.util.Base64;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Library.Base_Class;
import Generic_Library.Select_Utility;

public class dropdown_Test extends Base_Class {
	
	@Test
	public void dropdown() {
		dr.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		WebElement element = dr.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select_Utility s = new Select_Utility(element);
		//s.Select_byIndex(5);
		
//		s.Get_alloptions();
//		for (WebElement e:alloptions) {
//			Reporter.log(e.getText(),true);
//		}
//		
		
		System.out.println(s.Get_allSelectedOptions());
		System.out.println(s.Get_firstselectedoptions());
		
		//System.out.println(s.is_singleonmultipleof()); // We should use Sysout for is_singleonmultipleof since Reporter.log does not accept string values.
	
	}
}
