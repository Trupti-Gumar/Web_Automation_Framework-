package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateTreasuryPageLocators {

	@FindBy(xpath="//span[normalize-space()='Savings']")
	public WebElement Savingstab;

	@FindBy(xpath="//span[normalize-space()='Corporate deposits (£1m+ deposits)']")
	public WebElement CorporatedepositsMenuItem;

	@FindBy(xpath="//h1[normalize-space()='Corporate Deposits']")
	public WebElement CorporatedepositsHeader;
	
	//USP Section
	
	@FindBy(xpath="//h2[normalize-space()='Financial strength']")
	public WebElement USPSubHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Flexible deposit options']")
	public WebElement USPSubHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Human approach']")
	public WebElement USPSubHeader3;
	
	@FindBy(xpath="//h2[normalize-space()='Competitive returns']")
	public WebElement USPSubHeader4;
	
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='Specialists across a range of industries']")
	public WebElement ImageCopyHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Our deposit solutions are suitable for:']")
	public WebElement ImageCopyHeader2;
	
	//BDM Card
	
	@FindBy(xpath="//h2[normalize-space()='Ray Mariconda']")
	public WebElement BDMCardHeader;
	
	//Yellow CTA banner
	
	@FindBy(xpath="//a[normalize-space()='Request a call back from our team to get started']")
	public WebElement YellowCTABanner;
	
	
	
	//Cards
	
	@FindBy(xpath="//a[normalize-space()='Corporate Treasury Terms And Conditions']")
	public WebElement corporateTrasuryCard;
	
	@FindBy(xpath="//a[normalize-space()='FSCS Information Sheet']")
	public WebElement FSCSCard;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
