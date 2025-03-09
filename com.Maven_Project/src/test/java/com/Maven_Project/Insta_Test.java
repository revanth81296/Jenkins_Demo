package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Insta_Test {

	@Test
	public void test_case() {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.instagram.com/");
		dr.quit();
		}
}
