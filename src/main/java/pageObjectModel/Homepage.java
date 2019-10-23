package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage
{
	
 public Homepage(WebDriver driver)
 {
	 
	 PageFactory.initElements(driver,this);
 }
 
 @FindBy(xpath="//strong[text()='LOGIN']")
 private WebElement clk_login;
 
 @FindBy(id="email")
 private WebElement enter_email;
 
 @FindBy(xpath="//input[@id='password']")
 private WebElement enter_pass;
 
 @FindBy(xpath="//button[text()='Login']")
 private WebElement clk_login_btn;
 
 
 
 
 public void login(String email,String pass)
 {
	 clk_login.click();
	 enter_email.sendKeys(email);
	 enter_pass.sendKeys(pass);
	 clk_login_btn.click();
	 System.out.println("Hello testing");
	 System.out.println("I am in brach 2");
	 
 }
 
}
