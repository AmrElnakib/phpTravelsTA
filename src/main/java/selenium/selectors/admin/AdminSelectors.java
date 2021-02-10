package selenium.selectors.admin;

public class AdminSelectors {

    // ===| LOGIN PAGE |===
    public String emailFieldXPATH = "//input[@type='text'][@name='email']"; //h2/following-sibling::input[1]
    public String passwordFieldXPATH = "//input[@name='password']";
    public String loginButtonXPATH = "//button[@type='submit']";
    public String rememberMeCheckBoxXPATH = "//input[@name='remember']";
    public String forgotPasswordXPATH = "//a[@id='link-forgot']";

    public String invalidLoginCredentialsXPATH = "//div[contains(text(), 'Invalid Login Credentials')]";

    // ===| DASHBOARD |===

    public String sidebarMenuHotelsOptionXPATH = "//a[@href='#Hotels']";
    public String hotelsMenuHotelsLinkXPATH = "//ul[@id='Hotels']/li[1]/a[contains(text(), 'Hotels')]";
    public String hotelsMenuRoomsLinkXPATH = "//ul[@id='Hotels']//a[contains(text(), 'Room')]";
    public String hotelsMenuExtrasLinkXPATH = "//ul[@id='Hotels']//a[contains(text(), 'Extras')]";
    public String hotelsMenuReviewsLinkXPATH = "//ul[@id='Hotels']//a[contains(text(), 'Reviews')]";
    public String hotelsMenuHotelsSettingLinkXPATH = "//ul[@id='Hotels']//a[contains(text(), 'Hotels Settings')]";

    // ===| STRINGS FOR EDITING A ROOM PRICE TEST |===
    public String tripleRoomRendezvousHotelsLinkXPATH = "//td[contains(text(), 'Rendezvous Hotels')]//preceding-sibling::td/a[contains(text(), 'Triple Rooms')]";
    public String updatePagePriceFieldXPATH = "//input[@placeholder='Price']";
    public String updatePageSubmitButtonXPATH = "//button[@id='update']";
}
