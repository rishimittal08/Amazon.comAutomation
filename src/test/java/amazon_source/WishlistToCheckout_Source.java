package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_File;

public class WishlistToCheckout_Source extends Excel_File
{

	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	@FindBy(id="nav-search-submit-button")
	WebElement searchsubmit_btn;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement selfirst_link;
	@FindBy(id="add-to-wishlist-button")
	WebElement addtowishlist_drpdwn;
	@FindBy(xpath="//*[@id=\"atwl-link-to-list-6GI8JB2ABSYV\"]/span/div/div")
	WebElement drpdwn;
	@FindBy(xpath="//*[@id=\"huc-view-your-list-button\"]")
	WebElement view_btn;
	@FindBy(xpath="//*[@id=\"pab-I1ZN1WW1JNEF1E\"]")
	WebElement cart_btn;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div[8]/div/div/ul/li[2]/span/div/div/div/div[2]/div[3]/div/div[2]/div[2]/span[1]/span")
	WebElement chkout_btn;
	@FindBy(id="nav-link-accountList")
	public WebElement hover_signoutlink;
	@FindBy(id="nav-item-signout")
	WebElement linktosignout;
	
	public WishlistToCheckout_Source (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void search_tf()
	{
		search_tf.sendKeys(search3);
	}	
	public void search_btn()
	{
		searchsubmit_btn.click();
	}	
	public void selectfirst_link()
	{
		selfirst_link.click();
	}
	public void addtowishlist()
	{
		addtowishlist_drpdwn.click();
	}	
	public void select_drpdwn()
	{
		drpdwn.click();
	}
	public void viewlist_btn()
	{
		view_btn.click();
	}
	public void addtocart_btn()
	{
		cart_btn.click();
	}
	public void checkout_btn()
	{
		chkout_btn.click();
	}
	public void signout()
	{
		linktosignout.click();
	}
	
}
