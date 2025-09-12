package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotorFinanceLocators {

	@FindBy(xpath="//span[contains(@class,'navigation-menu__dropdown-header__span')][normalize-space()='Motor finance']")
	public WebElement MotorfinanceLink;
	
	@FindBy(xpath="//span[contains(@class,'navigation__menu-item__span')][normalize-space()='Motor Finance']")
	public WebElement MotorFinanceLink;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
		
}
