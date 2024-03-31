package stepdefinitions;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import static utilities.ReusableMethods.*;

public class TC07_AnasayfaAltindakiLinklerinTestiStepDefs {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici anasayfanin altinda bulunan kategoriler basligina gelir")
    public void kullaniciAnasayfaninAltindaBulunanKategorilerBasliginaGelir() {
        scrollIntoViewJS(homePage.kategorilerTextAnasayfaAltiHome);
    }
    @And("kullanici bilgisayar linke tiklar")
    public void kullaniciBilgisayarLinkeTiklar() {
        clickByJS(homePage.bilgisayarLinkKategorilerTextAnasayfaAltiHome);
    }
    @And("kullanici bilgisayar sayfasinin acildigini dogrular")
    public void kullaniciBilgisayarSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("bilgisayarlar");
    }
    @And("kullanici tablet linke tiklar")
    public void kullaniciTabletLinkeTiklar() {
        clickByJS(homePage.tabletLinkKategorilerTextAnasayfaAltiHome);
    }
    @And("kullanici tablet sayfasinin acildigini dogrular")
    public void kullaniciTabletSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("tablet");
    }
    @And("kullanici bir saniye bekler")
    public void kullaniciBirSaniyeBekler() {
        waitFor(1);
    }

    @And("kullanici telefon linke tiklar")
    public void kullaniciTelefonLinkeTiklar() {
        clickByJS(homePage.telefonlarLinkKategorilerTextAnasayfaAltiHome);
    }
    @And("kullanici telefon sayfasinin acildigini dogrular")
    public void kullaniciTelefonSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("telefonlar");
    }
    @And("kullanici laptop linke tiklar")
    public void kullaniciLaptopLinkeTiklar() {
        clickByJS(homePage.laptopLinkKategorilerTextAnasayfaAltiHome);
    }
    @And("kullanici laptop sayfasinin acildigini dogrular")
    public void kullaniciLaptopSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("laptop-notebook-dizustu-bilgisayarlar");
    }

    @And("kullanici kombi linke tiklar")
    public void kullaniciKombiLinkeTiklar() {
        clickByJS(homePage.kombiLinkKategorilerHome);
    }

    @And("kullanici kombi sayfasinin acildigini dogrular")
    public void kullaniciKombiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kombiler");
    }

    @And("kullanici klimalar linke tiklar")
    public void kullaniciKlimalarLinkeTiklar() {
        clickByJS(homePage.klimaLinkKategorilerHome);
    }

    @And("kullanici klimalar sayfasinin acildigini dogrular")
    public void kullaniciKlimalarSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("klimalar");
    }
}
