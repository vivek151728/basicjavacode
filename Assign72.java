package SeleniumAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign72 {
//WAP to automate apollo pharmacy find doctor using  link text / partial link text
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
	/*	Alert alert=driver.switchTo().alert();
	alert.dismiss();
	*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='zD']")).click();
		driver.findElement(By.linkText("Find Doctors")).click();
		

	}

}
