package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.AldermoreHomePageFooterPageLocators;
import utils.SeleniumDriver;

public class AldermoreHomePageFooterPageActions {
	
	AldermoreHomePageFooterPageLocators FooterLocators = new AldermoreHomePageFooterPageLocators();

	public AldermoreHomePageFooterPageActions() {
		this.FooterLocators = new AldermoreHomePageFooterPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), FooterLocators);
	}
	
	public WebElement OneTrustCookies() {
		return FooterLocators.OneTrustCookies;
	}
	
	public void clickontheMenuOptions(String options) {
		switch(options) {
		case"Personal savings":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option1);
		String Expected1 = "Personal Savings Accounts | Aldermore Bank";
		String Actual1 = SeleniumDriver.getPageTitle(FooterLocators.option1);
		assertEquals(Expected1, Actual1);
		break;
		
		case"Business savings":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option2);
		//String Expected2 = "Business Savings Accounts | Aldermore Bank";
			String Expected2 = "Compare our Business Savings Accounts | Aldermore Bank";
String Actual2 = SeleniumDriver.getPageTitle(FooterLocators.option2);
		assertEquals(Expected2, Actual2);
		break;
		
		case"Mortgages":
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.option3);
		String Expected3 = "Specialist Mortgage Lender | Aldermore Bank";
		String Actual3 = SeleniumDriver.getPageTitle(FooterLocators.option3);
		assertEquals(Expected3, Actual3);
		break;
		
		case"Business finance":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option4);
			//String Expected4 = "Business Finance Solutions | Aldermore Bank";
			String Expected4 = "Business Finance | Aldermore Bank";

			String Actual4 = SeleniumDriver.getPageTitle(FooterLocators.option4);
			assertEquals(Expected4, Actual4);
			break;
			
		case"Intermediaries":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option5);
			String Expected5 = "Intermediaries | Aldermore Bank";
			String Actual5 = SeleniumDriver.getPageTitle(FooterLocators.option5);
			assertEquals(Expected5, Actual5);
			break;
		}
	}
	
	
	public void clickontheMenuOptions1(String options) {
		switch(options) {
		case"Complaints":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option6);
		String Expected1 = "Our Complaint Process | Aldermore Bank";
		String Actual1 = SeleniumDriver.getPageTitle(FooterLocators.option6);
		assertEquals(Expected1, Actual1);
		break;
		
		case"Contact us":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option7);
		String Expected2 = "Contact Information - How to Contact Us | Aldermore Bank";
		String Actual2 = SeleniumDriver.getPageTitle(FooterLocators.option7);
		assertEquals(Expected2, Actual2);
		break;
		
		case"Supporting during challenging times":
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.option8);
		String Expected3 = "Tailored Support - How We Can Help You | Aldermore Bank";
		String Actual3 = SeleniumDriver.getPageTitle(FooterLocators.option8);
		assertEquals(Expected3, Actual3);
		break;
		
		case"Online security and fraud":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option9);
			String Expected4 = "Online Security and Fraud Protection | Aldermore Bank";
			String Actual4 = SeleniumDriver.getPageTitle(FooterLocators.option9);
			assertEquals(Expected4, Actual4);
			break;
			
		case"Test Investor Link":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option10);
			String Expected5 = "Aldermore Group Investor Information | Aldermore Bank";
			String Actual5 = SeleniumDriver.getPageTitle(FooterLocators.option10);
			assertEquals(Expected5, Actual5);
			break;
		}
	}
	
	
	public void clickontheMenuOptions2(String options) {
		switch(options) {
		case"About us":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option11);
		String Expected1 = "About us | Aldermore Bank";
		String Actual1 = SeleniumDriver.getPageTitle(FooterLocators.option11);
		assertEquals(Expected1, Actual1);
		break;
		
		case"Careers":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option12);
		String Expected2 = "Careers with Aldermore Group | Aldermore Bank";
		String Actual2 = SeleniumDriver.getPageTitle(FooterLocators.option12);
		assertEquals(Expected2, Actual2);
		break;
		
		case"Modern slavery statement":
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.option13);
		String Expected3 = "Modern Slavery Statement | Aldermore Bank";
		String Actual3 = SeleniumDriver.getPageTitle(FooterLocators.option13);
		assertEquals(Expected3, Actual3);
		break;
		
		case"Terms and conditions":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option14);
			String Expected4 = "Terms and Conditions | Aldermore Bank";
			String Actual4 = SeleniumDriver.getPageTitle(FooterLocators.option14);
			assertEquals(Expected4, Actual4);
			break;
			
		case"Privacy policy":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option15);
			String Expected5 = "Privacy Policy | Aldermore Bank";
			String Actual5 = SeleniumDriver.getPageTitle(FooterLocators.option15);
			assertEquals(Expected5, Actual5);
			break;
			
		case"Cookie policy":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option16);
			String Expected6 = "Cookie Policy | Aldermore Bank";
			String Actual6 = SeleniumDriver.getPageTitle(FooterLocators.option16);
			assertEquals(Expected6, Actual6);
			break;
			
		case"Newsroom":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option17);
			String Expected7 = "Newsroom - Aldermore Press Releases | Aldermore Bank";
			String Actual7 = SeleniumDriver.getPageTitle(FooterLocators.option17);
			assertEquals(Expected7, Actual7);
			break;
			
		case"Insights - our blog":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.option18);
			String Expected8 = "Insights for Personal & Business Customers | Aldermore Bank";
			String Actual8 = SeleniumDriver.getPageTitle(FooterLocators.option18);
			assertEquals(Expected8, Actual8);
			break;
		}
	}
	
	public void clickOnHelpSupportHeader(String header)
	{
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.Help_Support_Card_Header);
		String Expected = "Help and Support | Aldermore Bank";
		String Actual = SeleniumDriver.getPageTitle(FooterLocators.Help_Support_Card_Header);
		assertEquals(Expected, Actual);
	}
	
	
	public void clickonConnectUsOptions(String options) {
		switch(options) {
		case"Linkedin":
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.ConnectUsOption1);
		String Expected1 = "https://www.linkedin.com/company/aldermorebank";
		String Actual1 = SeleniumDriver.getPageURL(FooterLocators.ConnectUsOption1);
		assertEquals(Expected1, Actual1);
		break;
		
		case"Instagram":
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.ConnectUsOption2);
		String Expected2 = "https://www.instagram.com/aldermore.bank/";
		String Actual2 = SeleniumDriver.getPageURL(FooterLocators.ConnectUsOption2);
		assertEquals(Expected2, Actual2);
		break;
		
		case"YouTube":
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.ConnectUsOption3);
		String Expected3 = "https://consent.youtube.com/m?continue=https%3A%2F%2Fwww.youtube.com%2Fuser%2Faldermorebank%3Fcbrd%3D1&gl=GB&m=0&pc=yt&cm=2&hl=en&src=1";
		String Actual3 = SeleniumDriver.getPageURL(FooterLocators.ConnectUsOption3);
		assertEquals(Expected3, Actual3);
		break;
		
		case"Twitter":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.ConnectUsOption4);
			//String Expected4 = "https://twitter.com/AldermoreBank";
			String Expected4 = "https://x.com/AldermoreBank";
			String Actual4 = SeleniumDriver.getPageURL(FooterLocators.ConnectUsOption4);
			assertEquals(Expected4, Actual4);
			

			break;
			
		case"Facebook":
			SeleniumDriver.clickElementWithJavaScript(FooterLocators.ConnectUsOption5);
			String Expected5 = "https://www.facebook.com/AldermoreBank";
			String Actual5 = SeleniumDriver.getPageURL(FooterLocators.ConnectUsOption5);
			assertEquals(Expected5, Actual5);
			break;
		}
	}
	
	public void clickonFooterLogo(String header) {
		SeleniumDriver.clickElementWithJavaScript(FooterLocators.AldermoreLogo);
		String Expected = "Aldermore bank";
		String Actual = SeleniumDriver.getPageTitle(FooterLocators.AldermoreLogo);	
		assertEquals(Expected, Actual);
	}
	
	public void verifytheFSCSoptionpresent() {
		SeleniumDriver.verifytheLink(FooterLocators.FSCSOption);
		
	}
}




