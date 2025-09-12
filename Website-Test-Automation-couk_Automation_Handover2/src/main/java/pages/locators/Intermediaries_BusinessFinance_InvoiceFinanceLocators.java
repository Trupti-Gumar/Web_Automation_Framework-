package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_BusinessFinance_InvoiceFinanceLocators {
	
	
	@FindBy(xpath = "//*[@id=\"Desktop_Nav_Business_finance\"]/div[2]/ul/li[3]/a/span")
	public WebElement InvoiceFinance;
	
	@FindBy(xpath = "//*[@class=\"umb-block__root margin-bottom \"]/div/aside/div/div/h1")
	public WebElement InvoiceFinanceHeader;
	
	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/div/span/section/h2")
	public WebElement Blackboxheader;

	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/div/span/section/ul/li[1]/a/span")
	public WebElement Option1;
	
	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/div/span/section/ul/li[2]/a/span")
	public WebElement Option2;
	
	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/ul/li[1]/article/h2")
	public WebElement USPHeader1;
	
	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/ul/li[2]/article/h2")
	public WebElement USPHeader2;
	
	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/ul/li[3]/article/h2")
	public WebElement USPHeader3;
	
	@FindBy(xpath = "//*[@class= \"umb-block__root margin-bottom \"]/ul/li[4]/article/h2")
	public WebElement USPHeader4;
	
	@FindBy(xpath = "//*[@id=\"Our products\"]/article/div[1]/h2")
	public WebElement ImageHeader1;
	
	@FindBy(xpath = "//*[@id=\"Who we fund\"]/article/div[1]/h2")
	public WebElement ImageHeader2;
	
	@FindBy(xpath = "//*[@id=\"What we fund\"]/article/div[1]/h2")
	public WebElement ImageHeader3;
	
	@FindBy(xpath = "//*[@class =\"umb-block__root margin-bottom \"]/a")
	public WebElement CTABanner;
}
