package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashsetAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/Piyush%20Parakh/Documents/singleselect.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		//To handle dropdown create obj of select class
		 Select sel = new Select(dropdown);
		 List<WebElement>allOption=sel.getOptions();
		 HashSet<String> ts=new HashSet<String>();
		 for(int i=0;i<allOption.size();i++)
		 {
			 String op = allOption.get(i).getText();
			 ts.add(op);
			 
		 }
		 //to read the option from set
		 for(String option:ts)
		 {
			 Thread.sleep(2000);
			 System.out.println(option);
			 
		 }
		 

		// TODO Auto-generated method stub

	}

}
