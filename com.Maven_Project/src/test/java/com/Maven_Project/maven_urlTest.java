package com.Maven_Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class maven_urlTest {
	@Test
	
	public void testcase() {
		
		String url = System.getProperty("url");
		Reporter.log(url,true);
	}

}
