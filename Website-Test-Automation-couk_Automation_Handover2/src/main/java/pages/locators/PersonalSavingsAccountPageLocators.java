package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalSavingsAccountPageLocators {

	// Page Factory - OR:

	// UAT- Locators

	

	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement savingsNavLink;

	@FindBy(xpath = "//a[contains(text(),'Personal savings accounts')]")
	public WebElement personalSavingsAcc;

	@FindBy(xpath = "//h1[normalize-space()='Personal savings accounts']")
	public WebElement personalSavingsAccHeader;

	// Unique Selling points

	@FindBy(xpath = "//h2[normalize-space()='FSCS Protected']")
	public WebElement USPSubHeaderFCSC;

	@FindBy(xpath = "//h2[normalize-space()='Easy account opening']")
	public WebElement USPSubHeaderEasyAcc;

	@FindBy(xpath = "//h2[normalize-space()='Rated \"excellent\"']")
	public WebElement USPSubHeaderRatedExcellent;

	@FindBy(xpath = "//h2[normalize-space()='Consistently competitive returns']")
	public WebElement USPSubHeaderConsistently;

	// Easy Access Account Product Card Labels

	@FindBy(xpath = "//h2[normalize-space()='Easy access account']")
	public WebElement EasyAccessAccountHeader;

	@FindBy(xpath = "(//div[@id='Easy access account']//h3[@class='product-card-savings__column__header'])[1]")
	public WebElement InterestRateLabel;

	@FindBy(xpath = "//div[@id='Easy access account']//h3[@class='product-card-savings__column__header product-card-savings__mid-column-top__header'][normalize-space()='Minimum opening balance']")
	public WebElement MinOpeningBalanceLabel;

	@FindBy(xpath = "//div[@id='Easy access account']//h3[@class='product-card-savings__column__header'][normalize-space()='Suitable if you']")
	public WebElement SuitableForYouLabel;

	@FindBy(xpath="//div[@id='30 day Notice account']//h3[@class='product-card-savings__column__header product-card-savings__mid-column-bottom__header'][normalize-space()='Term']")
	public WebElement TermLabel;

	@FindBy(xpath="//p[contains(text(),'*AER stands for annual equivalent rate and illustr')]")
	public WebElement AERFullForm;

	// Easy Access Account Product Card Values

	@FindBy(xpath = "//div[@id='Easy access account']//span[@class='product-card-savings__rate-value__label']")
	public WebElement EAAInterestRateValue;

	@FindBy(xpath="//div[@id='Easy access account']//span[@class='product-card-savings-balance__caption']")
	public WebElement EAAMinOpeningBalanceValue;

	@FindBy(xpath = "//div[@id='Easy access account']//span[@class='product-card-savings-term__caption']")
	public WebElement EAATermValue;
	
	

	// 30 day notice account card values

	@FindBy(xpath = "//div[@id='30 day Notice account']//span[@class='product-card-savings__rate-value__label']")
	public WebElement ThirtyDaysInterestValue;

	@FindBy(xpath = "//div[@id='30 day Notice account']//span[@class='product-card-savings-balance__caption']")
	public WebElement ThirtyDaysOpeningBalanceValue;

	@FindBy(xpath="(//span[contains(text(),'30 days')])[1] ")
	public WebElement ThirtyDaysTermValue;
	
	@FindBy(xpath="//h2[normalize-space()='30 day notice account']")
	public WebElement ThirtyDaysNoticeAccountHeader;
	
	@FindBy(xpath="//a[@aria-label='View 30 day notice account']//div[contains(text(),'Read more & apply')]")
	public WebElement ThirtyDaysNoticeViewLink;
	
	// 120 day notice account card values

	@FindBy(xpath = "//div[@id='120 day notice account']//span[@class='product-card-savings__rate-value__label']")
	public WebElement days120InterestValue;

	@FindBy(xpath = "//div[@id='120 day notice account']//span[@class='product-card-savings-balance__caption']")
	public WebElement days120OpeningBalanceValue;

	@FindBy(xpath = "//div[@id='120 day notice account']//span[@class='product-card-savings-term__caption'] ")
	public WebElement days120TermValue;
	
	@FindBy(xpath="//h2[normalize-space()='120 day notice account']")
	public WebElement OneTwentyDaysNoticeAccHeader;

	// 1 year fixed rate account Product Card

	@FindBy(xpath="//div[@id='1 year fixed rate account']//strong[1]")
	public WebElement OneYeareFixedRateInterestValue;

	@FindBy(xpath = "//div[@id='1 year fixed rate account']//span[@class='product-card-savings-balance__caption']")
	public WebElement OneYeareFixedRateOpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='1 Year']")
	public WebElement OneYeareFixedRateTermValue;
	
	@FindBy(xpath="//h2[normalize-space()='1 year fixed rate savings account']")
	public WebElement OneYeareFixedRateHeader; 

	// 2 year fixed rate account Product Card

	@FindBy(xpath="//div[@id='2 year fixed rate account']//strong[1]")
	public WebElement TwoYearFixedRateInterestValue;

	@FindBy(xpath = "//div[@id='2 year fixed rate account']//span[@class='product-card-savings-balance__caption']")
	public WebElement TwoYearFixedRateOpeningBalanceValue;

	@FindBy(xpath="//span[normalize-space()='2 years']")
	public WebElement TwoYearFixedRateTermValue;
	
	@FindBy(xpath="//h2[normalize-space()='2 year fixed rate savings account']")
	public WebElement TwoYeareFixedRateHeader;

	// 3 year fixed rate account Product Card

	@FindBy(xpath="//div[@id='3 year fixed rate account']//strong[1]")
	public WebElement ThreeYearFixedRateInterestValue;

	@FindBy(xpath = "//div[@id='3 year fixed rate account']//span[@class='product-card-savings-balance__caption']")
	public WebElement ThreeYearFixedRateOpeningBalanceValue;

	@FindBy(xpath="//span[normalize-space()='3 years']")
	public WebElement ThreeYearFixedRateTermValue;
	
	@FindBy(xpath="//h2[normalize-space()='3 year fixed rate savings account']")
	public WebElement ThreeYeareFixedRateHeader;

	// 4 year fixed rate account Product Card

	@FindBy(xpath="//div[@id='4 year fixed rate account']//strong[1]")
	public WebElement FourYearFixedRateInterestValue;

	@FindBy(xpath = "//div[@id='4 year fixed rate account']//span[@class='product-card-savings-balance__caption']")
	public WebElement FourYearFixedRateOpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='4 years']")
	public WebElement FourYearFixedRateTermValue;
	
	@FindBy(xpath="//h2[normalize-space()='4 year fixed rate savings account']")
	public WebElement FourYeareFixedRateHeader;

	// 5 year fixed rate account Product Card

	@FindBy(xpath="//div[@id='5 year fixed rate account']//strong[1]")
	public WebElement FiveYearFixedRateInterestValue;

	@FindBy(xpath = "//div[@id='5 year fixed rate account']//span[@class='product-card-savings-balance__caption']")
	public WebElement FiveYearFixedRateOpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='5 years']")
	public WebElement FiveYearFixedRateTermValue;
	
	@FindBy(xpath="//h2[normalize-space()='5 year fixed rate savings account']")
	public WebElement FiveYeareFixedRateHeader;

	// 1 year fixed rate cash ISA

	@FindBy(xpath = "//div[@id='1 year fixed ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement OneYearFixedRateISAInterestValue;

	@FindBy(xpath = "//div[@id='1 year fixed ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement OneYearFixedRateISAOpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='1 year']")
	public WebElement OneYearFixedRateISATermValue;
	
	@FindBy(xpath="//h2[normalize-space()='1 year fixed rate cash ISA']")
	public WebElement OneYearFixedRateISAHeader;
	
	
	// 2 year fixed rate cash ISA

	@FindBy(xpath = "//div[@id='2 year fixed ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement TwoYearFixedRateISAInterestValue;

	@FindBy(xpath = "//div[@id='2 year fixed ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement TwoYearFixedRateISAOpeningBalanceValue;

	@FindBy(xpath = "//div[@id='2 year fixed ISA']//span[@class='product-card-savings-term__caption'][normalize-space()='2 years']")
	public WebElement TwoYearFixedRateISATermValue;
	
	@FindBy(xpath="//h2[normalize-space()='2 year fixed rate cash ISA']")
	public WebElement TwoYearFixedRateISAHeader;

	// 3 year fixed rate cash ISA

	@FindBy(xpath = "//div[@id='3 year fixed ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement ThreeYearFixedRateISAInterestValue;

	@FindBy(xpath = "//div[@id='3 year fixed ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement ThreeYearFixedRateISAOpeningBalanceValue;
	
	@FindBy(xpath = "//div[@id='3 year fixed ISA']//span[@class='product-card-savings-term__caption'][normalize-space()='3 years']")
	public WebElement ThreeYearFixedRateISATermValue;
	
	@FindBy(xpath="//h2[normalize-space()='3 year fixed rate cash ISA']")
	public WebElement ThreeYearFixedRateISAHeader;
	
	
	//30 day notice cash ISA
	
	@FindBy(xpath = "//div[@id='30 day notice ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement ThirtyDaysNoticeCashISAInterestValue;
	
	@FindBy(xpath = "//div[@id='30 day notice ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement ThirtyDaysNoticeCashISAOpeningBalanceValue;
	
	@FindBy(xpath="(//span[contains(text(),'30')])[2]")
	public WebElement ThirtyDaysNoticeCashISATermValue;
	
	@FindBy(xpath="//h2[normalize-space()='30 day notice cash ISA']")
	public WebElement ThirtyDaysNoticeCashISAHeader;
	
	//Double access account
	
	@FindBy(xpath = "(//div[@id='Double access account']//li[@class='rate-list-item']//span[@class='product-card-savings__rate-value__label'])[1] ")
	public WebElement DoubleAccessAccountInterestValue1;
	
	@FindBy(xpath = "(//div[@id='Double access account']//li[@class='rate-list-item']//span[@class='product-card-savings__rate-value__label'])[2] ")
	public WebElement DoubleAccessAccountInterestValue2;
	
	@FindBy(xpath ="//div[@id='Double access account']//span[@class='product-card-savings-balance__caption']")
	public WebElement DoubleAccessAccountOpeningBalanceValue;
	
	
	@FindBy(xpath="(//span[@class='product-card-savings-term__caption'])[2] ")
	public WebElement DoubleAccessAccountTermValue;
	
	@FindBy(xpath="//h2[normalize-space()='Double access account']")
	public WebElement DoubleAccessAccHeader;
	
	
	//CTA angled butons
	
	@FindBy(xpath="//a[contains(@aria-label,'View easy access account')]//div[contains(text(),'Read more & apply')]")
	public WebElement EasyAccessAccountButton;
	
	@FindBy(xpath="//a[contains(@aria-label,'View double access account')]//div[contains(text(),'Read more & apply')]")
	public WebElement DoubleAccessAccountButton;
	
	@FindBy(xpath="//a[contains(@aria-label,'View 30 day notice account')]//div[contains(text(),'Read more & apply')]")
	public WebElement ThirtyDaysNoticeAccButton;
	
	@FindBy(xpath="//a[contains(@aria-label,'View 120 day notice account')]//div[contains(text(),'Read more & apply')]")
	public WebElement OneTwentyDaysNoticeAccButton;
	
	@FindBy(xpath="//a[contains(@aria-label,'View 1 year fixed rate account')]//div[contains(text(),'Read more & apply')]")
	public WebElement OneYeareFixedRateButon;
	
	@FindBy(xpath="//a[contains(@aria-label,'View 2 year fixed rate account')]//div[contains(text(),'Read more & apply')]")
	public WebElement TwoYeareFixedRateButon;
	
	@FindBy(xpath="//a[contains(@aria-label,'View 3 year fixed rate account')]//div[contains(text(),'Read more & apply')]")
	public WebElement ThreeYeareFixedRateButon;
	
	@FindBy(xpath="//a[contains(@aria-label,'View 4 year fixed rate account')]//div[contains(text(),'Read more & apply')]")
	public WebElement FourYeareFixedRateButon;
	
	@FindBy(xpath="//a[@aria-label='View 5 year fixed rate account']//div[contains(text(),'Read more & apply')]")
	public WebElement FiveYeareFixedRateButon;
	
	@FindBy(xpath="//a[@aria-label='View 1 year fixed ISA']//div[contains(text(),'Read more & apply')]")
	public WebElement OneYearFixedISAButton;
	
	@FindBy(xpath="//a[@aria-label='View 2 year fixed ISA']//div[contains(text(),'Read more & apply')]")
	public WebElement TwoYearFixedISAButton;
	
	@FindBy(xpath="//a[@aria-label='View 3 year fixed ISA']//div[contains(text(),'Read more & apply')]")
	public WebElement ThreeYearFixedISAButton;
	
	@FindBy(xpath="//a[@aria-label='View 30 day notice ISA']//div[contains(text(),'Read more & apply')]")
	public WebElement ThirtyDaysNoticeCashISAButton;
	
	
	//Important personal savings forms and documents
	
	@FindBy(xpath="//h2[normalize-space()='Important personal savings forms and documents']")
	public WebElement ImportantpersonalsavingsformsanddocumentsHeader;
	
	@FindBy(xpath="(//a[normalize-space()='Forms and documents'])[1]")
	public WebElement ImportantpersonalsavingsformsanddocumentsLink;
	
	
	
	//Existing customer log in
	
	@FindBy(xpath="//h2[normalize-space()='Existing customer log in']")
	public WebElement ExistingCustomerLoginHeader;
	
	@FindBy(xpath="//a[normalize-space()='Existing customer log in']")
	public WebElement ExistingCustomerLoginLink;
	
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookies;
	
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='Keeping your money safe']")
	public WebElement ImageCopySectionHeader;

}
