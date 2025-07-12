package Basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfDriver {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 
	  driver.get("https://www.flipkart.com/");
		//  Thread.sleep(10000);

	 String CurrentUrl = driver.getCurrentUrl();
	 System.out.println(CurrentUrl);
	String getTitle = driver.getTitle();
	System.out.println(getTitle);
	String getWindowHandle = driver.getWindowHandle();
	System.out.println(getWindowHandle);
	Set<String> getWindowHandles= driver.getWindowHandles();
	System.out.println(getWindowHandles);
	
	driver.close();
	}

}
