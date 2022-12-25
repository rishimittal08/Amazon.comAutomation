package amazon_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import amazon_source.SearchToAddNewAddress_Source;

public class SearchToAddNewAddress_Tcase extends LoginAmazon_Tcase
{

	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, InvalidFormatException, InterruptedException
	{
		login();	
		SearchToAddNewAddress_Source tc1=new SearchToAddNewAddress_Source(driver);
		tc1.search_tf();
		tc1.search_btn();
		tc1.selectfirst_link();
		tc1.addtocart_btn();
		tc1.chkout_btn();
		tc1.chgaddress_btn();
		tc1.newaddress_btn();
		tc1.entername_tf();
		tc1.mobile_tf();
		Thread.sleep(2000);
		tc1.address1_tf();
		Thread.sleep(2000);
		tc1.address2_tf();
		Thread.sleep(2000);
		tc1.entercity_tf();
		Thread.sleep(2000);
		tc1.state_drpdwn();
		Thread.sleep(2000);
		tc1.selectdrpdwn();
		tc1.enterzip_tf();
		Thread.sleep(2000);
		tc1.checkbox();
		Thread.sleep(2000);
		tc1.Submit_btn();
		//ls.logout();
	}
		
				
}
