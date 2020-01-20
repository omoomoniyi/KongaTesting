package com.w2a.testcase;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class kglogin01 extends TestBase {

	@Test
	public void validlogin () throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("login/Signup_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("emailinput_XPATH"))).sendKeys(OR.getProperty("emailtxt_XPATH"));
		driver.findElement(By.xpath(OR.getProperty("passwordinput_XPATH"))).sendKeys(OR.getProperty("passwordtxt_XPATH"));
		driver.findElement(By.xpath(OR.getProperty("loginBTN_XPATH"))).click();
		Thread.sleep(3000);
		
		
		
				
	}
	
		
}