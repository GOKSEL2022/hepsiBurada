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
    }

    @And("kullanici telefon sayfasinin acildigini dogrular")
    public void kullaniciTelefonSayfasininAcildiginiDogrular() {
    }
}
