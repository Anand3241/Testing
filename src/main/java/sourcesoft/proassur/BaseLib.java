package sourcesoft.proassur;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseLib 
{
 public  WebDriver driver; 
 public static ExtentReports reports;
 public static ExtentTest test;
   FileInputStream fis;
   File file;
   Properties p;
   @BeforeTest
   public void startTest()
   {
	   reports= new ExtentReports(System.getProperty("user.dir")+"/Report/report.html", true);
	   reports.addSystemInfo("Hostname", "Anand");
	   reports.addSystemInfo("Enviornment", "QA");
	   reports.addSystemInfo("User Name", "Anand Srivastava");
	   reports.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
   }
   @BeforeMethod
   @Parameters(value="browser")
   
   public void preCondition(String browser) throws IOException
   {
	   file=new File(System.getProperty("user.dir")+"/object_repository.properties");
	fis= new FileInputStream(file);
		  p= new Properties();
		  p.load(fis); 
	   
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		 
		  System.setProperty("webdriver.gecko.driver",new File(System.getProperty("user.dir"))+"/exeFiles/geckodriver.exe");
		  driver= new FirefoxDriver();
		
		  test= reports.startTest("Proassur Testing");
		  test.log(LogStatus.INFO, "Open the browser");
		  String u = p.getProperty("url");
			System.out.println(u);
		   driver.get(u);
		  String title = driver.getTitle();
		  System.out.println(title);
		   String url = driver.getCurrentUrl();
		   System.out.println(url);
		
	  } 
		  else
		  {
			  System.setProperty("webdriver.chrome.driver",new File(System.getProperty("user.dir"))+"/exeFiles/chromedriver.exe");
			 
			  driver= new ChromeDriver();
			 test= reports.startTest("Proassur Testing");
			  test.log(LogStatus.INFO, "Open the browser");
			String u = p.getProperty("url");
			System.out.println(u);
			  driver.get(u);
			  String title = driver.getTitle();
			  System.out.println(title);
			  
			   String url = driver.getCurrentUrl();
			   System.out.println(url);
		  }
		
		 
		  
		  
	  }
   
   
   @AfterMethod
   public void postCondition(ITestResult r)
   {
	   if(r.getStatus()==ITestResult.FAILURE)
	   {
		      test= reports.startTest("Capture Screen Shot");
		      String screenShotpath = GetScreenShotLib.capture(driver, r.getName());
		        test.log(LogStatus.FAIL, r.getThrowable());
		        test.log(LogStatus.FAIL, "snapshot below:"+test.addScreenCapture(screenShotpath));
		        
		        
	   }
	 
   }
   @AfterTest
   public void endReport()
   {
	   reports.flush();
	   driver.close();
   }
   
   @DataProvider
  	public Object[][] getCRMTestData() throws EncryptedDocumentException, IOException
   {
  		Object data[][] = ExcelLib.getExceldata("Sheet1");
  		return data;
  }
}
