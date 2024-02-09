package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class TC06_AnasayfadakiLinklerinTesti_2_StepDefs {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici ev_yasam_kirtasiye_ofis linke gelir")
    public void kullaniciEv_yasam_kirtasiye_ofisLinkeGelir() {
        actions.moveToElement(homePage.evYasamKirtasiyeOfisLinkiHome).perform();
    }
    @And("kullanici ev_yasam_kirtasiye_ofis seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciEv_yasam_kirtasiye_ofisSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.ofisMobilyalariSecenegiEvYasamKirtasiyeOfisLinkiHome);
        waitFor(2);
        scrollIntoViewJS(homePage.evTekstiliSecenegiEvYasamKirtasiyeOfisLinkiHome);

    }
    @And("kullanici oto_bahce_yapi_market linke gelir")
    public void kullaniciOto_bahce_yapi_marketLinkeGelir() {
        actions.moveToElement(homePage.otoBahceYapiMarketLinkiHome).perform();
        waitFor(2);
    }

    @And("kullanici oto_bahce_yapi_market seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciOto_bahce_yapi_marketSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.bahceSecenegiotoBahceYapiMarketLinkiHome);
        waitFor(2);
        scrollIntoViewJS(homePage.banyoMutfakSecenegiotoBahceYapiMarketLinkiHome);
    }

    @And("kullanici anne_bebek_oyuncak linke gelir")
    public void kullaniciAnne_bebek_oyuncakLinkeGelir() {
        actions.moveToElement(homePage.anneBebekOyuncakLinkiHome).perform();
        waitFor(2);
    }

    @And("kullanici anne_bebek_oyuncak seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciAnne_bebek_oyuncakSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.bebekOdasiGuvenlikSecenegiAnneBebekOyuncakLinkiHome);
        waitFor(2);
        scrollIntoViewJS(homePage.bebekBeziIslakMendilSecenegiAnneBebekOyuncakLinkiHome);
    }

    @And("kullanici spor_outdoor linke gelir")
    public void kullaniciSpor_outdoorLinkeGelir() {
        actions.moveToElement(homePage.sporOutdoorLinkiHome).perform();
    }

    @And("kullanici spor_outdoor seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciSpor_outdoorSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.bisikletSecenegiSporOutdoorLinkiHome);
        waitFor(2);
        scrollIntoViewJS(homePage.fitnessKondisyonUrunleriSecenegiSporOutdoorLinkiHome);
    }

    @And("kullanici kozmetik_kisisel bakim linke gelir")
    public void kullaniciKozmetik_kisiselBakimLinkeGelir() {
        actions.moveToElement(homePage.kozmetikKisiselBakimLinkiHome).perform();
    }

    @And("kullanici kozmetik_kisisel bakim seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciKozmetik_kisiselBakimSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.tirasUrunleriKozmetikKisiselBakimLinkiHome);
        waitFor(2);
        scrollIntoViewJS(homePage.ciltBakimiKozmetikKisiselBakimLinkiHome);
    }
    @And("kullanici supermarket_pet shop linke gelir")
    public void kullaniciSupermarket_petShopLinkeGelir() {
        actions.moveToElement(homePage.supermarketPetshopLinkHome).perform();
    }

    @And("kullanici supermarket_pet shop seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciSupermarket_petShopSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.evTuketimMalzemeleriSupermarketPetshopLinkHome);
        waitFor(2);
        scrollIntoViewJS(homePage.gidaUrunleriSupermarketPetshopLinkHome);
    }
    @And("kullanici kitap_muzik_film_hobi linke gelir")
    public void kullaniciKitap_muzik_film_hobiLinkeGelir() {
        actions.moveToElement(homePage.kitapMuzikFilmHobiLinkHome).perform();
    }

    @And("kullanici kitap_muzik_film_hobi seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciKitap_muzik_film_hobiSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.kitapMuzikFilmHobiLinkHome);
        waitFor(2);
        scrollIntoViewJS(homePage.filmSecenegiitapMuzikFilmHobiLinkHome);
    }

    @And("kullanici premium firsatlardan bir urunu sepete ekler")
    public void kullaniciPremiumFirsatlardanBirUrunuSepeteEkler() {
        scrollIntoViewJS(homePage.premiumFirsatlarTextHome);
        actions.moveToElement(homePage.premiumFirsatlarIlkUrunHome).perform();
        waitFor(2);
        clickByJS(homePage.sepeteEkleButonPremiumFirsatlarIlkUrunHome);

    }

    @And("kullanici ekledigi urunun sepet sayfasinda oldugunu dogrular")
    public void kullaniciEkledigiUrununSepetSayfasindaOldugunuDogrular() {
    }

    @And("kullanici secilen urunler textinin altinda odemesi gereken toplam ucreti goruntuler")
    public void kullaniciSecilenUrunlerTextininAltindaOdemesiGerekenToplamUcretiGoruntuler() {
    }

    @And("kullanici urunlerin ucretini goruntuler")
    public void kullaniciUrunlerinUcretiniGoruntuler() {
    }

    @And("kullanici kargo ucretini goruntuler")
    public void kullaniciKargoUcretiniGoruntuler() {
    }

    @When("kullanici urunler ve kargo ucretlerinin secilen urunlerin toplam fiyatina esit oldugunu dogrular")
    public void kullaniciUrunlerVeKargoUcretlerininSecilenUrunlerinToplamFiyatinaEsitOldugunuDogrular() {
    }
}
