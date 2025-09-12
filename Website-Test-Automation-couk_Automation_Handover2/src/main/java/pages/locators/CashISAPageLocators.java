package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CashISAPageLocators {

	@FindBy(xpath = "//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Savings']")
	public WebElement savingsNavLink;

	@FindBy(xpath = "//span[normalize-space()='Cash ISAs']")
	public WebElement CashISALink;

	@FindBy(xpath = "//h1[normalize-space()='Cash ISAs']")
	public WebElement CashISAHeader;
	
	

	// 1 year fixed rate cash ISA

	@FindBy(xpath = "//div[@id='1 year fixed rate cash ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement OneYearFixedRateISAInterestValue;

	@FindBy(xpath = "//div[@id='1 year fixed rate cash ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement OneYearFixedRateISAOpeningBalanceValue;

	@FindBy(xpath = "//span[normalize-space()='1 year']")
	public WebElement OneYearFixedRateISATermValue;

	@FindBy(xpath = "//h2[normalize-space()='1 year fixed rate cash ISA']")
	public WebElement OneYearFixedRateISAHeader;
	
	@FindBy(xpath="//a[@aria-label='View 1 year fixed rate cash ISA account']//div[contains(text(),'Read more & apply')]")
	public WebElement OneYearISAViewLink;

	// 2 year fixed rate cash ISA

	@FindBy(xpath = "//div[@id='2 year fixed rate cash ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement TwoYearFixedRateISAInterestValue;

	@FindBy(xpath = "//div[@id='2 year fixed rate cash ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement TwoYearFixedRateISAOpeningBalanceValue;

	@FindBy(xpath = "//div[@id='2 year fixed rate cash ISA']//span[@class='product-card-savings-term__caption'][normalize-space()='2 years']")
	public WebElement TwoYearFixedRateISATermValue;

	@FindBy(xpath = "//h2[normalize-space()='2 year fixed rate cash ISA']")
	public WebElement TwoYearFixedRateISAHeader;
	
	@FindBy(xpath="//a[@aria-label='View 2 year fixed rate cash ISA account']//div[contains(text(),'Read more & apply')]")
	public WebElement TwoYearISAViewLink;

	// 3 year fixed rate cash ISA

	@FindBy(xpath = "//div[@id='3 year fixed rate cash ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement ThreeYearFixedRateISAInterestValue;

	@FindBy(xpath = "//div[@id='3 year fixed rate cash ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement ThreeYearFixedRateISAOpeningBalanceValue;

	@FindBy(xpath = "//div[@id='3 year fixed rate cash ISA']//span[@class='product-card-savings-term__caption'][normalize-space()='3 years']")
	public WebElement ThreeYearFixedRateISATermValue;

	@FindBy(xpath = "//h2[normalize-space()='3 year fixed rate cash ISA']")
	public WebElement ThreeYearFixedRateISAHeader;
	
	@FindBy(xpath="//a[@aria-label='View 3 year fixed rate cash ISA account']//div[contains(text(),'Read more & apply')]")
	public WebElement ThreeYearISAViewLink;

	// 30 day notice cash ISA

	@FindBy(xpath = "//div[@id='30 day notice ISA']//span[@class='product-card-savings__rate-value__label']")
	public WebElement ThirtyDaysNoticeCashISAInterestValue;

	@FindBy(xpath = "//div[@id='30 day notice ISA']//span[@class='product-card-savings-balance__caption']")
	public WebElement ThirtyDaysNoticeCashISAOpeningBalanceValue;

	@FindBy(xpath = "(//span[@class='product-card-savings-term__caption'])[4]")
	public WebElement ThirtyDaysNoticeCashISATermValue;

	@FindBy(xpath = "//h2[normalize-space()='30 day notice cash ISA']")
	public WebElement ThirtyDaysNoticeCashISAHeader;
	
	@FindBy(xpath="//a[@aria-label='View 30 day notice ISA account']//div[contains(text(),'Read more & apply')]")
	public WebElement ThirtyDaysNoticeCashISAViewLink;
	
	@FindBy(xpath="//a[normalize-space()='Apply now']")
	public WebElement applyButton;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='What is a Cash ISA?']")
	public WebElement ImageCopySectionHeader1;
	
	
	@FindBy(xpath="//h2[normalize-space()='Looking to open multiple ISAs?']")
	public WebElement ImageCopySectionHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='ISA Transfers']")
	public WebElement ImageCopySectionHeader3;
	
	@FindBy(xpath="//a[normalize-space()='Read more about ISA transfers']")
	public WebElement ISATransferButton;
	
	//FAQ
	
	@FindBy(xpath="//h2[normalize-space()='Cash ISA FAQs']")
	public WebElement FAQHeader;
	
	@FindBy(xpath="//h3[normalize-space()='How many Cash ISAs can I have?']")
	public WebElement AccordianLink;
	
	@FindBy(xpath="//p[contains(text(),'You can split your annual ISA allowance across the')]")
	public WebElement AccordianTextBlock;
	
	@FindBy(xpath="//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeaderOnFAQ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
