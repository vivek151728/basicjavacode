package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign67 {
// WAP to automate Facebook login page 
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("vks150993@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234567890");
		driver.findElement(By.name("login")).click();
		Thread.sleep(15000);
		driver.close();
	}

}
