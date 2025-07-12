package SeleniumAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign73 {
//WAP to automate- First Name, last name, Email, Password, Present & Permanent Address and Pincode Fields In url : https://grotechminds.com/registration/
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0,1200)");
		driver.findElement(By.name("fname")).sendKeys("Vivek");
		driver.findElement(By.name("lname")).sendKeys("Singh");
		driver.findElement(By.id("email")).sendKeys("vks150993@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234567890");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='chat-bot-message-close']")).click();
		driver.findElement(By.id("male")).click();
		WebElement e1 =driver.findElement(By.id("Skills"));
		Select s =new Select(e1);
		s.selectByVisibleText("Technical Skills");
		WebElement e2 =driver.findElement(By.id("Country"));
		Select s1 =new Select(e2);
		s1.selectByIndex(8);
		
		driver.findElement(By.id("Present-Address")).sendKeys("India gate, new delhi");
		driver.findElement(By.id("Permanent-Address")).sendKeys("PM House");
		driver.findElement(By.name("Pincode")).sendKeys("110045");
		WebElement e3=driver.findElement(By.name("Relegion"));
		Select s2 = new Select(e3);
		s2.selectByVisibleText("Hindu");
		driver.findElement(By.name("file")).sendKeys("F:\\Eclipse29052025Workplace\\Selenium\\ExcelSheet\\Vivek.xlsx");
		driver.findElement(By.name("relocate")).click();
		driver.findElement(By.name("Submit")).click();
		
		Alert a =driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
