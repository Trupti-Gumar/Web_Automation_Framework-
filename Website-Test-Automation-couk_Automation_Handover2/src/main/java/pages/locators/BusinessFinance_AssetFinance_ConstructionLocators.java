package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_AssetFinance_ConstructionLocators {

	@FindBy(xpath="//a[normalize-space()='Construction']")
	public WebElement ConstructionCardLink;
	
	@FindBy(xpath="//h1[normalize-space()='Construction']")
	public WebElement MastheadHeader;
	
	//Masthead black box
	
	@FindBy(xpath="//h2[@class='masthead-black-box__header masthead-black-box__header__cta']")
	public WebElement MastheadBlackBoxHeader;
	
	@FindBy(xpath="//a[normalize-space()='Get in touch']")
	public WebElement MastheadBlackBoxCTAButton;
	
	//USP
	
	@FindBy(xpath="//h2[normalize-space()='Expertise']")
	public WebElement USPSubHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Funding']")
	public WebElement USPSubHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Service']")
	public WebElement USPSubHeader3;
	
	//Video Block
	
	@FindBy(xpath="//h2[normalize-space()='Watch our video']")
	public WebElement VideoBlockHeader;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='What we can finance']")
	public WebElement ImageCopyHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Our finance solutions']")
	public WebElement ImageCopyHeader2;
	
	//BDM Card
	
	@FindBy(xpath="//h2[normalize-space()='Jon Burrell']")
	public WebElement BDMCardHeader;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
