package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/");

		driver.findElement(By.name("username")).sendKeys("piyushp___198");

		driver.findElement(By.name("password")).sendKeys("piyu rcb");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();

		// TODO Auto-generated method stub

	}

}

