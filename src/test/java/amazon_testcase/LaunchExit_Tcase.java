package amazon_testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchExit_Tcase 
{
	
	public static WebDriver driver;
		
		@BeforeMethod
		public void OpenBrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rishi\\OneDrive\\Desktop\\Driver\\chromedriver.exe");	//ChromeDriver File Path
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		}
		
		@AfterMethod
		public void CloseBrowser() throws IOException
		{
			TakesScreenshot ts1=(TakesScreenshot) driver;			
			File source=ts1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\rishi\\OneDrive\\Desktop\\Testing\\Screenshot" + Math.random()+ ".png" );
			FileUtils.copyFile(source, destination);
			driver.close();
		}
}



