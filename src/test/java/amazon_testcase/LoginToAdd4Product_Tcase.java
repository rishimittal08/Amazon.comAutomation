package amazon_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import amazon_source.LoginToAdd4Product_Source;


public class LoginToAdd4Product_Tcase extends LoginAmazon_Tcase
{
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, InvalidFormatException, InterruptedException
	{
		login();	
		LoginToAdd4Product_Source tc1=new LoginToAdd4Product_Source(driver);
		tc1.search1_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtocart_btn();
		
		tc1.search4_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtocart_btn();
		
		tc1.search1_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtocart_btn();
		
		tc1.search4_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtocart_btn();
		tc1.chkout_btn();
		
		//ls.logout();
	}
}
