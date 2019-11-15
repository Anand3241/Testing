package sourcesoft.proassur;



import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class GetScreenShotLib
{
   public static String capture(WebDriver driver,String screenshotname)
   {
	   try
	   {
		  TakesScreenshot ts = (TakesScreenshot) driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    
		   
		      File destination= new File(System.getProperty("user.dir")+"/screenShot/"+screenshotname+".jpeg");
		//  FileUtils.copyFile(source, destination);
		  
	      FileHandler.copy(source, destination);
		  }
	   
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	return screenshotname;
	
	
   }
   
   
}
