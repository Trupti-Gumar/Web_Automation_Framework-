/*package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AldermoreHomePageLocators {

    // ===================== TABS =====================
    @FindBy(xpath = "//*[self::a or self::button or self::div][contains(normalize-space(.), 'Savings')]")
    public WebElement savingsTab;

    @FindBy(xpath = "//*[self::a or self::button or self::div][contains(normalize-space(.), 'Mortgages')]")
    public WebElement mortgagesTab;

   // @FindBy(xpath = "//*[self::a or self::button or self::div][contains(normalize-space(.), 'Motor Finance')]")
    //public WebElement motorFinanceTab;

    @FindBy(xpath = "//*[self::a or self::button or self::div or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'business finance')]")
    public WebElement businessFinanceTab;

   // @FindBy(xpath = "//nav//a[contains(., 'Business Finance')] | //nav//span[contains(., 'Business Finance')]")
    //public WebElement businessFinanceTab;


    //@FindBy(xpath = "//*[self::a or self::button or self::div][contains(normalize-space(.), 'Business Finance')]")
   // public WebElement businessFinanceTab;
 // Motor Finance Tab (case-insensitive, supports <a>, <button>, <div>, <span>)
    @FindBy(xpath = "//nav//*[self::a or self::button or self::div or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motor finance')]")
    public WebElement motorFinanceTab;


    // ===================== SAVINGS LINKS =====================
    @FindBy(xpath = "//a[contains(normalize-space(.), 'Personal savings accounts')]")
    public WebElement personalSavingsAccountsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Fixed rate savings')]")
    public WebElement fixedRateSavingsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Cash ISAs')]")
    public WebElement cashIsasLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Reward cash ISAs')]")
    public WebElement rewardCashIsasLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Easy access savings')]")
    public WebElement easyAccessSavingsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Double access savings')]")
    public WebElement doubleAccessSavingsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Regular savings')]")
    public WebElement regularSavingsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Notice savings')]")
    public WebElement noticeSavingsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Business savings accounts')]")
    public WebElement businessSavingsAccountsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Corporate Deposit Accounts')]")
    public WebElement corporateDepositAccountsLink;
    
 // ✅ Savings → Corporate deposits
    @FindBy(xpath = "//a[contains(normalize-space(.), 'Corporate deposits')]")
    public WebElement savingsCorporateDepositsLink;


    @FindBy(xpath = "//a[contains(normalize-space(.), 'Help and support')]")
    public WebElement savingsHelpAndSupportLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Bereavement guide')]")
    public WebElement savingsBereavementGuideLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Insights for Savers')]")
    public WebElement insightsForSaversLink;

    // ===================== MORTGAGES LINKS =====================
    @FindBy(xpath = "//a[contains(normalize-space(.), 'Residential mortgages')]")
    public WebElement residentialMortgagesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'First time buyer mortgages')]")
    public WebElement firstTimeBuyerMortgagesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Self-employed mortgages')]")
    public WebElement selfEmployedMortgagesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Customers with credit problems')]")
    public WebElement customersWithCreditProblemsLink;

   // @FindBy(xpath = "//a[contains(normalize-space(.), 'Switching your mortgage')]")
   // public WebElement switchYourMortgageLink;
 // in AldermoreHomePageLocators.java
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'switch') and contains(normalize-space(.), 'mortgage')]")
    public WebElement switchYourMortgageLink;


    @FindBy(xpath = "//a[contains(normalize-space(.), 'Buy to let mortgages')]")
    public WebElement buyToLetMortgagesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Buy to let limited company mortgages')]")
    public WebElement buyToLetLimitedCompanyMortgagesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Help and support')]")
    public WebElement mortgagesHelpAndSupportLink;
    

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Money worries')]")
    public WebElement mortgagesMoneyWorriesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Mortgage charter')]")
    public WebElement mortgageCharterLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Borrowing more')]")
    public WebElement borrowingMoreLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Bereavement guide')]")
    public WebElement mortgagesBereavementGuideLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Insights for homebuyers and landlords')]")
    public WebElement insightsForHomebuyersLandlordsLink;

    // ===================== MOTOR FINANCE LINKS =====================
    //@FindBy(xpath = "//a[contains(normalize-space(.), 'MotoNovo Finance')]")
    //public WebElement motoNovoFinanceLink;
 // ✅ MotoNovo Finance link (case-insensitive, works for <a>, <span>, <button>)
   // @FindBy(xpath = "//*[self::a or self::span or self::button][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motonovo')]")
   // public WebElement motoNovoFinanceLink;
 // ✅ Motor Finance → MotoNovo (case-insensitive, matches "MotoNovo", "MotoNovo Finance")
    @FindBy(xpath = "//*[self::a or self::span or self::button][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motonovo')]")
    public WebElement motoNovoFinanceLink;


    

   // @FindBy(xpath = "//a[contains(normalize-space(.), 'Motor Finance')]")
   // public WebElement motorFinanceOverviewLink;

    //@FindBy(xpath = "//a[contains(normalize-space(.), 'Aldermore Bank Motor Finance commission complaints')]")
   // public WebElement motorFinanceComplaintsLink;

 // ✅ Motor finance link (case-insensitive, excludes complaints)
   // @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motor finance') and not(contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'complaint'))]")
   // public WebElement motorFinanceOverviewLink;
    
 // ✅ Motor Finance → Overview (case-insensitive, excludes complaints)
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motor finance') and not(contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'complaint'))]")
    public WebElement motorFinanceOverviewLink;

    
    //@FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'commission') and contains(., 'Motor Finance')]")
    //public WebElement motorFinanceComplaintsLink;
    
    
 // ✅ Motor Finance → Commission complaints (case-insensitive, works for short/long text)
    //@FindBy(xpath = "//*[self::a or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'commission') and contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'complaint')]")
    //public WebElement motorFinanceComplaintsLink;
    
 // ✅ Motor Finance → Commission complaints (case-insensitive)
    @FindBy(xpath = "//*[self::a or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'commission') and contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'complaint')]")
    public WebElement motorFinanceComplaintsLink;




    // ===================== BUSINESS FINANCE LINKS =====================
    
    @FindBy(xpath = "//a[contains(normalize-space(.), 'Business finance')]")
    public WebElement businessFinanceOverviewLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Invoice finance')]")
    public WebElement invoiceFinanceLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Asset finance')]")
    public WebElement assetFinanceLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Commercial Real Estate')]")
    public WebElement commercialRealEstateLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Help and support')]")
    public WebElement businessFinanceHelpAndSupportLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Invoice finance FAQs')]")
    public WebElement invoiceFinanceFaqsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Asset finance FAQs')]")
    public WebElement assetFinanceFaqsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Property development finance FAQs')]")
    public WebElement propertyDevelopmentFinanceFaqsLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Money worries')]")
    public WebElement businessFinanceMoneyWorriesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Bereavement guide')]")
    public WebElement businessFinanceBereavementGuideLink;

    //@FindBy(xpath = "//a[contains(normalize-space(.), 'Insights')]")
    //public WebElement businessFinanceInsightsLink;
 // ✅ Business Finance → Insights
    @FindBy(xpath = "//a[contains(normalize-space(.), 'Insights')]")
    public WebElement businessFinanceInsightsLink;


    @FindBy(xpath = "//a[contains(normalize-space(.), 'Customer stories')]")
    public WebElement customerStoriesLink;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Insights for Businesses')]")
    public WebElement insightsForBusinessesLink;

    // ===================== GENERIC LIST FOR DEBUGGING =====================
    @FindBy(xpath = "//a")
    public List<WebElement> allLinks;

	
}*/
package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AldermoreHomePageLocators {

    // ===================== TABS =====================
    @FindBy(xpath = "//*[self::a or self::button or self::div or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'savings')]")
    public WebElement savingsTab;

    @FindBy(xpath = "//*[self::a or self::button or self::div or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'mortgages')]")
    public WebElement mortgagesTab;

    @FindBy(xpath = "//*[self::a or self::button or self::div or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motor finance')]")
    public WebElement motorFinanceTab;

    @FindBy(xpath = "//*[self::a or self::button or self::div or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'business finance')]")
    public WebElement businessFinanceTab;

    // ===================== SAVINGS LINKS =====================
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'personal savings accounts')]")
    public WebElement personalSavingsAccountsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'fixed rate savings')]")
    public WebElement fixedRateSavingsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'cash isas')]")
    public WebElement cashIsasLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'reward cash isas')]")
    public WebElement rewardCashIsasLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'easy access savings')]")
    public WebElement easyAccessSavingsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'double access savings')]")
    public WebElement doubleAccessSavingsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'regular savings')]")
    public WebElement regularSavingsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'notice savings')]")
    public WebElement noticeSavingsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'business savings accounts')]")
    public WebElement businessSavingsAccountsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'corporate deposit accounts')]")
    public WebElement corporateDepositAccountsLink;

    // ✅ Fix: Corporate deposits
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'corporate deposits')]")
    public WebElement savingsCorporateDepositsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'help and support')]")
    public WebElement savingsHelpAndSupportLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'bereavement guide')]")
    public WebElement savingsBereavementGuideLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'insights for savers')]")
    public WebElement insightsForSaversLink;

    // ===================== MORTGAGES LINKS =====================
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'residential mortgages')]")
    public WebElement residentialMortgagesLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'first time buyer mortgages')]")
    public WebElement firstTimeBuyerMortgagesLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'self-employed mortgages')]")
    public WebElement selfEmployedMortgagesLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'customers with credit problems')]")
    public WebElement customersWithCreditProblemsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'switch') and contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'mortgage')]")
    public WebElement switchYourMortgageLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'buy to let mortgages')]")
    public WebElement buyToLetMortgagesLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'buy to let limited company mortgages')]")
    public WebElement buyToLetLimitedCompanyMortgagesLink;

    // ✅ Fix: Mortgages help and support
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'help and support')]")
    public WebElement mortgagesHelpAndSupportLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'money worries')]")
    public WebElement mortgagesMoneyWorriesLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'mortgage charter')]")
    public WebElement mortgageCharterLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'borrowing more')]")
    public WebElement borrowingMoreLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'bereavement guide')]")
    public WebElement mortgagesBereavementGuideLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'insights for homebuyers and landlords')]")
    public WebElement insightsForHomebuyersLandlordsLink;

    // ===================== MOTOR FINANCE LINKS =====================
    // ✅ Fix: MotoNovo
    @FindBy(xpath = "//*[self::a or self::span or self::button][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motonovo')]")
    public WebElement motoNovoFinanceLink;

    // ✅ Fix: Motor finance overview (exclude complaints)
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'motor finance') and not(contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'complaint'))]")
    public WebElement motorFinanceOverviewLink;

    // ✅ Fix: Commission complaints
    @FindBy(xpath = "//*[self::a or self::span][contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'commission') and contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'complaint')]")
    public WebElement motorFinanceComplaintsLink;

    // ===================== BUSINESS FINANCE LINKS =====================
    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'business finance')]")
    public WebElement businessFinanceOverviewLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'invoice finance')]")
    public WebElement invoiceFinanceLink;
    

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'asset finance')]")
    public WebElement assetFinanceLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'commercial real estate')]")
    public WebElement commercialRealEstateLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'help and support')]")
    public WebElement businessFinanceHelpAndSupportLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'invoice finance faqs')]")
    public WebElement invoiceFinanceFaqsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'asset finance faqs')]")
    public WebElement assetFinanceFaqsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'property development finance faqs')]")
    public WebElement propertyDevelopmentFinanceFaqsLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'money worries')]")
    public WebElement businessFinanceMoneyWorriesLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'bereavement guide')]")
    public WebElement businessFinanceBereavementGuideLink;

    // ✅ Fix: Insights under Business Finance
    //@FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'insights')]")
   // public WebElement businessFinanceInsightsLink;
    
 // Business Finance → Insights (refined)
    @FindBy(xpath = "//ul[contains(@class,'business-finance')]//a[normalize-space()='Insights']")
    public WebElement businessFinanceInsightsLink;

 // --- Business Finance locators ---

   // @FindBy(xpath = "//a[normalize-space(text())='Insights' and ancestor::nav[contains(.,'Business finance')]]")
   // public WebElement businessFinanceInsightsLink;


    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'customer stories')]")
    public WebElement customerStoriesLink;

    @FindBy(xpath = "//a[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'insights for businesses')]")
    public WebElement insightsForBusinessesLink;

    // ===================== GENERIC LIST FOR DEBUGGING =====================
    @FindBy(xpath = "//a")
    public List<WebElement> allLinks;
}

