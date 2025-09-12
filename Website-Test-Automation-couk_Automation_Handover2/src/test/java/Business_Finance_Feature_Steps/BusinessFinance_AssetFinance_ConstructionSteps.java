package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_AssetFinance_ConstructionActions;
import utils.SeleniumDriver;

public class BusinessFinance_AssetFinance_ConstructionSteps {
	
	BusinessFinance_AssetFinance_ConstructionActions BSAssetFinance_ConstructionActions = new BusinessFinance_AssetFinance_ConstructionActions();

	@Then("I should see Construction card on the page")
	public void i_should_see_construction_card_on_the_page() {
	   
		
	    SeleniumDriver.moveToElement(BSAssetFinance_ConstructionActions.ConstructionCardLink());
	}

	@When("I click on Construction card CTA button")
	public void i_click_on_construction_card_cta_button() {
	   
		 SeleniumDriver.clickOnElement(BSAssetFinance_ConstructionActions.ConstructionCardLink());
	}

	@Then("I should redirected to Construction page")
	public void i_should_redirected_to_construction_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Asset Finance for the Construction Sector | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Construction page header")
	public void i_should_see_on_construction_page_header(String header) {
	   
		
		String Actual = SeleniumDriver
				.GetElementText(BSAssetFinance_ConstructionActions.MastheadHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(BSAssetFinance_ConstructionActions.MastheadHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as header for the Masthead black box on Construction page")
	public void i_should_see_as_header_for_the_masthead_black_box_on_construction_page(String header) {
	   
		String Actual = SeleniumDriver
				.GetElementText(BSAssetFinance_ConstructionActions.MastheadBlackBoxHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(BSAssetFinance_ConstructionActions.MastheadBlackBoxHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on Get in touch CTA button and redirected to respective page")
	public void i_should_be_able_to_click_on_get_in_touch_cta_button_and_redirected_to_respective_page() {
	   
		String Actual = SeleniumDriver.getPageTitle(BSAssetFinance_ConstructionActions.MastheadBlackBoxCTAButton());
		String Expected = "Contact information for business finance customers";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as USP sub header on Construction page")
	public void i_should_see_the_as_usp_sub_header_on_construction_page(String header) {
	   
		String Actual = BSAssetFinance_ConstructionActions.getUSPSubHeaders(header) ;
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as Video block header on Construction page")
	public void i_should_see_the_as_video_block_header_on_construction_page(String header) {
	   
		String Actual = SeleniumDriver
				.GetElementText(BSAssetFinance_ConstructionActions.VideoBlockHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(BSAssetFinance_ConstructionActions.VideoBlockHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as a header for Image copy Section on Construction page")
	public void i_should_see_the_as_a_header_for_image_copy_section_on_construction_page(String header) {
	   
		
		String Actual = BSAssetFinance_ConstructionActions.getImageCopyHeaders(header) ;
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the BDM Card header on Construction page")
	public void i_should_see_as_the_bdm_card_header_on_construction_page(String header) {
	   
		String Actual = SeleniumDriver
				.GetElementText(BSAssetFinance_ConstructionActions.BDMCardHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(BSAssetFinance_ConstructionActions.BDMCardHeader());
		assertEquals(Actual, Expected);
	}
}
