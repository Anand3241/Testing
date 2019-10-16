package sourcesoft.proassur;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener
{
	private By lastFindBy;
	private WebElement lastElement;
	private String originalValue;

	@Override
	public void beforeAlertAccept(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver)
	{
		System.out.println("Before Navigate To: "+url+" My url was "+driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver)
	{
		System.out.println("After navigating To:"+url+"My url is"+driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) 
	{
		System.out.println("Before navigating back. I was at  "+driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver)
	{
		System.out.println("after Navigating back. I am at: "+driver.getCurrentUrl());
	}

	@Override
	public void beforeNavigateForward(WebDriver driver)
	{
		System.out.println("Before navigating forward. I was at"+driver.getCurrentUrl());
	}

	@Override
	public void afterNavigateForward(WebDriver driver)
	{
		System.out.println("After navigating forward: I am at: "+driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) 
	{
		lastFindBy = by;
		  System.out.println("Trying to find: '" + lastFindBy + "'.");                             
		System.out.println("Trying to find"+by.toString()+".");
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver)
	{
		lastFindBy = by;
		 System.out.println("Found: '" + lastFindBy + "'.");
		System.out.println("Found"+by.toString()+".");
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) 
	{
		System.out.println("Trying to click "+element);
		for(int i=0;i>1;i++)
		{
	      JavascriptExecutor js= (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"color: black; border: 3px solid black;");
		}
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) 
	{
		System.out.println("Clicked element with "+element);
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)
	{
		 lastElement = element; 
		  String originalValue = element.getText();
			 if(originalValue.isEmpty())
			 {
				originalValue=element.getAttribute("");
			 }
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)
	{
		lastElement = element;
		String changedValue="";
		try
		{
			changedValue=element.getText();
		}
		catch(StaleElementReferenceException e)
		{
		System.out.println("Could not log change of element, because of a stale"+"element reference exception.");
		return;
		}
		//if element is not visible
		if(changedValue.isEmpty())
		{
			 changedValue = element.getAttribute("value");
		}
		System.out.println("Changing value in element found " +lastElement+ "from "+originalValue+ "to"+changedValue  );
	
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

}
