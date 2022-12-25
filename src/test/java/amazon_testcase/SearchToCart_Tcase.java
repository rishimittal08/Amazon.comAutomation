package amazon_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import amazon_source.SearchToCart_Source;

public class SearchToCart_Tcase extends LoginAmazon_Tcase
{
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		login();	
		SearchToCart_Source tc1=new SearchToCart_Source(driver);
		tc1.search_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtocart_btn();
		tc1.chkout_btn();
		//ls.logout();
		
				
	}
}
