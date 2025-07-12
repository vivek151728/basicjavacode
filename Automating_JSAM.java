package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automating_JSAM {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Vivek/Downloads/learningHTML1.html");
		driver.findElement(By.name("username")).sendKeys("Vivek1509");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.name("fname")).sendKeys("Vivek");
		driver.findElement(By.name("lname")).sendKeys("Singh");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
	}

}
