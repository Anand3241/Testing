package sourcesoft.proassur;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseLib
{
 public static Select sel;	
 public static Actions builder;
   public static void selectElementByvalueMethod(WebElement ele,String value)
   {
	   sel=new Select(ele);
	  sel.selectByValue(value);
   }
   
   public static void selectElementByIndexMethod(WebElement element, int index)
   {
	 sel= new Select(element);
	 sel.selectByIndex(index);
   }
   
   public static void selectElementByNameMethod(WebElement element, String Name)
   {
	    sel = new Select(element);
	   sel.selectByVisibleText(Name);
   }
   
   public static void dragAndDrop(WebElement fromWebElement,WebElement toWebElement)
   {
		    builder = new Actions(driver);
		   builder.dragAndDrop(fromWebElement, toWebElement);
		   
		   }

   public static void dragAndDrop_Method2(WebElement fromWebElement,WebElement toWebElement)
   {
		   builder = new Actions(driver);
		   Action dragAndDrop = builder.clickAndHold(fromWebElement)
		   .moveToElement(toWebElement).release(toWebElement).build();
		   dragAndDrop.perform();
		   
		   }

   public static void dragAndDrop_Method3(WebElement fromWebElement, WebElement toWebElement) throws InterruptedException
	{
		    builder = new Actions(driver);
		   builder.clickAndHold(fromWebElement).moveToElement(toWebElement).perform();
		   Thread.sleep(2000);
		   builder.release(toWebElement).build().perform();
		   
    }
   
   
}
