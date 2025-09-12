package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages_CommercialMortgagesLocators {
	
	@FindBy(xpath ="//li[@class='navigation-menu__dropdown-single-menu__item']/*[@aria-label='Commercial mortgages']")
	public WebElement CommercialDropDown;
	
	@FindBy(xpath ="//div[@class='masthead-text-container']/h1")
	public WebElement CommericalMortgagePageTitle;
	
	@FindBy(xpath = "//section[@class='unique-selling-points__section__grid']/article[1]/h2")
	public WebElement USPHeader1;
	
	@FindBy(xpath = "//section[@class='unique-selling-points__section__grid']/article[2]/h2")
	public WebElement USPHeader2;
 
	@FindBy(xpath = "//section[@class='unique-selling-points__section__grid']/article[3]/h2")
	public WebElement USPHeader3;
	
	@FindBy(xpath = "//section[@class='unique-selling-points__section__grid']/article[4]/h2")
	public WebElement USPHeader4;
	
	@FindBy(xpath ="//div[@class='image-copy-default__container']/h2[contains(text(),'Commercial mortgage specialists')]")
	public WebElement ImageSection1;
	
	@FindBy(xpath ="//div[@class='image-copy-default__container']/h2[contains(text(),'Product highlights')]")
	public WebElement ImageSection2;
	
	@FindBy(xpath ="//div[@class='image-copy-circle__right']/h2[contains(text(),'VAT loans')]")
	public WebElement ImageSection3;
	
	
	@FindBy(xpath = "//a[contains(text(),'Property development finance')]")
	public WebElement CardHeader1;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/div/div[2]/a")
	public WebElement CardHeader2;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom margin-side']/div/div[3]/a")
	public WebElement CardHeader3;
	
	@FindBy(xpath = "//*[@class='umb-block__root margin-bottom ']/a")
	public WebElement bottomlink;
	
	@FindBy(xpath ="//div[@class='item-container backlink']/div/h1")
	public WebElement bottomPageTitle;
	
	@FindBy(xpath = "//section[@class='masthead-black-box']/h2")
	public WebElement BlackBoxHeader;
	
	
}
