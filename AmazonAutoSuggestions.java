package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	WebElement search =	driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("toys");
	Thread.sleep(3000);
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
	int count = list.size();
	System.out.println(count);
	
 list.get(9).click();
 Thread.sleep(5000);
	
	driver.close();

	}

}
