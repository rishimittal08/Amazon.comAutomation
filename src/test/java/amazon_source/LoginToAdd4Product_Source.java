package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_File;

public class LoginToAdd4Product_Source extends Excel_File
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
	@FindBy(id="nav-link-accountList")
	public WebElement hover_signoutlink;
	@FindBy(id="nav-item-signout")
	WebElement linktosignout;
	
	public LoginToAdd4Product_Source (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void search1_tf()
	{
		search_tf.sendKeys(search1);
	}	
	public void search2_tf()
	{
		search_tf.sendKeys(search2);
	}	
	public void search3_tf()
	{
		search_tf.sendKeys(search3);
	}	
	public void search4_tf()
	{
		search_tf.sendKeys(search4);
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
	public void signout()
	{
		linktosignout.click();
	}
}
