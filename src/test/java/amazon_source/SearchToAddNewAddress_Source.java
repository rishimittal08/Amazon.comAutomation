package amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_File;

public class SearchToAddNewAddress_Source extends Excel_File
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	@FindBy(id="nav-search-submit-button")
	WebElement searchsubmit_btn;
	@FindBy(xpath="//div[starts-with(@data-component-type,'s-search-result')][1]//div//span//img")
	WebElement selfirst_link;
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addtocart_btn;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement checkout_btn;
	@FindBy(id="addressChangeLinkId")
	WebElement chg_btn;
	@FindBy(id="add-new-address-popover-link")
	WebElement new_btn;
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement name_tf;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement mob_tf;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement add_tf;
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement add2_tf;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city_tf;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")
	WebElement state_drp;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_5\"]")
	WebElement selectlist;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement zip_tf;
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement default_chkbox;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")
	WebElement sbmt_btn;
	@FindBy(id="nav-link-accountList")
	public WebElement hover_signoutlink;
	@FindBy(id="nav-item-signout")
	WebElement linktosignout;
	
	public SearchToAddNewAddress_Source  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void search_tf()
	{
		search_tf.sendKeys(search1);
	}	
	public void search_btn()
	{
		searchsubmit_btn.click();
	}	
	public void selectfirst_link()
	{
		selfirst_link.click();
	}
	public void addtocart_btn()
	{
		addtocart_btn.click();
	}	
	public void chkout_btn()
	{
		checkout_btn.click();
	}
	public void chgaddress_btn()
	{
		chg_btn.click();
	}
	public void newaddress_btn()
	{
		new_btn.click();
	}
	public void entername_tf()
	{
		name_tf.sendKeys(Keys.CONTROL,"a");
		name_tf.sendKeys(Keys.BACK_SPACE);
		name_tf.sendKeys("Rishi Mittal");
	}
	public void mobile_tf()
	{
		mob_tf.sendKeys("8573478842");
	}
	public void address1_tf()
	{
		add_tf.sendKeys("96 Willow Springs CT");
	}
	public void address2_tf()
	{
		add2_tf.sendKeys("Apt 203");
	}
	public void entercity_tf()
	{
		city_tf.sendKeys("Goleta");
	}
	
	public void state_drpdwn()
	{
		state_drp.click();
	}
	public void selectdrpdwn()
	{
		selectlist.click();
	}
	public void enterzip_tf()
	{
		zip_tf.sendKeys("93117");
	}
	public void checkbox()
	{
		default_chkbox.click();
	}
	public void Submit_btn()
	{
		sbmt_btn.click();
	}
	public void signout()
	{
		linktosignout.click();
	}

}
