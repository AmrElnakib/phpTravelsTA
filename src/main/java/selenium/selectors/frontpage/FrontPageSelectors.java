package selenium.selectors.frontpage;

public class FrontPageSelectors {

    // ===| LOGIN PAGE |===

    public String emailFieldXPATH = "//input[@placeholder='Email']";
    public String passwordFieldXPATH = "//input[@placeholder='Password']";
    public String loginButtonXPATH = "//button[contains(text(), 'Login')]";


    // ===| LANDING PAGE |===

    public String logoLinkXPATH = "//button/following-sibling::a[@href='https://www.phptravels.net/']";
    public String homeLinkXPATH = "//a[contains(text(),'Home')]";
    public String blogLinkXPATH = "//a[contains(text(),'Blog')]";
    public String offersLinkXPATH = "//li/a[contains(text(),'Offers')]";
    public String hotelsLinkXPATH = "//a[@title='Hotels']";
    public String flightsLinkXPATH = "//a[@title='Flights']";
    public String toursLinkXPATH = "//a[@title='Tours']";
    public String carsLinkXPATH = "//a[@title='Cars']";
    public String visaLinkXPATH = "//a[@title='Ivisa']";
    public String hotelsSearchFieldXPATH = "//span[contains(text(), 'Search by Hotel or City Name')]";
    public String hotelsSearchButtonXPATH = "//div[@id='hotels']//button[@type='submit']";
    public String filghtsSearchButtonXPATH = "//div[@id='flights']//button[@type='submit']";
    public String toursSearchButtonXPATH = "//div[@id='tours']//button[@type='submit']";
    public String carsSearchButtonXPATH = "//div[@id='cars']//button[@type='submit']";
    public String visaSearchButtonXPATH = "//div[@id='ivisa']//button[@type='submit']";
    public String hotelsCheckinFieldXPATH = "//input[@name='checkin']";
    public String hotelsCheckoutFieldXPATH = "//input[@name='checkout']";
    public String alertMessageInvalidEmailOrPassword = "//div[contains(text(), 'Invalid Email or Password')]";
    public String featuredHotelsRendezvousHotelsLinkXPATH = "//a[@href='https://www.phptravels.net/hotels/singapore/singapore/Rendezvous-Hotels']";

    // ===| ACCOUNT PAGE |===

    public String accountWelcomeTextXPATH = "//h3[contains(text(), 'Hi, Johny Smith')]";
    public String headerDropDownMenuOpenerXPATH = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']/ul/li[1]/a[@data-toggle='dropdown']";
    public String headerDropDownAccountOptionXPATH = "//div[@class='modal-header']//following-sibling::ul/li/ul/li/a[contains(text(), 'Account')]";
    public String headerDropDownLogoutOptionXPATH = "";
    public String accountPageAvatarXPATH = "//div/img[@src='https://www.phptravels.net/uploads/global/default/user.png']";
    public String accountPageMyProfileOptionXPATH = "//a[@href='#profile']";
    public String accountPageFirstNameFieldXPATH = "//input[@name='firstname']";
    public String accountPageLastNameXPATH = "//input[@name='lastname']";
    public String hotelsRendezvousHotelsTripleRoomsPriceXPATH = "(//div[button[@data-parent='#accordion']]//following-sibling::div/h2/strong)[1]";

}
