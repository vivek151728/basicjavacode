package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched");
		Thread.sleep(3000);
		driver.close();
		
		EdgeDriver driver1 = new EdgeDriver();
		System.out.println("Edge Browser Launched");
		Thread.sleep(3000);
		driver1.close();
	}

}
