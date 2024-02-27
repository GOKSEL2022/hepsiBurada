package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CheckoutPage;
import pages.EvTekstiliPage;
import pages.HalilarPage;
import pages.HomePage;
import utilities.Driver;

import java.util.List;

import static utilities.ReusableMethods.*;

public class TC06_AnasayfadakiLinklerinTesti_2_StepDefs {
    HomePage homePage=new HomePage();
    CheckoutPage checkoutPage=new CheckoutPage();
    EvTekstiliPage evTekstiliPage=new EvTekstiliPage();
    HalilarPage halilarPage=new HalilarPage();
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
        assert Driver.getDriver().switchTo().alert().getText().contains("ürün sepete eklendi");
        //assert homePage.urunSepeteEklendiAlertHome.isDisplayed();
        clickWithTimeOut(homePage.sepeteGitLinkUrunSepeteEklendiAlertHome,2);
        assert Driver.getDriver().getCurrentUrl().contains("sepetim");
    }

    @And("kullanici secilen urunler textinin altinda odemesi gereken toplam ucreti goruntuler")
    public void kullaniciSecilenUrunlerTextininAltindaOdemesiGerekenToplamUcretiGoruntuler() {
        assert checkoutPage.secilenUrunlerToplamUcret.isDisplayed();

    }
    @And("kullanici urunlerin ucretini goruntuler")
    public void kullaniciUrunlerinUcretiniGoruntuler() {
        assert checkoutPage.urunlerFiyatCheckout.isDisplayed();

    }
    @And("kullanici kargo ucretini goruntuler")
    public void kullaniciKargoUcretiniGoruntuler() {
        assert checkoutPage.kargoFiyatCheckout.isDisplayed();

    }

    @When("kullanici urunler ve kargo ucretlerinin secilen urunlerin toplam fiyatina esit oldugunu dogrular")
    public void kullaniciUrunlerVeKargoUcretlerininSecilenUrunlerinToplamFiyatinaEsitOldugunuDogrular() {
        int kargoUcreti=Integer.parseInt(checkoutPage.kargoFiyatCheckout.getText().replaceAll("\\D",""));
        int urunUcreti=Integer.parseInt(checkoutPage.urunlerFiyatCheckout.getText().replaceAll("\\D",""));
        int urunToplamUcret=Integer.parseInt(checkoutPage.secilenUrunlerToplamUcret.getText().replaceAll("\\D",""));
        assert urunUcreti + kargoUcreti == urunToplamUcret;
    }

    @When("kullanici ev tekstili secenegine tiklar")
    public void kullaniciEvTekstiliSecenegineTiklar() {
        clickWithTimeOut(homePage.evTekstiliSecenegiEvYasamKirtasiyeOfisLinkHome,2);
    }

    @And("kullanici ev tekstili sayfasinin acildigini dogrular")
    public void kullaniciEvTekstiliSayfasininAcildiginiDogrular() {
        assert evTekstiliPage.evTekstiliUrunleriTextEvTekstili.isDisplayed();
    }

    @And("kullanici kategorilerden haliyi secer")
    public void kullaniciKategorilerdenHaliyiSecer() {
        scrollIntoViewJS(evTekstiliPage.evTekstiliUrunleriTextEvTekstili);
        waitFor(2);
        clickByJS(evTekstiliPage.haliLinkKategoriEvTekstili);
    }

    @And("kullanici marka olarak merinos haliyi secer")
    public void kullaniciMarkaOlarakMerinosHaliyiSecer() {
        scrollIntoViewJS(halilarPage.merinosCheckboxMarkaHalilar);
        waitFor(2);
        clickByJS(halilarPage.merinosCheckboxMarkaHalilar);
    }

    @And("kullanici fiyat araligi olarak en az bin girer")
    public void kullaniciFiyatAraligiOlarakEnAzBinGirer() {
        scrollIntoViewJS(halilarPage.fiyatAraligiTextHalilar);
        waitFor(1);
        halilarPage.enAzFiyatAraligiTextBoxHalilar.sendKeys("1000");
    }

    @And("kullanici fiyat olarak en cok bes bin girer")
    public void kullaniciFiyatOlarakEnCokBesBinGirer() {
        halilarPage.enCokFiyatAraligiTextBoxHalilar.sendKeys("5000");
    }

    @And("kullanici search butona tiklar")
    public void kullaniciSearchButonaTiklar() {
        halilarPage.searchButtonFiyatAraligiHalilar.click();
    }

    @And("kullanici aralik olarak bin ve bes bin secildigini dogrular")
    public void kullaniciAralikOlarakBinVeBesBinSecildiginiDogrular() {
            scrollIntoViewJS(halilarPage.fiyatAraligiTextHalilar);
            waitFor(1);
            assert halilarPage.binBesBinCheckboxHalilar.isDisplayed();
    }
    @And("kullanici renk olarak yesil secer")
    public void kullaniciRenkOlarakYesilSecer() {
    }

    @And("kullanici taban olarak dokuma taban secer")
    public void kullaniciTabanOlarakDokumaTabanSecer() {
    }

    @And("kullanici iplik turu olarak akrilik_pamuk_polyester secer")
    public void kullaniciIplikTuruOlarakAkrilik_pamuk_polyesterSecer() {
    }

    @And("kullanici renk olarak yesil secili oldugunu dogrular")
    public void kullaniciRenkOlarakYesilSeciliOldugunuDogrular() {
    }

    @And("kullanici tema olarak desenli secer")
    public void kullaniciTemaOlarakDesenliSecer() {
    }

    @And("kullanici filtrelenen urune tiklar")
    public void kullaniciFiltrelenenUruneTiklar() {
    }

    @And("kullanici acilan sayfada sectigi urunun oldugunu dogrular")
    public void kullaniciAcilanSayfadaSectigiUrununOldugunuDogrular() {
    }

    @And("kullanici urunun altinda filtreledigi ozellikleri goruntuler")
    public void kullaniciUrununAltindaFiltreledigiOzellikleriGoruntuler() {
    }

    @And("kullanici tum ozellikler linke tiklar")
    public void kullaniciTumOzelliklerLinkeTiklar() {
    }

    @And("kullanici urunle ilgili ozellikleri goruntuler")
    public void kullaniciUrunleIlgiliOzellikleriGoruntuler() {
    }

    @And("kullanici degerlendirme puani olarak dort yildiz ve uzerini secer")
    public void kullaniciDegerlendirmePuaniOlarakDortYildizVeUzeriniSecer() {
    }

    @And("kullanici kuponlu urunler secenegini aktiflestirir")
    public void kullaniciKuponluUrunlerSeceneginiAktiflestirir() {
    }

    @And("kullanici ebat olarak iki_yuz_x_bes_yuz cm secer")
    public void kullaniciEbatOlarakIki_yuz_x_bes_yuzCmSecer() {
    }

    @And("kullanici hav yuksekligi on mm secer")
    public void kullaniciHavYuksekligiOnMmSecer() {
    }
}
