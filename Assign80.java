package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign80 {
// WAP tp print all links of the page
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> L1 = driver.findElements(By.tagName("a"));
		int count = L1.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
		WebElement a =	L1.get(i);
		String url=a.getDomAttribute("href");
		System.out.println(url);
		}
		driver.close();
		

	}

}
