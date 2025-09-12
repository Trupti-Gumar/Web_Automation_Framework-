package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpLocators {


	//@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	//public WebElement AcceptCookiesBtn;
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler' or @title='Accept Cookies' or @aria-label='Accept Cookies']")
	public WebElement AcceptCookiesBtn;

	
	@FindBy(xpath = "//span[@class='navigation-menu__button-caption__span'][normalize-space()='Help']")
    public WebElement HelpOption;
   
	@FindBy(xpath="//h1[normalize-space()='Help and support']")
	public WebElement HelpPageHeader;
   
	@FindBy(xpath="//h2[normalize-space()='Support tailored to you']")
	public WebElement SupportTailoredToYouCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Bereavement']")
	public WebElement BereavementCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Money worries']")
	public WebElement MoneyWorriesCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Personal savings help']")
	public WebElement PersonalsavingshelpCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Business savings help']")
	public WebElement BusinesssavingshelpCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Mortgages help']")
	public WebElement MortgageshelpCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Business finance help']")
	public WebElement BusinessfinancehelpCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Complaints']")
	public WebElement ComplaintsCardHeader;	
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Supporting you']")
	public WebElement SupportTailoredToYouCardHeaderLink;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Bereavement guide']")
	public WebElement BereavementCardHeaderLink;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Cost of living']")
	public WebElement MoneyWorriesCardHeaderLink;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Personal savings help']")
	public WebElement PersonalsavingshelpCardHeaderLink;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Business savings help']")
	public WebElement BusinesssavingshelpCardHeaderLink;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Mortgages help']")
	public WebElement MortgageshelpCardHeaderLink;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Business finance']")
	public WebElement BusinessfinancehelpCardHeaderLink;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Complaint process']")
	public WebElement ComplaintsCardHeaderLink;
	   
    @FindBy(xpath ="//h2[normalize-space()='Protecting yourself from fraud']") 
    public WebElement ImageCopyHeader1;
   
    @FindBy(xpath ="//h2[normalize-space()='Bank of England base rate changes']")
    public WebElement ImageCopyHeader2;
   
    @FindBy(xpath ="//h2[normalize-space()='Our purpose']")
    public WebElement ImageCopyHeader3;
    
    @FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button'][normalize-space()='Online security and protecting yourself from fraud']")
    public WebElement ImageCopyLink1;
   
    @FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button'][normalize-space()='Find out more']")
    public WebElement ImageCopyLink2;
   
    @FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button'][normalize-space()='Read more and download our Report to Society 2023']")
    public WebElement ImageCopyLink3;
    
    @FindBy(xpath = "//h2[normalize-space()='Get in touch']")
	public WebElement MastheadBlackboxHeader;
   
    @FindBy(xpath = "//a[@class='ald-cta ald-cta-primary masthead-black-box-cta-margin ald-focus__button ald_cta_analytics'][normalize-space()='Contact us']")
	public WebElement MastheadBlackboxButton;
   
}
