package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_File;

public class LoginAmazon_Source extends Excel_File
{
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	public WebElement hover_signinlink;
	@FindBy(id="nav-flyout-ya-signin")
	WebElement linktosignin;
	@FindBy(id="nav-signin-tooltip")
	WebElement signin;
	@FindBy(id="ap_email")
	WebElement uname_tf;
	@FindBy(id="continue")
	WebElement continue_btn;
	@FindBy(id="ap_password")
	WebElement pwd_tf;
	@FindBy(id="signInSubmit")
	WebElement submit_btn;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	@FindBy(id="nav-link-accountList")
	public WebElement hover_signoutlink;
	@FindBy(id="nav-item-signout")
	WebElement linktosignout;
	
	
	public LoginAmazon_Source (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void signin()
	{
		linktosignin.click();
	}
	public void signindirectly()
	{
		signin.click();
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
