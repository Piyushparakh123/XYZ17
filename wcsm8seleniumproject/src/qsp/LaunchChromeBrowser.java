package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
       new ChromeDriver(co);
       
	}

}
