package HomePage_Steps;

import io.cucumber.java.en.And;
import pages.actions.AldermoreHomePageFooterPageActions;
import utils.SeleniumDriver;

public class AldermoreHomePageFooterPageSteps {
	
	AldermoreHomePageFooterPageActions FooterActions = new AldermoreHomePageFooterPageActions();
	
	@And("I see Aldermore page")
	public void i_see_aldermore_homepage() {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());
		try {
		boolean Cookies = SeleniumDriver.isElementPresent(FooterActions.OneTrustCookies());
		if(Cookies = true) {
			
			SeleniumDriver.waitForElementClickable(FooterActions.OneTrustCookies());
			SeleniumDriver.clickElement(FooterActions.OneTrustCookies(), "Accept All Cookies");

		}
		}
		catch(Exception e)
		{
			
		}
	}
	
	@And("I will click to the {string} and verify the pagetile")
	public void i_navigate_to_the_footer_Accounts_and_products_Options(String FooterMenuOptions) {
		FooterActions.clickontheMenuOptions(FooterMenuOptions);
		
	}
	
	@And("I will click to the {string} on Help and support page and verify the pagetile")
	public void i_navigate_to_the_footer_Help_and_support_Options(String FooterMenuOptions) {
		FooterActions.clickontheMenuOptions1(FooterMenuOptions);
		
	}
	
    @And("I will click to the {string} on About us page and verify the pagetile")
	public void i_navigate_to_the_footer_Contact_us_Options(String FooterMenuOptions) {
		FooterActions.clickontheMenuOptions2(FooterMenuOptions);
	}
    
    @And("I can see the {string} card header on the footer page")
    public void i_can_see_Help_Support_header_on_the_Footer_page(String header){
    	FooterActions.clickOnHelpSupportHeader(header);
    }
    
    @And("I can see the {string} for Connect with us options on the footer page")
    public void i_can_see_the_Connect_us_option_on_the_page(String header) {
    	FooterActions.clickonConnectUsOptions(header);
    	
    }
    
    @And("I see the aldermore {string} on the page")
    public void i_see_the_aldermore_logo_on_the_Footer(String logo) {
    	FooterActions.clickonFooterLogo(logo);
    }
    
    @And("I can see the FSCS Option on the page")
    public void i_can_see_the_FSCS_on_the_page() {
    	FooterActions.verifytheFSCSoptionpresent();
    }  
    
    
    
}
