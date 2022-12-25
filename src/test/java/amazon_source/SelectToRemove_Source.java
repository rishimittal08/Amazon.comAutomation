package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_File;

public class SelectToRemove_Source extends Excel_File
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
	@FindBy(xpath="//*[@id=\"delete-button-I1ZN1WW1JNEF1E\"]/span/input")
	WebElement del_btn;
	@FindBy(id="nav-link-accountList")
	public WebElement hover_signoutlink;
	@FindBy(id="nav-item-signout")
	WebElement linktosignout;
	
	public SelectToRemove_Source (WebDriver driver)
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
	public void delete_btn()
	{
		del_btn.click();
	}
	public void signout()
	{
		linktosignout.click();
	}
	
}
