package amazon_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import amazon_source.WithoutLoginToCheckout_Source;
import utilities.Excel_File;

public class WithoutLoginToCheckout_Tcase extends LoginAmazon_Tcase
{
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, InvalidFormatException
	{	
		Excel_File es=new Excel_File();
		es.ExcelSheet();
		WithoutLoginToCheckout_Source tc1=new WithoutLoginToCheckout_Source(driver);
		tc1.search_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtocart_btn();
		tc1.chkout_btn();
		tc1.uname_tf();
		tc1.cont_btn();
		tc1.password_tf();
		tc1.sbmt_btn();
		//ls.logout();
		
				
	}
}
