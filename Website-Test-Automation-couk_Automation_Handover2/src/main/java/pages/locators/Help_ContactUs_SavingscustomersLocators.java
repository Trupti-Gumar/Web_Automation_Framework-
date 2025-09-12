package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_ContactUs_SavingscustomersLocators {
	
	@FindBy(xpath = "//Span[normalize-space()='Help']")
	public WebElement HelpButton;
	
	@FindBy(xpath = "//a[@data-parent-title='Help and support'][normalize-space()='Contact us']")
	public WebElement ContactUsButton;
	
	@FindBy(xpath = "//a[normalize-space()='Savings']")
	public WebElement SavingscustomersCardHeader;
		
//	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/div/a")
//	public WebElement SavingscustomersCardCTAButton;
	
	@FindBy(xpath = "//h1[normalize-space()='Contact information for savings customers']")
	public WebElement SavingsCustomersPageHeader;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement OneTrustCookies;
	
	@FindBy(xpath = "//h2[normalize-space()='Contact information for savings customers']")
	public WebElement Subheader;
	
	@FindBy(xpath = "//h3[normalize-space()='Personal savings']")
	public WebElement ExpandOptions;
	
	@FindBy(xpath = "//div[@class='section-body']")
	public WebElement Options1;
	
	
	
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	
	
	
}
