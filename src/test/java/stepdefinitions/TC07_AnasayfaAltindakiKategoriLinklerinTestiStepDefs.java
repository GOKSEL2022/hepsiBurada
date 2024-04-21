package stepdefinitions;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import static utilities.ReusableMethods.*;

public class TC07_AnasayfaAltindakiKategoriLinklerinTestiStepDefs {
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
        assert Driver.getDriver().getPageSource().contains("klimalar");
    }

    @And("kullanici camasir makinesi linke tiklar")
    public void kullaniciCamasirMakinesiLinkeTiklar() {
        homePage.camasirMakinesiLinkKategorilerHome.click();
    }

    @And("kullanici camasir makinesi sayfasinin acildigini dogrular")
    public void kullaniciCamasirMakinesiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getPageSource().contains("camasir-makineleri");
    }
    @And("kullanici bulasik makinesi linke tiklar")
    public void kullaniciBulasikMakinesiLinkeTiklar() {
        clickByJS(homePage.bulasikMakinesiLinkKategorilerHome);
    }

    @And("kullanici bulasik makinesi sayfasinin acildigini dogrular")
    public void kullaniciBulasikMakinesiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getPageSource().contains("bulasik-makineleri");
    }

    @And("kullanici gram altin linke tiklar")
    public void kullaniciGramAltinLinkeTiklar() {
        clickByJS(homePage.gramAltinLinkKategorilerHome);
    }

    @And("kullanici gram altin sayfasinin acildigini dogrular")
    public void kullaniciGramAltinSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getPageSource().contains("gram-altin");
    }

    @And("kullanici resat altin linke tiklar")
    public void kullaniciResatAltinLinkeTiklar() {
        clickByJS(homePage.resatAltinLinkKategorilerHome);
    }

    @And("kullanici resat altin sayfasinin acildigini dogrular")
    public void kullaniciResatAltinSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getPageSource().contains("resat-altin");
    }

    @And("kullanici yarim altin linke tiklar")
    public void kullaniciYarimAltinLinkeTiklar() {
        clickByJS(homePage.yarimAltinLinkKategorilerHome);
    }

    @And("kullanici yarim altin sayfasinin acildigini dogrular")
    public void kullaniciYarimAltinSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yarim-altin");
    }

    @And("kullanici aycicek yagi linke tiklar")
    public void kullaniciAycicekYagiLinkeTiklar() {
        clickByJS(homePage.aycicekYaglariLinkKategorilerHome);
    }

    @And("kullanici aycicek yagi sayfasinin acildigini dogrular")
    public void kullaniciAycicekYagiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("aycicek-yaglari");
    }

    @And("kullanici supurgeler linke tiklar")
    public void kullaniciSupurgelerLinkeTiklar() {
        clickByJS(homePage.supurgelerLinkKategorilerHome);
    }

    @And("kullanici supurgeler sayfasinin acildigini dogrular")
    public void kullaniciSupurgelerSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("supurgeler");
    }

    @And("kullanici robot supurge linke tiklar")
    public void kullaniciRobotSupurgeLinkeTiklar() {
        clickByJS(homePage.robotSupurgeLinkKategorilerHome);
    }

    @And("kullanici robot supurge sayfasinin acildigini dogrular")
    public void kullaniciRobotSupurgeSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("robot-supurge");
    }

    @And("kullanici airsoft linke tiklar")
    public void kullaniciAirsoftLinkeTiklar() {
        clickByJS(homePage.airsoftLinkKategorilerHome);
    }

    @And("kullanici airsoft sayfasinin acildigini dogrular")
    public void kullaniciAirsoftSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("airsoft");
    }

    @And("kullanici fritozler linke tiklar")
    public void kullaniciFritozlerLinkeTiklar() {
        clickByJS(homePage.fritozlerLinkKategorilerHome);
    }

    @And("kullanici fritozler sayfasinin acildigini dogrular")
    public void kullaniciFritozlerSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("fritozler");
    }

    @And("kullanici kitap linke tiklar")
    public void kullaniciKitapLinkeTiklar() {
        clickByJS(homePage.kitapLinkKategorilerHome);
    }

    @And("kullanici kitap sayfasinin acildigini dogrular")
    public void kullaniciKitapSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getPageSource().contains("kitaplar");
    }

    @And("kullanici film linke tiklar")
    public void kullaniciFilmLinkeTiklar() {
        clickByJS(homePage.filmLinkKategorilerHome);
    }

    @And("kullanici film sayfasinin acildigini dogrular")
    public void kullaniciFilmSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getPageSource().contains("filmler");
    }

    @And("kullanici muzik linke tiklar")
    public void kullaniciMuzikLinkeTiklar() {
        clickByJS(homePage.muzikLinkKategorilerHome);
    }

    @And("kullanici muzik sayfasinin acildigini dogrular")
    public void kullaniciMuzikSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("muzik");
    }

    @And("kullanici kis lastigi linke tiklar")
    public void kullaniciKisLastigiLinkeTiklar() {
    }

    @And("kullanici kis lastigi sayfasinin acildigini dogrular")
    public void kullaniciKisLastigiSayfasininAcildiginiDogrular() {
    }

    @And("kullanici oto aksesuar linke tiklar")
    public void kullaniciOtoAksesuarLinkeTiklar() {
    }

    @And("kullanici oto aksesuar sayfasinin acildigini dogrular")
    public void kullaniciOtoAksesuarSayfasininAcildiginiDogrular() {
    }

    @And("kullanici mobilyalar linke tiklar")
    public void kullaniciMobilyalarLinkeTiklar() {
    }

    @And("kullanici mobilyalar sayfasinin acildigini dogrular")
    public void kullaniciMobilyalarSayfasininAcildiginiDogrular() {
    }

    @And("kullanici mutfak masa takimlari linke tiklar")
    public void kullaniciMutfakMasaTakimlariLinkeTiklar() {
    }

    @And("kullanici mutfak masa takimlari sayfasinin acildigini dogrular")
    public void kullaniciMutfakMasaTakimlariSayfasininAcildiginiDogrular() {
    }

    @And("kullanici kahve makinesi linke tiklar")
    public void kullaniciKahveMakinesiLinkeTiklar() {
    }

    @And("kullanici kahve makinesi sayfasinin acildigini dogrular")
    public void kullaniciKahveMakinesiSayfasininAcildiginiDogrular() {
    }

    @And("kullanici cay makinesi linke tiklar")
    public void kullaniciCayMakinesiLinkeTiklar() {
    }

    @And("kullanici cay makinesi sayfasinin acildigini dogrular")
    public void kullaniciCayMakinesiSayfasininAcildiginiDogrular() {
    }
}
