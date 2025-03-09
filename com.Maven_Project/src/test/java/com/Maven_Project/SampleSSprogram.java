package com.Maven_Project;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Library.Base_Class;

public class SampleSSprogram extends Base_Class {
	
	@Test
	public void testcase() {
		Reporter.log("SS Captured",true);
		dr.findElement(By.xpath("//a[text()=selenium']")).click();
	}
	
	
}
