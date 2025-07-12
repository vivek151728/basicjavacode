package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign68 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		//Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement e1 =driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]")).click();
		driver.findElement(By.name("email")).sendKeys("vks50993@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		driver.close();

	}

}
