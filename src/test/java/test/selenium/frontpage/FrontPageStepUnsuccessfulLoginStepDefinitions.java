package test.selenium.frontpage;


import base.WaitTool;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.browser.Browser;
import selenium.data.Data;
import selenium.pages.frontpage.FrontPage;
import selenium.selectors.frontpage.FrontPageSelectors;


public class FrontPageStepUnsuccessfulLoginStepDefinitions {

    private FrontPage frontPage;
    private Data data;
    private Browser browser;
    private WaitTool waitTool;
    private FrontPageSelectors frontPageSelectors;


    public FrontPageStepUnsuccessfulLoginStepDefinitions(FrontPage frontPage,
                                                         Data data,
                                                         Browser browser,
                                                         WaitTool waitTool,
                                                         FrontPageSelectors frontPageSelectors){

        this.frontPage = frontPage;
        this.data = data;
        this.browser = browser;
        this.waitTool = waitTool;
        this.frontPageSelectors = frontPageSelectors;
    }

    @Given("I Launch the front page")
    public void iLaunchTheFrontPage() {

        browser.openBrowser("chrome");
        browser.goToUrl(data.frontLoginPageUrl);
    }

    @When("I enter correct front page email")
    public void iEnterCorrectFrontPageEmail(){

        frontPage.enterEmail(data.correctFrontPageEmail);
    }

    @And("I enter incorrect front page password")
    public void iEnterIncorrectFrontPagePassword() {

        frontPage.enterPassword(data.incorrectFrontPagePassword);
        frontPage.LoginButton();
    }

    @Then("I cannot login successfully in the front page")
    public void iCannotLoginSuccessfullyInTheFrontPage() {

        waitTool.implicitlyWaitForElement(frontPageSelectors.alertMessageInvalidEmailOrPassword);
        System.out.println("Alert is there and the test passed");
        System.out.println("Scenario: User login with right email and wrong password is ended");
    }

    @When("I enter incorrect front page email")
    public void iEnterIncorrectFrontPageEmail() {

        System.out.println("Scenario: User login with wrong email and right password is started");
        frontPage.enterEmail(data.incorrectFrontPageEmail);
    }

    @And("I enter correct front page password")
    public void iEnterCorrectFrontPagePassword() {

        frontPage.enterPassword(data.correctFrontPageEmail);
        frontPage.LoginButton();
    }

    @Then("I fail to login in the front page")
    public void iFailToLoginInTheFrontPage() {

        waitTool.implicitlyWaitForElement(frontPageSelectors.alertMessageInvalidEmailOrPassword);
        System.out.println("Alert is there and the test passed");
        System.out.println("Scenario: User login with wrong email and right password is ended");
    }

    @After
    public void closeBrowser(){

        browser.closeBrowser();
    }
}
