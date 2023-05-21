package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.instagram.com/");
	 JavascriptExecutor Jse =(JavascriptExecutor)driver;
	 
	 Thread.sleep(2000);
	 Jse.executeScript("window.scrollBy(0,700)");
	 //Scroll Up
	   Thread.sleep(2000);
	   Jse.executeScript("window.scrollBy(0,-700)");
	   
	   Thread.sleep(2000);
	   driver.quit();
	

		// TODO Auto-generated method stub

	}

	
}
