package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("shoes");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		int count  = list.size();
		System.out.println(count);
		
		list.get(4).click();
		driver.close();
		
	}

}
