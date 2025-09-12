package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_ContactUs_MortgagecustomersLocators {
	
	@FindBy(xpath = "//Span[normalize-space()='Help']")
	public WebElement HelpButton;
	
	@FindBy(xpath = "//a[@data-parent-title='Help and support'][normalize-space()='Contact us']")
	public WebElement ContactUsButton;
	
	@FindBy(xpath = "//a[normalize-space()='Mortgages']")
	public WebElement MortgagecustomersCardHeader;
		
//	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/ul/li[1]/div/a")
//	public WebElement SavingscustomersCardCTAButton;
	
	@FindBy(xpath = "//h1[normalize-space()='Contact information for mortgage customers']")
	public WebElement MortgageCustomersPageHeader;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement OneTrustCookies;
	
	@FindBy(xpath = "//h2[normalize-space()='Residential and buy to let mortgage customers']")
	public WebElement Subheader;
	
	@FindBy(xpath = "//h3[normalize-space()='New customer enquiries']")
	public WebElement ExpandOptions;
	
	@FindBy(xpath = "//div[@class='section-body']")
	public WebElement Options1;
		
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	
	
	
}
