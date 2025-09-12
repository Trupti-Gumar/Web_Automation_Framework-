package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_BusinessSavingsHelpLocators {


	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	@FindBy(xpath = "//span[@class='navigation-menu__button-caption__span'][normalize-space()='Help']")
    public WebElement HelpOption;
   
	@FindBy(xpath="//h1[normalize-space()='Help and support']")
	public WebElement HelpPageHeader;
	
	@FindBy(xpath="//a[normalize-space()='Business savings help']")
	public WebElement BusinessSavingsHelpCardHeader;
	
	@FindBy(xpath="//h1[normalize-space()='Business savings help and support']")
	public WebElement BusinessSavingsHelpPageHeader;
		
	@FindBy(xpath="//a[normalize-space()='How do I pay money into my Business Savings Account?']")
	public WebElement PopularQuestionText1;
	
	@FindBy(xpath="//a[normalize-space()='What happens when my Fixed Rate account matures?']")
	public WebElement PopularQuestionText2;
	
	@FindBy(xpath="//a[@aria-label=\"What do I do if I've forgotten my password or username?\"]")
	public WebElement PopularQuestionText3;
	
	@FindBy(xpath="//a[normalize-space()='How do I withdraw money from my Business Savings Account?']")
	public WebElement PopularQuestionText4;
	
	@FindBy(xpath="//a[normalize-space()='How do I set up additional users on my account?']")
	public WebElement PopularQuestionText5;
	
	@FindBy(xpath="//a[normalize-space()='What is a significant owner?']")
	public WebElement PopularQuestionText6;
	
	@FindBy(xpath="//h2[normalize-space()='Applications']")
	public WebElement CardHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Transfers and paying money in']")
	public WebElement CardHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Internet banking']")
	public WebElement CardHeader3;
	
	@FindBy(xpath="//h2[normalize-space()='Withdrawing money']")
	public WebElement CardHeader4;
	
	@FindBy(xpath="//h2[normalize-space()='Maturity']")
	public WebElement CardHeader5;
	
	@FindBy(xpath="//h2[normalize-space()='Closing your account']")
	public WebElement CardHeader6;
	
	@FindBy(xpath="//h2[normalize-space()='Security']")
	public WebElement CardHeader7;
		
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Business savings applications']")
	public WebElement CardHeaderLink1;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Transfers and paying money in']")
	public WebElement CardHeaderLink2;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Internet banking']")
	public WebElement CardHeaderLink3;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Withdrawing money']")
	public WebElement CardHeaderLink4;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Maturity']")
	public WebElement CardHeaderLink5;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Closing your account']")
	public WebElement CardHeaderLink6;
	
	@FindBy(xpath="//a[@class='ald_cta_analytics u-faux-box-link__overlay ald-focus__button'][normalize-space()='Security']")
	public WebElement CardHeaderLink7;
		
	@FindBy(xpath ="//a[normalize-space()='Forgotten password reset']") 
    public WebElement ForgottenPasswordResetButton;
       
    @FindBy(xpath = "//h2[normalize-space()='Quick links']")
	public WebElement MastheadBlackboxHeader;
   
    @FindBy(xpath = "//span[@class='masthead-black-box__link-title-a'][normalize-space()='Forms and documents']")
	public WebElement MastheadBlackboxLink1;
    
    @FindBy(xpath = "//span[@class='masthead-black-box__link-title-a'][normalize-space()='Internet banking log in']")
	public WebElement MastheadBlackboxLink2;
   
}
