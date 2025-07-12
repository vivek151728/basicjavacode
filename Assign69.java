package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign69 {
	//WAP using locators linkText, PartialLinkText, TagName, ClassName

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	List<WebElement> e1 = driver.findElements(By.tagName("a"));
	int count =e1.size();
	System.out.println(count);
	for(int i=0; i<count;i++) {
		WebElement links = e1.get(i);
	String url	=links.getDomAttribute("href");
	System.out.println(url);
	}                     
	driver.findElement(By.linkText("Kilos")).click();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.className("LP8mvD")).click();
		
		
	driver.findElement(By.partialLinkText("Become")).click();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
		
		
	}

}
