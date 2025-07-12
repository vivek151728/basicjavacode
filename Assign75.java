package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign75 {
//WAP to find out search text field on Amazon using Relative x-path 'https://www.amazon.in/'
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement e1 =driver.findElement(By.xpath("//input[@id='twotabsearchte;xtbox']"));
		e1.sendKeys("iphone");

	}

}
