package com.Maven_Project;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Library.Base_Class;
import Pom_Script.Digital_Downloads;
import Pom_Script.Home_Page;
import Pom_Script.Login_Page;
import Pom_Script.Shopping_Cart_Page;

public class Sample_Program extends Base_Class {
	@Test
	public void testcase() throws InterruptedException {
		Home_Page hp = new Home_Page(dr);
		Login_Page lp = new Login_Page(dr);
		Digital_Downloads dd = new Digital_Downloads(dr);
		Shopping_Cart_Page sc = new Shopping_Cart_Page(dr);
		
		hp.get_login_Link().click();
		lp.email().sendKeys("qazwsxedc@gmail.com");
		lp.password().sendKeys("123456");
		lp.login_button().click();
		
	
		hp.get_digital_downloads_link().click();
		dd.third_album_add_to_cart().click();
		Thread.sleep(2000);
		dd.music_2_add_to_cart().click();
		Thread.sleep(2000);
		dd.music_22_add_to_cart().click();
		Thread.sleep(2000);
		hp.get_shopping_Cart().click();
		
		List<WebElement> count = sc.getProductCount();
		
		System.out.println(count.size());
		
		double size = count.size();
		
		Assert.assertEquals(size,3.0);
		
		dr.quit();
		
		
	}
}
