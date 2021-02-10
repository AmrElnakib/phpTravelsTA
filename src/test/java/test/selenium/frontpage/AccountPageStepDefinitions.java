package test.selenium.frontpage;


import base.LoginTool;
import base.WaitTool;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.browser.Browser;
import selenium.pages.frontpage.AccountPage;
import static org.junit.Assert.assertEquals;

public class AccountPageStepDefinitions{

    private Browser browser;
    private LoginTool loginTool;
    private AccountPage accountPage;
    private WaitTool waitTool;

    public AccountPageStepDefinitions(LoginTool loginTool, AccountPage accountPage, WaitTool waitTool, Browser browser){
        this.loginTool = loginTool;
        this.accountPage = accountPage;
        this.waitTool = waitTool;
        this.browser = browser;
    }

    @Given("I am on the Account Page")
    public void iAmOnTheAccountPage() {

        browser.openBrowser("chrome");
        loginTool.loginToFrontPage();
        waitTool.implicitlyWaitForPage(Browser.driver);
    }

    @When("I click on the My profile")
    public void iClickOnTheMyProfile() {

        accountPage.myProfileSideBarOption();
        waitTool.implicitlyWaitForPage(Browser.driver);
    }

    @Then("I Assert that the First name is correct")
    public void iAssertThatTheFirstNameIsCorrect() {

        assertEquals("Different First Name Value", "Johny", accountPage.firstNameValue());
        System.out.println("First name is correct");
    }

    @And("I assert that the Last name is correct")
    public void iAssertThatTheLastNameIsCorrect() {

        accountPage.lastNameField();
        assertEquals("Different name", "Smith", accountPage.lastNameValue());
        System.out.println("Last name is correct");
    }

    @After
    public void closeBrowser(){
        browser.closeBrowser();
    }
}
