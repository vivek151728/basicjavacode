package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	WebElement search =	driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
		search.sendKeys("India");
		Thread.sleep(5000);
		
	List<WebElement> list =	driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
	int count =list.size();
	System.out.println(count);
	list.get(1).click();
		 

	}

}
