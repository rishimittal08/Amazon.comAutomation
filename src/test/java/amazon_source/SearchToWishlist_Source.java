package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_File;

public class SearchToWishlist_Source extends Excel_File
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	@FindBy(id="nav-search-submit-button")
	WebElement searchsubmit_btn;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div")
	WebElement selfirst_link;
	@FindBy(id="add-to-wishlist-button")
	WebElement addtowishlist_drpdwn;
	@FindBy(xpath="//*[@id=\"atwl-link-to-list-6GI8JB2ABSYV\"]/span/div/div")
	WebElement drpdwn;
	@FindBy(xpath="//*[@id=\"huc-atwl-asin-button-group\"]/div[2]")
	WebElement cont_btn;
	@FindBy(id="nav-link-accountList")
	public WebElement hover_signoutlink;
	@FindBy(id="nav-item-signout")
	WebElement linktosignout;
	
	public SearchToWishlist_Source (WebDriver driver)
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
	public void continue_btn()
	{
		cont_btn.click();
	}
	public void signout()
	{
		linktosignout.click();
	}
	
}
