package datadrivenpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// it is use to store generic reusable method
	// all thr method are nonstatic
	public void readExelData(String exelpath) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(exelpath);
	}
}


