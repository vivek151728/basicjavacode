package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonAssert {
	
	@Test	
	public void VerifyAmazonStuffs() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.name("email")).sendKeys("8210550116");
		Thread.sleep(3000);
		driver.findElement(By.className("a-button-input")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Vivek123");
		driver.findElement(By.id("signInSubmit")).click();
		
		Assert.assertEquals(driver.getTitle(), "Your Amazon.in");
	}
;
}
