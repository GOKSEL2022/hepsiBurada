package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;

public class TC07_AnasayfaAltindakiLinklerinTestiStepDefs {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici anasayfanin altinda bulunan kategoriler basligina gelir")
    public void kullaniciAnasayfaninAltindaBulunanKategorilerBasliginaGelir() {
    }

    @And("kullanici bilgisayar linke tiklar")
    public void kullaniciBilgisayarLinkeTiklar() {
    }

    @And("kullanici bilgisayar sayfasinin acildigini dogrular")
    public void kullaniciBilgisayarSayfasininAcildiginiDogrular() {
    }
}
