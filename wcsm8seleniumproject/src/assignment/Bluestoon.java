package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestoon {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwge2iBhBBEiwAfXDBR-UqrKY3pMZMAAcZt1P_xySkUOf-Hf8mYw7ZOtUaGCsg2QyZT5t4eBoCMQMQAvD_BwE");
		driver.findElement(By.id("denyBtn")).click();
		driver.findElement(By.id("chat-icon")).click();									
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
