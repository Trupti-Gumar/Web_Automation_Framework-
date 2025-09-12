package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_AssetFinancePageLocators {
	
	@FindBy(xpath="//span[normalize-space()='Asset finance']")
	public WebElement AssetFinanceLink;
	
	//Masthead Medium

	@FindBy(xpath="//h1[normalize-space()='Asset Finance']")
	public WebElement AssetFinanceHeader;
	
	//USP
	
	@FindBy(xpath="//h2[normalize-space()='Expertise']")
	public WebElement AssetFinanceUSP1;
	
	@FindBy(xpath="//h2[normalize-space()='Funding']")
	public WebElement AssetFinanceUSP2;
	
	@FindBy(xpath="//h2[normalize-space()='Service']")
	public WebElement AssetFinanceUSP3;
	
	//Cards Headers
	
	@FindBy(xpath="//h2[normalize-space()='Construction']")
	public WebElement ConstructionCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Transportation']")
	public WebElement TransportationCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Hire Purchase']")
	public WebElement HirePurchaseCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Lease']")
	public WebElement LeaseCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Refinance']")
	public WebElement RefinanceCardHeader;
	
	//Card Links
	
	@FindBy(xpath="//a[normalize-space()='Construction']")
	public WebElement ConstructionCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Transportation']")
	public WebElement TransportationCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Hire Purchase']")
	public WebElement HirePurchaseCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Lease']")
	public WebElement LeaseCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Refinance']")
	public WebElement RefinanceCardLink;
	
	
	//Asset Finance FAQs
	
	@FindBy(xpath="//h2[normalize-space()='Asset Finance FAQs']")
	public WebElement AssetFinanceFAQHeader;
	
/*	@FindBy(xpath="//h3[contains(text(),'How is asset finance different to other forms of f')]")
	public WebElement AssetFinanceFAQAccordian; */
	
	@FindBy(xpath="//h3[contains(text(),'How is asset finance different to other forms of f')]")
	public WebElement AssetFinanceFAQAccordian;
	
	@FindBy(xpath="//p[contains(text(),'Unlike overdrafts, asset finance is not repayable ')]")
	public WebElement AssetFinanceFAQATextBlock;
	
	@FindBy(xpath="//h2[@class='card-more-faq__title']")
	public WebElement MoreCardTitle;
	
	@FindBy(xpath="//a[normalize-space()='View Asset Finance FAQs']")
	public WebElement MoreCardLink;
	
	//Award
	
	@FindBy(xpath="(//h2[@class='h2-heavy__header'])[4]")
	public WebElement AwardHeader;
	
	
	//Customer Story Card
	
	@FindBy(xpath="//a[normalize-space()='Customer stories']")
	public WebElement CustomerstoriesCard;
	
	@FindBy(xpath="//a[@class='title-link-card__a u-faux-box-link__overlay'][normalize-space()='Business finance']")
	public WebElement BusinessfinanceCard;
	
	@FindBy(xpath="//a[@class='title-link-card__a u-faux-box-link__overlay'][normalize-space()='Help and support']")
	public WebElement HelpSupportCard;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
