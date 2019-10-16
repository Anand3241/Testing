package sourcesoft.proassur;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.Homepage;

public class HomePageTest extends BaseLib
{
  Homepage p;
  
  
 @Test(dataProvider="getCRMTestData")
 public void verify_login_functionality(String email_id,String passowrd)
 {
	 p=new Homepage(driver);
	 p.login(email_id,passowrd);
 }
 
 @DataProvider
	public Object[][] getCRMTestData() throws EncryptedDocumentException, IOException
 {
		Object data[][] = ExcelLib.getExceldata("Sheet1");
		return data;
}
}