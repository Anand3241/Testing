package sourcesoft.proassur;


import org.testng.annotations.Test;

import pageObjectModel.Homepage;

public class HomePageTest extends BaseLib
{
  Homepage p;
  
  
 @Test(dataProvider="getCRMTestData",dataProviderClass=BaseLib.class)
 public void verify_login_functionality(String email_id,String passowrd)
 {
	 p=new Homepage(driver);
	 p.login(email_id,passowrd);
 }
 

}