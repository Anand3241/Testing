package sourcesoft.proassur;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjectModel.Homepage;
import pageObjectModel.TestScenarios;

@Listeners(sourcesoft.proassur.ListenerTest.class)

public class HomePageTest extends BaseLib
{
  Homepage p;
  TestScenarios tes;
  
  
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

@Test
public void test_hover()
{
	Utility.switch_tonew_window();
	tes=new TestScenarios(driver);
	Utility.hover_on(tes.hover_on_tools());
	Utility.waitTillPageLoad(10);
	tes.clk_on_career_navigator_method().click();
	Utility.switch_totabs();
	Utility.selectElementByvalueMethod(tes.select_year_method(),"2006");
	
	
	
	
}

}