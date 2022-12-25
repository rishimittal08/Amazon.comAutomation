package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_File;

public class WithoutLoginToCheckout_Source extends Excel_File
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
	@FindBy(id="ap_email")
	WebElement uname_tf;
	@FindBy(id="continue")
	WebElement continue_btn;
	@FindBy(id="ap_password")
	WebElement pwd_tf;
	@FindBy(id="signInSubmit")
	WebElement submit_btn;
	@FindBy(id="nav-link-accountList")
	public WebElement hover_signoutlink;
	@FindBy(id="nav-item-signout")
	WebElement linktosignout;
	
	public WithoutLoginToCheckout_Source (WebDriver driver)
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
	public void uname_tf()
	{
		uname_tf.sendKeys(uname);
	}
	public void cont_btn()
	{
		continue_btn.click();
	}	
	public void password_tf()
	{
		pwd_tf.sendKeys(pwd);
	}
	public void sbmt_btn()
	{
		submit_btn.click();
	}
	public void signout()
	{
		linktosignout.click();
	}
	
}
