package test.selenium.e2e;


import base.WaitTool;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import selenium.browser.Browser;
import selenium.data.Data;
import selenium.pages.admin.AdminDashboardPage;
import selenium.pages.admin.AdminLoginPage;
import selenium.pages.frontpage.FrontPage;


import static org.junit.Assert.assertEquals;

public class SuccessfulEditionOfAPriceStepDefinitions {

    private AdminLoginPage adminLoginPage;
    private AdminDashboardPage adminDashboardPage;
    private FrontPage frontPage;
    private WaitTool waitTool;
    private Browser browser;
    private Data data;

    public SuccessfulEditionOfAPriceStepDefinitions(AdminLoginPage adminLoginPage,
                                                    AdminDashboardPage adminDashboardPage,
                                                    FrontPage frontPage,
                                                    WaitTool waitTool,
                                                    Browser browser,
                                                    Data data){

        this.adminLoginPage = adminLoginPage;
        this.adminDashboardPage = adminDashboardPage;
        this.frontPage = frontPage;
        this.waitTool = waitTool;
        this.browser = browser;
        this.data = data;
    }

    @Given("I load the Admin page")
    public void iLoadTheAdminPage() {

        browser.openBrowser("chrome");
        browser.goToUrl(data.adminUrl);
        waitTool.implicitlyWaitForPage(Browser.driver);
    }

    @Then("I type correct Admin email")
    public void iTypeCorrectAdminEmail() {

        adminLoginPage.enterEmail(data.correctAdminEmail);
    }

    @And("I type correct Admin password and click on Login button")
    public void iTypeCorrectAdminPasswordAndClickOnLoginButton() {

        adminLoginPage.enterPassword(data.correctAdminPassword);
        adminLoginPage.clickLoginButton();
    }

    @Then("I click on sidebar menu Hotels option")
    public void iClickOnSidebarMenuHotelsOption() {

        adminDashboardPage.clickOnSidebarMenuHotelsOption();
        waitTool.implicitlyWaitForPage(Browser.driver);
    }

    @Then("I click on Rooms from the Hotels option in the side bar menu")
    public void iClickOnRoomsFromTheHotelsOptionInTheSideBarMenu() {

        adminDashboardPage.clickOnHotelsMenuRoomsOption();
    }

    @Then("I click on Triple Rooms type in Rendezvous Hotels hotel")
    public void iClickOnTripleRoomsTypeInRendezvousHotelsHotel() {

        adminDashboardPage.clickOnTripleRoomsTypeInRendezvousHotelsHotel();
    }

    @Then("I edit the price and click on Submit button")
    public void iEditThePriceAndClickOnSubmitButton() {

        adminDashboardPage.editValueOfUpdatePagePriceField();
        adminDashboardPage.clickOnUpdatePageSubmitButton();
        waitTool.implicitlyWaitForPage(Browser.driver);
    }

    @Then("I navigate to the Front page")
    public void iNavigateToTheFrontPage() {

        browser.goToAnotherUrl(data.frontLoginPageUrl);
        waitTool.implicitlyWaitForPage(Browser.driver);
    }


    @Then("I type correct Front Page email")
    public void iTypeCorrectFrontPageEmail() {

        frontPage.enterEmail(data.correctFrontPageEmail);
    }

    @And("I type correct Front Page password and click on Login button")
    public void iTypeCorrectFrontPagePasswordAndClickOnLoginButton() {

        frontPage.enterPassword(data.correctFrontPagePassword);
        frontPage.LoginButton();
        waitTool.implicitlyWaitForPage(Browser.driver);

    }

    @Then("I click on Home link")
    public void iClickOnHomeLink() {

        frontPage.clickOnHomeLink();
    }

    @Then("I click on a Rendezvous Hotels from the Feature Hotels section")
    public void iClickOnARendezvousHotelsFromTheFeatureHotelsSection() {

        frontPage.clickingOnFeaturedHotelsRendezvousOption();
    }

    @Then("I assert the price for triple rooms")
    public void iAssertThePriceForTripleRooms() {

        System.out.println("Asserting on progress");
        String expected = frontPage.hotelsRendezvousHotelsTripleRoomsPrice();
        assertEquals("Price is different!", expected, frontPage.hotelsRendezvousHotelsTripleRoomsPrice());
        System.out.println("Price is correct");
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {

        browser.closeBrowser();
    }
}