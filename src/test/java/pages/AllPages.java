package pages;
public class AllPages {

    public AllPages(){
    }
    private HomePage homePage;
    private GirisPage girisPage;
    private AccountPage accountPage;
    private AppleidPage appleidPage;
    private FacebookPage facebookPage;
    private AraPage araPage;
    private UrunPage urunPage;
    private CheckoutPage checkoutPage;
    private BilgisayarlarPage bilgisayarlarPage;
    private GiyimAyakkabiPage giyimAyakkabiPage;
    private  StaticPage staticPage;
    public CheckoutPage checkoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage();
        }
        return checkoutPage;
    }

    public StaticPage staticPage() {
        if (staticPage == null) {
            staticPage = new StaticPage();
        }
        return staticPage;
    }

    public GiyimAyakkabiPage giyimAyakkabiPage() {
        if (giyimAyakkabiPage == null) {
            giyimAyakkabiPage = new GiyimAyakkabiPage();
        }
        return giyimAyakkabiPage;
    }

    public BilgisayarlarPage bilgisayarlarPage() {
        if (checkoutPage == null) {
            bilgisayarlarPage = new BilgisayarlarPage();
        }
        return bilgisayarlarPage;
    }
    public UrunPage urunPage() {
        if (urunPage == null) {
            urunPage = new UrunPage();
        }
        return urunPage;
    }
    public AraPage araPage() {
        if (araPage == null) {
            araPage = new AraPage();
        }
        return araPage;
    }
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
