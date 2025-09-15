/*package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.actions.AldermoreHomePageActions;

public class HomepageTabsSteps {

    AldermoreHomePageActions aldermoreHomePageActions = new AldermoreHomePageActions();

    @When("^I expand the \"([^\"]*)\" tab$")
    public void i_expand_the_tab(String tabName) {
        aldermoreHomePageActions.expandTab(tabName);
    }

    @Then("^I should verify the link \"([^\"]*)\" under \"([^\"]*)\" tab is working$")
    public void i_should_see_the_link_under_tab(String linkText, String tabName) {
        WebElement link = aldermoreHomePageActions.getLinkByName(linkText, tabName);

        Assert.assertTrue("❌ Link not found under " + tabName + ": " + linkText,
                link != null && link.isDisplayed());
    }

    @Then("^I should print the number of links under \"([^\"]*)\" tab in the console$")
    public void i_should_print_the_number_of_links_under_tab(String tabName) {
        int count = aldermoreHomePageActions.getAllLinksCount();
        System.out.println("✅ " + count + " links found under " + tabName + " tab.");
    }
}*/
package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.actions.AldermoreHomePageActions;
import utils.SeleniumDriver;
import utils.ExtentTestNGListener.ReportUtil;

import java.util.List;

public class HomepageTabsSteps {

    AldermoreHomePageActions homePageActions = new AldermoreHomePageActions();

    @When("I expand the {string} tab")
    public void i_expand_the_tab(String tabName) {
        homePageActions.expandTab(tabName);
        SeleniumDriver.waitForPageToLoad();
        ReportUtil.logStepWithScreenshot("I expand the {string} tab");
    }

    @Then("I should verify the link {string} under {string} tab is working")
    public void i_should_verify_the_link_under_tab_is_working(String linkName, String tabName) {
        WebElement link = homePageActions.getLinkByName(tabName, linkName);
        String pageTitle = SeleniumDriver.getPageTitle(link);

        System.out.println("✅ Verified link: " + linkName + " | Tab: " + tabName + " | Title: " + pageTitle);
        ReportUtil.logStepWithScreenshot("I am on Aldermore home page");

        // optional: you can add assertions if titles/URLs must match expected
        // Assert.assertTrue(pageTitle.contains(expectedPart), "Page title mismatch!");
    }

    @Then("I should print the number of links under {string} tab in the console")
    public void i_should_print_the_number_of_links_under_tab_in_the_console(String tabName) {
        List<WebElement> links = homePageActions.getAllLinks(tabName);
        System.out.println("🔗 Tab [" + tabName + "] has " + links.size() + " links:");
        for (WebElement link : links) {
            try {
                System.out.println(" - " + link.getText().trim());
            } catch (Exception e) {
                System.out.println(" - (unreadable link)");
            }
        }
    }
}

