package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign81 {

	public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/Vivek/Downloads/learningHTML1.html");
driver.switchTo().alert().accept();
WebElement L1 =driver.findElement(By.id("121"));
boolean a = L1.isDisplayed();
boolean b =L1.isEnabled();
System.out.println(a); //True
System.out.println(b); // false
WebElement L2 =driver.findElement(By.id("123"));
boolean c =L2.isSelected();
System.out.println(c); //false
 if(c == false)
 {
	 L2.click();
 }

	}

}
