package amazon_testcase;

import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import amazon_source.LoginAmazon_Source;
import utilities.Excel_File;

public class LoginAmazon_Tcase extends LaunchExit_Tcase
{
	public static void login() throws EncryptedDocumentException, IOException, InvalidFormatException 
	{
		Excel_File es=new Excel_File();
		es.ExcelSheet();
		LoginAmazon_Source ls1=new LoginAmazon_Source(driver);
		
		/*Scanner s1=new Scanner(System.in);
		String s=s1.next();
		driver.findElement(By.xpath("//*[@id='captchacharacters']")).sendKeys(s);
		driver.findElement(By.xpath("//*[text()='Continue shopping']")).click();*/
		
		Actions a1=new Actions(driver);	
		a1.moveToElement(ls1.hover_signinlink).perform();	
		ls1.signin();
		ls1.uname_tf();
		ls1.cont_btn();
		ls1.password_tf();
		ls1.sbmt_btn();
		
		/*String a=s1.next();
		driver.findElement(By.id("ap_password")).sendKeys(a);
		String b= s1.next();
		driver.findElement(By.id("auth-captcha-guess")).sendKeys(b);
		driver.findElement(By.id("signInSubmit")).click();*/
		
		String expected_title="Amazon Sign-In";
		String original_title=driver.getTitle();
		//System.out.println(original_title);
		Assert.assertEquals(original_title,expected_title);
	}
	
	/*public void logout()
	{
		LoginAmazon_Source ls1=new LoginAmazon_Source(driver);
		driver.navigate().back();
		Actions a2=new Actions(driver);	
		a2.moveToElement(ls1.hover_signoutlink).perform();
		ls1.signout();
		
	}*/
}
