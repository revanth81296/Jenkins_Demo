package com.Maven_Project;

import org.testng.annotations.Test;

import Generic_Library.Base_Class;
import Generic_Library.Java_Script_Utility;

public class Scroll_Test extends Base_Class {
	
//	@Test
//	public void ScrollUp() {
//		Java_Script_Utility js = new Java_Script_Utility();
//		js.scroll_Up(0, 1000);
//	}
//	
//	@Test
//	public void ScrollDown() {
//		Java_Script_Utility js = new Java_Script_Utility();
//		js.scroll_Down(0, -1000);
//	}
	
	@Test
	public void ScrollTop_Bopttom() throws InterruptedException {
		Java_Script_Utility js = new Java_Script_Utility();
		js.scroll_Bottom();
		Thread.sleep(2000);
		js.scroll_Top();
	}
}
