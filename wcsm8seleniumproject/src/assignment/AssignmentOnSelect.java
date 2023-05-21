package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnSelect {

	// How to select option from dropDown Without using selection method?


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Piyush%20Parakh/Documents/singleselect.html");
	WebElement dropdown=driver.findElement(By.name("menu"));
	Select sel=new Select(dropdown);
	// to get the all Options from dropDown
			List<WebElement> allOptions = sel.getOptions();

			// to select option by using click method..
			for(WebElement op:allOptions)
			{
				if(op.getText().equals("vadapav"))
				{
					Thread.sleep(2000);
					op.click();
					break;
				}
			}
	
		// TODO Auto-generated method stub

	}

}
