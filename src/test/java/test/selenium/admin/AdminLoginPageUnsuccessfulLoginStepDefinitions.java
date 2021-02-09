package test.selenium.admin;

import base.WaitTool;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.browser.Browser;
import selenium.data.Data;
import selenium.pages.admin.AdminLoginPage;
import selenium.selectors.admin.AdminSelectors;

public class AdminLoginPageUnsuccessfulLoginStepDefinitions {

    private AdminLoginPage adminLoginPage;
    private AdminSelectors adminSelectors;
    private Data data;
    private Browser browser;
    private WaitTool waitTool;

    public AdminLoginPageUnsuccessfulLoginStepDefinitions(AdminLoginPage adminLoginPage,
                                                          AdminSelectors adminSelectors,
                                                          Data data,
                                                          Browser browser,
                                                          WaitTool waitTool){

        this.adminLoginPage = adminLoginPage;
        this.adminSelectors = adminSelectors;
        this.data = data;
        this.browser = browser;
        this.waitTool = waitTool;
    }

    @Given("I Launch the admin page")
    public void iLaunchTheAdminPage() {

        browser.openBrowser("chrome");
        browser.goToUrl(data.adminUrl);
    }

    @When("I enter correct email")
    public void iEnterCorrectEmail() {
        System.out.println("Scenario: User loginTool with right email and wrong password starts");
        adminLoginPage.enterEmail(data.correctAdminEmail);
    }

    @And("I enter incorrect password")
    public void iEnterIncorrectPassword() {
        adminLoginPage.enterPassword(data.incorrectAdminPassword);
        waitTool.implicitlyWaitForElement(adminSelectors.loginButtonXPATH);
        adminLoginPage.clickLoginButton();
    }


    @Then("I cannot login successfully")
    public void iCannotLoginSuccessfully(){
        waitTool.implicitlyWaitForElement(adminSelectors.invalidLoginCredentialsXPATH);
        System.out.println("Alert massage is there and the test passed");
    }

    @When("I enter incorrect email")
    public void iEnterIncorrectEmail() {
        System.out.println("Scenario: User loginTool with wrong email and right password");
        adminLoginPage.enterEmail(data.incorrectAdminEmail);
    }

    @And("I enter correct password")
    public void iEnterCorrectPassword() {
        adminLoginPage.enterPassword(data.correctAdminPassword);
        waitTool.implicitlyWaitForElement(adminSelectors.loginButtonXPATH);
        adminLoginPage.clickLoginButton();

    }

    @Then("I fail to login")
    public void iFailToLogin() {
        waitTool.implicitlyWaitForElement(adminSelectors.invalidLoginCredentialsXPATH);
        System.out.println("Alert massage is there and the test passed");
    }

    @After
    public void closeBrowser(){
        browser.closeBrowser();
    }
}
