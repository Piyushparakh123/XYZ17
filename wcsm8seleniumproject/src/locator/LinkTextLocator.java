package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/Piyush%20Parakh/Documents/link.html");
	    
	    
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("FlipkartLink")).click();
	    
		// TODO Auto-generated method stub

	}

}
