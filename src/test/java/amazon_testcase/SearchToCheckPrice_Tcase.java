package amazon_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import amazon_source.SearchToCheckPrice_Source;

public class SearchToCheckPrice_Tcase extends LoginAmazon_Tcase
{
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		login();	
		SearchToCheckPrice_Source tc1= new SearchToCheckPrice_Source(driver);
		tc1.search_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		
		//ls.logout();
		
	}
}
