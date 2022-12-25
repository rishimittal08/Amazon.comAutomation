package amazon_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import amazon_source.SelectToDiffrentLink_Source;


public class SelectToDiffrentLink_Tcase extends LoginAmazon_Tcase
{
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		login();	
		SelectToDiffrentLink_Source tc1=new SelectToDiffrentLink_Source(driver);
		tc1.search_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		tc1.dlink_btn();
		tc1.addtocart_btn();
		tc1.nothanx_btn();
		tc1.chkout_btn();
		//ls.logout();
		
				
	}
}
