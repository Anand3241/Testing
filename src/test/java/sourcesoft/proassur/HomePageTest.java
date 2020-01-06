package sourcesoft.proassur;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjectModel.Homepage;
import pageObjectModel.RegistrationPage;
import pageObjectModel.TestScenarios;

@Listeners(sourcesoft.proassur.ListenerTest.class)

public class HomePageTest extends BaseLib
{
  Homepage p;
  TestScenarios tes;
  RegistrationPage res_page;
  
  
 @Test(dataProvider="getCRMTestData",dataProviderClass=BaseLib.class,enabled=false)
 public void verify_login_functionality(String email_id,String passowrd)
 {
	 logger=report.createTest("Login Testing");
	 p=new Homepage(driver);
	 p.login(email_id,passowrd);
	 logger=report.createTest("End the testing");
 }
 
@Test(enabled=false)
public void window_handle()
{
	Utility.switch_tonew_window();
	tes=new TestScenarios(driver);
	tes.get_clk_recruit().click();;
	Utility.switch_totabs();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",tes.clk_onit());

	
	
}

@Test(enabled=false)
public void test_hover()
{
	Utility.switch_tonew_window();
	tes=new TestScenarios(driver);
	Utility.hover_on(tes.hover_on_tools());
	Utility.waitTillPageLoad(10);
	tes.clk_on_career_navigator_method().click();
	Utility.switch_totabs();
	Utility.selectElementByvalueMethod(tes.select_year_method(),"2006");
	
	System.out.println();
	
	
}

@Test(dataProvider="getRegistrationData",dataProviderClass=BaseLib.class)
public void regtistration(String fname,String lname,String m_code,String m_number,String password,String cpassword,String loc,String email)
{
	 res_page=new RegistrationPage(driver);
	 res_page.click_signup().click();
	 res_page.get_firstname().sendKeys(fname);
	 res_page.get_lastname().sendKeys(lname);
	 res_page.get_mobile_code().sendKeys(m_code);
	 res_page.get_mobileNumber().sendKeys(m_number);
	 res_page.get_password().sendKeys(password);
	 res_page.get_confirm_passowrd().sendKeys(cpassword);
	 res_page.get_location().sendKeys(loc);
	 res_page.get_email().sendKeys(email);
	
}

}