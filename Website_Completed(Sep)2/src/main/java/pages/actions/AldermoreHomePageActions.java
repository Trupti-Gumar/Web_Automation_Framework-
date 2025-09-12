/*package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;
import pages.locators.AldermoreHomePageLocators;

import java.util.List;

public class AldermoreHomePageActions {

    WebDriver driver;
    AldermoreHomePageLocators homePageLocators;

    public AldermoreHomePageActions() {
        this.driver = SeleniumDriver.getDriver();
        this.homePageLocators = new AldermoreHomePageLocators();
        PageFactory.initElements(driver, homePageLocators);
    }

    // Expand tab by name
    public void expandTab(String tabName) {
        WebElement tab;

        switch (tabName.toLowerCase()) {
            case "savings":
                tab = homePageLocators.savingsTab;
                break;
            case "mortgages":
                tab = homePageLocators.mortgagesTab;
                break;
            //case "motor finance":
               // tab = homePageLocators.motorFinanceTab;
                //break;
            case "motor finance":
                tab = homePageLocators.motorFinanceTab;
                SeleniumDriver.moveToElement(tab);   // hover if dropdown
                SeleniumDriver.clickOnElement(tab);  // then click
                break;

            case "business finance":
                tab = homePageLocators.businessFinanceTab;
                break;
            default:
                throw new IllegalArgumentException("❌ Unknown tab: " + tabName);
        }

        SeleniumDriver.clickElementWithJavaScript(tab);
    }

    // Map link text from feature file -> locator, disambiguated by tab
    public WebElement getLinkByName(String linkText, String tabName) {
        String link = linkText.toLowerCase();
        String tab = tabName.toLowerCase();

        switch (tab) {

            // ====== SAVINGS ======
            case "savings":
                switch (link) {
                    case "personal savings accounts": return homePageLocators.personalSavingsAccountsLink;
                    case "fixed rate savings": return homePageLocators.fixedRateSavingsLink;
                    case "cash isas": return homePageLocators.cashIsasLink;
                    case "reward cash isas": return homePageLocators.rewardCashIsasLink;
                    case "easy access savings": return homePageLocators.easyAccessSavingsLink;
                    case "double access savings": return homePageLocators.doubleAccessSavingsLink;
                    case "regular savings": return homePageLocators.regularSavingsLink;
                    case "notice savings": return homePageLocators.noticeSavingsLink;
                    case "business savings accounts": return homePageLocators.businessSavingsAccountsLink;
                    case "corporate deposit accounts": return homePageLocators.corporateDepositAccountsLink;
                    case "Corporate deposits":
                        return homePageLocators.savingsCorporateDepositsLink;

                    case "help and support": return homePageLocators.savingsHelpAndSupportLink;
                    case "bereavement guide": return homePageLocators.savingsBereavementGuideLink;
                    case "insights for savers": return homePageLocators.insightsForSaversLink;
                }
                break;

            // ====== MORTGAGES ======
            case "mortgages":
                switch (link) {
                    case "residential mortgages": return homePageLocators.residentialMortgagesLink;
                    case "first time buyer mortgages": return homePageLocators.firstTimeBuyerMortgagesLink;
                    case "self-employed mortgages": return homePageLocators.selfEmployedMortgagesLink;
                    case "customers with credit problems": return homePageLocators.customersWithCreditProblemsLink;

                    // Flexible mapping: matches both "Switching your mortgage" and "Switch your mortgage"
                    case "switching your mortgage":
                    case "switch your mortgage":
                        return homePageLocators.switchYourMortgageLink;
                        

                    case "buy to let mortgages": return homePageLocators.buyToLetMortgagesLink;
                    case "buy to let limited company mortgages": return homePageLocators.buyToLetLimitedCompanyMortgagesLink;
                    case "help and support": return homePageLocators.mortgagesHelpAndSupportLink;
                    //case "help and support":
                      //  return homePageLocators.mortgagesHelpAndSupportLink;

                    
                    case "money worries": return homePageLocators.mortgagesMoneyWorriesLink;
                    case "mortgage charter": return homePageLocators.mortgageCharterLink;
                    case "borrowing more": return homePageLocators.borrowingMoreLink;
                    case "bereavement guide": return homePageLocators.mortgagesBereavementGuideLink;
                    case "insights for homebuyers and landlords": return homePageLocators.insightsForHomebuyersLandlordsLink;
                }
                break;

            // ====== MOTOR FINANCE ======
            case "motor finance":
                switch (link) {
                    // Allow case-insensitive mapping
                    //case "motonovo finance":
                    //case "motonovo":
                      //  return homePageLocators.motoNovoFinanceLink;
                        
                    case "motonovo finance":
                    case "motonovo":
                        return homePageLocators.motoNovoFinanceLink;


                    //case "motor finance": return homePageLocators.motorFinanceOverviewLink;
                   // case "motor finance":
                      //  return homePageLocators.motorFinanceOverviewLink;

                    case "motor finance":
                        return homePageLocators.motorFinanceOverviewLink;

                    //case "aldermore bank motor finance commission complaints":
                    	
                    //case "motor finance complaints":
                    //case "commission complaints":
                       // return homePageLocators.motorFinanceComplaintsLink;
                    //case "commission complaints":
                   // case "motor finance commission complaints":
                   // case "aldermore bank motor finance commission complaints":
                      //  return homePageLocators.motorFinanceComplaintsLink;
                        
                    case "commission complaints":
                    case "motor finance commission complaints":
                    case "aldermore bank motor finance commission complaints":
                        return homePageLocators.motorFinanceComplaintsLink;


                        
                }
                break;

            // ====== BUSINESS FINANCE ======
            case "business finance":
                switch (link) {
                    case "business finance": return homePageLocators.businessFinanceOverviewLink;
                    case "invoice finance": return homePageLocators.invoiceFinanceLink;
                    case "asset finance": return homePageLocators.assetFinanceLink;
                    case "commercial real estate": return homePageLocators.commercialRealEstateLink;
                    case "help and support": return homePageLocators.businessFinanceHelpAndSupportLink;
                    case "invoice finance faqs": return homePageLocators.invoiceFinanceFaqsLink;
                    case "asset finance faqs": return homePageLocators.assetFinanceFaqsLink;
                    case "property development finance faqs": return homePageLocators.propertyDevelopmentFinanceFaqsLink;
                    case "money worries": return homePageLocators.businessFinanceMoneyWorriesLink;
                    case "bereavement guide": return homePageLocators.businessFinanceBereavementGuideLink;
                    //case "insights": return homePageLocators.businessFinanceInsightsLink;
                    case "customer stories": return homePageLocators.customerStoriesLink;
                    case "insights for businesses": return homePageLocators.insightsForBusinessesLink;
                    
                    case "insights":
                        return homePageLocators.businessFinanceInsightsLink;

                }
                break;
        }

        throw new IllegalArgumentException("❌ Unknown link: " + linkText + " under tab: " + tabName);
    }

    public int getAllLinksCount() {
        List<WebElement> links = homePageLocators.allLinks;
        return links.size();
    }
}*/
package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;
import pages.locators.AldermoreHomePageLocators;

import java.util.Arrays;
import java.util.List;

public class AldermoreHomePageActions {

    AldermoreHomePageLocators homePageLocators = null;

    public AldermoreHomePageActions() {
        this.homePageLocators = new AldermoreHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
    }

    // ================== TAB EXPANDER ==================
    public void expandTab(String tabName) {
        tabName = tabName.toLowerCase().trim();

        switch (tabName) {
            case "savings":
                SeleniumDriver.clickOnElement(homePageLocators.savingsTab);
                break;
            case "mortgages":
                SeleniumDriver.clickOnElement(homePageLocators.mortgagesTab);
                break;
            case "motor finance":
                SeleniumDriver.clickOnElement(homePageLocators.motorFinanceTab);
                break;
            case "business finance":
                SeleniumDriver.clickOnElement(homePageLocators.businessFinanceTab);
                break;
            default:
                throw new IllegalArgumentException("Unknown tab: " + tabName);
        }
    }

    // ================== GET ALL LINKS UNDER A TAB ==================
    public List<WebElement> getAllLinks(String tabName) {
        tabName = tabName.toLowerCase().trim();

        switch (tabName) {
            case "savings":
                return Arrays.asList(
                    homePageLocators.personalSavingsAccountsLink,
                    homePageLocators.fixedRateSavingsLink,
                    homePageLocators.cashIsasLink,
                    homePageLocators.rewardCashIsasLink,
                    homePageLocators.easyAccessSavingsLink,
                    homePageLocators.doubleAccessSavingsLink,
                    homePageLocators.regularSavingsLink,
                    homePageLocators.noticeSavingsLink,
                    homePageLocators.businessSavingsAccountsLink,
                    homePageLocators.corporateDepositAccountsLink,
                    homePageLocators.savingsCorporateDepositsLink,
                    homePageLocators.savingsHelpAndSupportLink,
                    homePageLocators.savingsBereavementGuideLink,
                    homePageLocators.insightsForSaversLink
                );

            case "mortgages":
                return Arrays.asList(
                    homePageLocators.residentialMortgagesLink,
                    homePageLocators.firstTimeBuyerMortgagesLink,
                    homePageLocators.selfEmployedMortgagesLink,
                    homePageLocators.customersWithCreditProblemsLink,
                    homePageLocators.switchYourMortgageLink,
                    homePageLocators.buyToLetMortgagesLink,
                    homePageLocators.buyToLetLimitedCompanyMortgagesLink,
                    homePageLocators.mortgagesHelpAndSupportLink,
                    homePageLocators.mortgagesMoneyWorriesLink,
                    homePageLocators.mortgageCharterLink,
                    homePageLocators.borrowingMoreLink,
                    homePageLocators.mortgagesBereavementGuideLink,
                    homePageLocators.insightsForHomebuyersLandlordsLink
                );

            case "motor finance":
                return Arrays.asList(
                    homePageLocators.motoNovoFinanceLink,
                    homePageLocators.motorFinanceOverviewLink,
                    homePageLocators.motorFinanceComplaintsLink
                );

            case "business finance":
                return Arrays.asList(
                    homePageLocators.businessFinanceOverviewLink,
                    homePageLocators.invoiceFinanceLink,
                    homePageLocators.assetFinanceLink,
                    homePageLocators.commercialRealEstateLink,
                    homePageLocators.businessFinanceHelpAndSupportLink,
                    homePageLocators.invoiceFinanceFaqsLink,
                    homePageLocators.assetFinanceFaqsLink,
                    homePageLocators.propertyDevelopmentFinanceFaqsLink,
                    homePageLocators.businessFinanceMoneyWorriesLink,
                    homePageLocators.businessFinanceBereavementGuideLink,
                    homePageLocators.businessFinanceInsightsLink,
                    homePageLocators.customerStoriesLink,
                    homePageLocators.insightsForBusinessesLink
                );

            default:
                throw new IllegalArgumentException("Unknown tab: " + tabName);
        }
    }

    // ================== RESOLVE SINGLE LINK ==================
    public WebElement getLinkByName(String tabName, String linkName) {
        tabName = tabName.toLowerCase().trim();
        linkName = linkName.toLowerCase().trim();

        switch (tabName) {

            // ===== SAVINGS =====
            case "savings":
                switch (linkName) {
                    case "personal savings accounts":
                        return homePageLocators.personalSavingsAccountsLink;
                    case "fixed rate savings":
                        return homePageLocators.fixedRateSavingsLink;
                    case "cash isas":
                        return homePageLocators.cashIsasLink;
                    case "reward cash isas":
                        return homePageLocators.rewardCashIsasLink;
                    case "easy access savings":
                        return homePageLocators.easyAccessSavingsLink;
                    case "double access savings":
                        return homePageLocators.doubleAccessSavingsLink;
                    case "regular savings":
                        return homePageLocators.regularSavingsLink;
                    case "notice savings":
                        return homePageLocators.noticeSavingsLink;
                    case "business savings accounts":
                        return homePageLocators.businessSavingsAccountsLink;
                    case "corporate deposit accounts":
                        return homePageLocators.corporateDepositAccountsLink;
                    case "corporate deposits":
                        return homePageLocators.savingsCorporateDepositsLink;
                    case "help and support":
                        return homePageLocators.savingsHelpAndSupportLink;
                    case "bereavement guide":
                        return homePageLocators.savingsBereavementGuideLink;
                    case "insights for savers":
                        return homePageLocators.insightsForSaversLink;
                }
                break;

            // ===== MORTGAGES =====
            case "mortgages":
                switch (linkName) {
                    case "residential mortgages":
                        return homePageLocators.residentialMortgagesLink;
                    case "first time buyer mortgages":
                        return homePageLocators.firstTimeBuyerMortgagesLink;
                    case "self-employed mortgages":
                        return homePageLocators.selfEmployedMortgagesLink;
                    case "customers with credit problems":
                        return homePageLocators.customersWithCreditProblemsLink;
                    case "switch your mortgage":
                        return homePageLocators.switchYourMortgageLink;
                    case "buy to let mortgages":
                        return homePageLocators.buyToLetMortgagesLink;
                    case "buy to let limited company mortgages":
                        return homePageLocators.buyToLetLimitedCompanyMortgagesLink;
                    case "help and support":
                        return homePageLocators.mortgagesHelpAndSupportLink;
                    case "money worries":
                        return homePageLocators.mortgagesMoneyWorriesLink;
                    case "mortgage charter":
                        return homePageLocators.mortgageCharterLink;
                    case "borrowing more":
                        return homePageLocators.borrowingMoreLink;
                    case "bereavement guide":
                        return homePageLocators.mortgagesBereavementGuideLink;
                    case "insights for homebuyers and landlords":
                        return homePageLocators.insightsForHomebuyersLandlordsLink;
                }
                break;

            // ===== MOTOR FINANCE =====
            case "motor finance":
                switch (linkName) {
                    case "motonovo":
                    case "motonovo finance":
                        return homePageLocators.motoNovoFinanceLink;
                    case "motor finance":
                        return homePageLocators.motorFinanceOverviewLink;
                    case "commission complaints":
                    case "motor finance commission complaints":
                    case "aldermore bank motor finance commission complaints":
                        return homePageLocators.motorFinanceComplaintsLink;
                }
                break;

            // ===== BUSINESS FINANCE =====
            case "business finance":
                switch (linkName) {
                    case "business finance":
                        return homePageLocators.businessFinanceOverviewLink;
                    case "invoice finance":
                        return homePageLocators.invoiceFinanceLink;
                    case "asset finance":
                        return homePageLocators.assetFinanceLink;
                    case "commercial real estate":
                        return homePageLocators.commercialRealEstateLink;
                    case "help and support":
                        return homePageLocators.businessFinanceHelpAndSupportLink;
                    case "invoice finance faqs":
                        return homePageLocators.invoiceFinanceFaqsLink;
                    case "asset finance faqs":
                        return homePageLocators.assetFinanceFaqsLink;
                    case "property development finance faqs":
                        return homePageLocators.propertyDevelopmentFinanceFaqsLink;
                    case "money worries":
                        return homePageLocators.businessFinanceMoneyWorriesLink;
                    case "bereavement guide":
                        return homePageLocators.businessFinanceBereavementGuideLink;
                    case "insights":
                        return homePageLocators.businessFinanceInsightsLink;
                    case "customer stories":
                        return homePageLocators.customerStoriesLink;
                    case "insights for businesses":
                        return homePageLocators.insightsForBusinessesLink;
                }
                break;
        }

        throw new IllegalArgumentException(
            "Unknown link: " + linkName + " under tab: " + tabName
        );
    }
}

