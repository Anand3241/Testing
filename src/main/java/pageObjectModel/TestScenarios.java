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
}
