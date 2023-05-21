package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	           ChromeOptions co = new ChromeOptions();
	           co.addArguments("--remote-allow-origins=*");
       ChromeDriver driver = new ChromeDriver(co);
       Thread.sleep(2000);
       driver.close();	}
}

