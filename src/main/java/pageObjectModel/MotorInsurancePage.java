package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorInsurancePage
{
  @FindBy(xpath="(//p)[4]")
  private WebElement clk_motor;
  
  @FindBy(xpath="//a[text()='CLICK_HERE']")
  private WebElement clk_here;
  
  @FindBy(xpath="//select[@name='make_id']")
  private WebElement sel_brand;
  
  @FindBy(xpath="//select[@name='designation']")
  private WebElement sel_design;
  
  @FindBy(xpath="//input[@name='registeration_date']")
  private WebElement select_registration_date;
  
  @FindBy(xpath="//td[text()='11']")
  private WebElement sel_date;
  
  @FindBy(xpath="//select[@name='fuel_type']")
  private WebElement sel_fuel_type;
  
  public MotorInsurancePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void vehicle_functionlity()
  {
	  clk_motor.click();
	  clk_here.click();
  }
  
}
