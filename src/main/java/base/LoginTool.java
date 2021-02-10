package base;

import selenium.browser.Browser;
import selenium.data.Data;
import selenium.pages.admin.AdminLoginPage;
import selenium.pages.frontpage.FrontPage;

public class LoginTool {

    private Browser browser;
    private FrontPage frontPage;
    private Data data;
    private AdminLoginPage adminLoginPage;

    public LoginTool(Browser browser, FrontPage frontPage, Data data, AdminLoginPage adminLoginPage){

        this.browser = browser;
        this.frontPage = frontPage;
        this.data = data;
        this.adminLoginPage = adminLoginPage;
    }

    public void loginToFrontPage() {

        browser.goToUrl(data.frontLoginPageUrl);
        frontPage.enterEmail(data.correctFrontPageEmail);
        frontPage.enterPassword(data.correctFrontPagePassword);
        frontPage.LoginButton();

    }

    public void loginToAdmin(){

        browser.goToUrl(data.adminUrl);
        adminLoginPage.enterEmail(data.correctAdminEmail);
        adminLoginPage.enterPassword(data.correctAdminPassword);
        adminLoginPage.clickLoginButton();
    }
}
