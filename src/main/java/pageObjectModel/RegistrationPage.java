package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage
{
 
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
@FindBy(xpath="//strong[text()='SIGNUP']")
private WebElement clk_sign_up;

@FindBy(id="first_name")
private WebElement f_name;

@FindBy(id="last_name")
private WebElement l_name;

@FindBy(id="mobile_code")
private WebElement m_code;

@FindBy(id="mobile")
private WebElement m_number;

@FindBy(id="password")
private WebElement password;

@FindBy(id="confirm_password")
private WebElement confirm_password;


@FindBy(id="site_location")
private WebElement location;

@FindBy(id="email")
private WebElement email;


public WebElement click_signup()
{
	return clk_sign_up;
	
}


public WebElement get_firstname()
{
	return f_name;
	
}

public WebElement get_lastname()
{
	return l_name;
	
}

public WebElement get_mobile_code()
{
	return m_code;
	
}


public WebElement get_mobileNumber()
{
	return m_number;
	
}

public WebElement get_password()
{
	return password;
	
}


public WebElement get_confirm_passowrd()
{
	return confirm_password;
	
}

public WebElement get_location()
{
	return location;
	
}
public WebElement get_email()
{
	return email;
	
}
}
