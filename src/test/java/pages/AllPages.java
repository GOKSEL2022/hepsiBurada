package pages;
public class AllPages {

    public AllPages(){
    }
    private HomePage homePage;
    private GirisPage girisPage;
    private AccountPage accountPage;
    private AppleidPage appleidPage;
    private FacebookPage facebookPage;

    public FacebookPage facebookPage() {
        if (facebookPage == null) {
            facebookPage = new FacebookPage();
        }
        return facebookPage;
    }

    public AppleidPage appleidPage() {
        if (appleidPage == null) {
            appleidPage = new AppleidPage();
        }
        return appleidPage;
    }

    public AccountPage accountPage() {
        if (accountPage == null) {
            accountPage = new AccountPage();
        }
        return accountPage;
    }

    public GirisPage girisPage() {
        if (girisPage == null) {
            girisPage = new GirisPage();
        }
        return girisPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

}
