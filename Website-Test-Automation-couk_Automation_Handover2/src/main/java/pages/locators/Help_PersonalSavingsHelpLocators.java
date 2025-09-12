package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_PersonalSavingsHelpLocators {


	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	@FindBy(xpath = "//span[@class='navigation-menu__button-caption__span'][normalize-space()='Help']")
    public WebElement HelpOption;
   
	@FindBy(xpath="//h1[normalize-space()='Help and support']")
	public WebElement HelpPageHeader;
	
	@FindBy(xpath="//a[normalize-space()='Personal savings help']")
	public WebElement PersonalSavingsHelpCardHeader;
	
	@FindBy(xpath="//h1[normalize-space()='Personal savings help and support']")
	public WebElement PersonalSavingsHelpPageHeader;
		
	@FindBy(xpath="//a[normalize-space()='Will my savings be covered by the FSCS?']")
	public WebElement FrequentQuestionText1;
	
	@FindBy(xpath="//a[normalize-space()='How do I pay money into my account?']")
	public WebElement FrequentQuestionText2;
	
	@FindBy(xpath="//a[normalize-space()='How do I log in?']")
	public WebElement FrequentQuestionText3;
	
	@FindBy(xpath="//a[normalize-space()='How do I withdraw money from my account?']")
	public WebElement FrequentQuestionText4;
	
	@FindBy(xpath="//a[normalize-space()='What happens at maturity of my Fixed Rate Account?']")
	public WebElement FrequentQuestionText5;
	
	@FindBy(xpath="//a[normalize-space()='What does the base rate change mean for my interest rate?']")
	public WebElement FrequentQuestionText6;
	
	@FindBy(xpath="//a[normalize-space()='What is a personal savings allowance?']")
	public WebElement FrequentQuestionText7;
	
	@FindBy(xpath="//h2[normalize-space()='Safer savings']")
	public WebElement CardHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Opening an account and paying money in']")
	public WebElement CardHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Using online banking']")
	public WebElement CardHeader3;
	
	@FindBy(xpath="//h2[normalize-space()='Statements and balances']")
	public WebElement CardHeader4;
	
	@FindBy(xpath="//h2[normalize-space()='Account maturities and transfers']")
	public WebElement CardHeader5;
	
	@FindBy(xpath="//h2[normalize-space()='Withdrawing money and closing your account']")
	public WebElement CardHeader6;
	
	@FindBy(xpath="//h2[normalize-space()='ISA help']")
	public WebElement CardHeader7;
		
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Safer savings']")
	public WebElement CardHeaderLink1;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Opening or closing an account']")
	public WebElement CardHeaderLink2;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Using online banking']")
	public WebElement CardHeaderLink3;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Statements and balances']")
	public WebElement CardHeaderLink4;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Account maturities and transfers']")
	public WebElement CardHeaderLink5;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Withdrawing money or closing your account']")
	public WebElement CardHeaderLink6;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='ISA help']")
	public WebElement CardHeaderLink7;
		
	@FindBy(xpath ="//h2[normalize-space()='FSCS Protection']") 
    public WebElement ImageCopyHeader1;
   
    @FindBy(xpath ="//h2[normalize-space()='What to do when someone dies']")
    public WebElement ImageCopyHeader2;
   
    @FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button'][normalize-space()='Find out more about FSCS Protection']")
    public WebElement ImageCopyLink1;
   
    @FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button'][normalize-space()='Bereavement guide']")
    public WebElement ImageCopyLink2;
   
    @FindBy(xpath="//h2[normalize-space()='Call us']")
	public WebElement ContactCardHeader1;
    
    @FindBy(xpath="//h2[normalize-space()='Email us']")
	public WebElement ContactCardHeader2;
    
    @FindBy(xpath="//h2[normalize-space()='Message us']")
	public WebElement ContactCardHeader3;
    
    @FindBy(xpath="//h2[normalize-space()='Opening hours']")
	public WebElement ContactCardHeader4;
    
    @FindBy(xpath="//h2[normalize-space()='Contact us by post']")
	public WebElement ContactCardHeader5;
    
    @FindBy(xpath = "//h2[normalize-space()='Useful links']")
	public WebElement MastheadBlackboxHeader;
   
    @FindBy(xpath = "//span[@class='masthead-black-box__link-title-a'][normalize-space()='Forms and documents']")
	public WebElement MastheadBlackboxLink1;
    
    @FindBy(xpath = "//span[@class='masthead-black-box__link-title-a'][normalize-space()='Bereavement guide']")
	public WebElement MastheadBlackboxLink2;
    
    @FindBy(xpath = "//span[@class='masthead-black-box__link-title-a'][normalize-space()='Financial Services Compensation Scheme']")
	public WebElement MastheadBlackboxLink3;
   
}
