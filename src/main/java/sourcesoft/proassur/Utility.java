package sourcesoft.proassur;

import org.openqa.selenium.Alert;
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
   
   public static void checkbox_checking(WebElement ele)
   {
	   boolean checkbox_status;
	   checkbox_status=ele.isSelected();
	   if(checkbox_status==true)
	   {
		   System.out.println("checkbox is already selected");
      }
	   else
	   {
		   ele.click();
		   System.out.println("Checked the checkbox");
	   }
	   
   }
   public static void radiobutton_Select(WebElement Radio) 
   {
	   boolean checkstatus;
	   checkstatus = Radio.isSelected();
	   if (checkstatus == true)
	   {
	   System.out.println("RadioButton is already checked");
	   }
	   else 
	   {
	   Radio.click();
	   System.out.println("Selected the Radiobutton");
	   }
    }
   
   public static void checkbox_Unchecking(WebElement checkbox)
   {
	   boolean checkstatus;
	   checkstatus = checkbox.isSelected();
	   if (checkstatus == true)
	   {
	   checkbox.click();
	   System.out.println("Checkbox is unchecked");
	   } 
	   else
	   {
	   System.out.println("Checkbox is already unchecked");
	   }
 }
   
   public static void radioButton_Deselect(WebElement Radio)
   {
	   boolean checkstatus;
	   checkstatus = Radio.isSelected();
	   if (checkstatus == true) 
	   {
	   Radio.click();
	   System.out.println("Radio Button is deselected");
	   }
	   else 
	   {
	   System.out.println("Radio Button was already Deselected");
	   }
	   }
   
   public static boolean checkAlert_Accept()
   {
	   try
	   {
	   Alert a = driver.switchTo().alert();
	   String str = a.getText();
	   System.out.println(str);

	   a.accept();
	   return true;

	   } 
	   catch (Exception e)
	   {

	   System.out.println("No alert found");
	   return false;

	   }
  }
   
   public static boolean checkAlert_Dismiss()
   {
	   try
	   {
	   Alert a = driver.switchTo().alert();
	   String str = a.getText();
	   System.out.println(str);

	   a.dismiss();
	   return true;

	   }
	   catch (Exception e) 
	   {

	   System.out.println("No alert found");
	   return false;

	   }
	   }
   
}
