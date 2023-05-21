package keyworddrivenframework;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;


public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"invalicreads");
		for(int i=1;i<rc;i++)
		{
		String invaliusername = flib.readExcelData(EXCEL_PATH,"invalicreads",i, 0);
	    String invalipassword = flib.readExcelData(EXCEL_PATH,"invalicreads",i, 1);
	    
	    driver.findElement(By.name("username")).sendKeys(invaliusername);
	    driver.findElement(By.name("pwd")).sendKeys(invalipassword);
	    driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
	    driver.findElement(By.name("username")).clear();
	    
		}
		
		bt.closeBrowser();
	}
		// TODO Auto-generated method stub

	}


