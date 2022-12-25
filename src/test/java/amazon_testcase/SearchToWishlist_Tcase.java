package amazon_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import amazon_source.SearchToWishlist_Source;

public class SearchToWishlist_Tcase extends LoginAmazon_Tcase
{
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		login();	
		SearchToWishlist_Source tc1= new SearchToWishlist_Source(driver);
		tc1.search_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtowishlist();
		tc1.select_drpdwn();
		tc1.continue_btn();
		
		
		//ls.logout()
	}
}
