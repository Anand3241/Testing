package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestScenarios
{
 @FindBy(xpath="//div[text()='Recruiters']")
 private WebElement clk_recruitment;
 
 @FindBy(xpath="//li[contains(text(),'IT')]")
 private WebElement clk_on_IT;
 
 @FindBy(xpath="//div[text()='Tools']")
 private WebElement hover_tools;
 
 @FindBy(xpath="//a[contains(text(),'Career Navigator (β)')]")
 private WebElement clk_on_career_navigator;
 
 @FindBy(xpath="(//select[@id='selectCP0'])[1]")
 private WebElement select_year;
 
 public TestScenarios(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 
 public WebElement get_clk_recruit()
 {
	return clk_recruitment;
	 
	 
 }
 
 public WebElement clk_onit()
 {
	return clk_on_IT;
	 
 }
 
 public WebElement hover_on_tools()
 {
	 return hover_tools;
 }
 public WebElement clk_on_career_navigator_method()
 {
	return clk_on_career_navigator;
	 
 }
 
 public WebElement select_year_method()
 
 {
	return select_year;
	 
 }
 
 
 
}
