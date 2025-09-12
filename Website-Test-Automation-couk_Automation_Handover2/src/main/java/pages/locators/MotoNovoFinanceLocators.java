package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotoNovoFinanceLocators {

	/* @FindBy(xpath="//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Motor finance']")
	public WebElement MotorfinanceLink; */
	
	@FindBy(xpath="//span[normalize-space()='Motor finance']")
	public WebElement MotorfinanceLink;
		
	@FindBy(xpath="//a[@aria-label='Motonovo Finance']")
	public WebElement MotoNovoFinanceLink;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	@FindBy(xpath="//h1[normalize-space()='MotoNovo Finance']")
	public WebElement MotoNovoFinancePageHeader;
	
}
