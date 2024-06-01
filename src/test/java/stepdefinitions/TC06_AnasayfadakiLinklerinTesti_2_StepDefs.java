package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;
import static utilities.ReusableMethods.*;
public class TC06_AnasayfadakiLinklerinTesti_2_StepDefs {
    AllPages allPages=new AllPages();
    HomePage homePage=new HomePage();
    CheckoutPage checkoutPage=new CheckoutPage();
    EvTekstiliPage evTekstiliPage=new EvTekstiliPage();
    HalilarPage halilarPage=new HalilarPage();
    CoolHaliPage coolHaliPage=new CoolHaliPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici ev_yasam_kirtasiye_ofis linke gelir")
    public void kullaniciEv_yasam_kirtasiye_ofisLinkeGelir() {
        actions.moveToElement(allPages.homePage().evYasamKirtasiyeOfisLinkiHome).perform();
    }
    @And("kullanici ev_yasam_kirtasiye_ofis seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciEv_yasam_kirtasiye_ofisSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(allPages.homePage().ofisMobilyalariSecenegiEvYasamKirtasiyeOfisLinkiHome);
        waitFor(2);
        scrollIntoViewJS(allPages.homePage().evTekstiliSecenegiEvYasamKirtasiyeOfisLinkiHome);

    }
    @And("kullanici oto_bahce_yapi_market linke gelir")
    public void kullaniciOto_bahce_yapi_marketLinkeGelir() {
        actions.moveToElement(allPages.homePage().otoBahceYapiMarketLinkiHome).perform();
        waitFor(2);
    }

    @And("kullanici oto_bahce_yapi_market seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciOto_bahce_yapi_marketSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(allPages.homePage().bahceSecenegiotoBahceYapiMarketLinkiHome);
        waitFor(2);
        scrollIntoViewJS(allPages.homePage().banyoMutfakSecenegiotoBahceYapiMarketLinkiHome);
    }

    @And("kullanici anne_bebek_oyuncak linke gelir")
    public void kullaniciAnne_bebek_oyuncakLinkeGelir() {
        actions.moveToElement(allPages.homePage().anneBebekOyuncakLinkiHome).perform();
        waitFor(2);
    }

    @And("kullanici anne_bebek_oyuncak seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciAnne_bebek_oyuncakSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(allPages.homePage().bebekOdasiGuvenlikSecenegiAnneBebekOyuncakLinkiHome);
        waitFor(2);
        scrollIntoViewJS(allPages.homePage().bebekBeziIslakMendilSecenegiAnneBebekOyuncakLinkiHome);
    }

    @And("kullanici spor_outdoor linke gelir")
    public void kullaniciSpor_outdoorLinkeGelir() {
        actions.moveToElement(allPages.homePage().sporOutdoorLinkiHome).perform();
    }

    @And("kullanici spor_outdoor seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciSpor_outdoorSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(allPages.homePage().bisikletSecenegiSporOutdoorLinkiHome);
        waitFor(2);
        scrollIntoViewJS(allPages.homePage().fitnessKondisyonUrunleriSecenegiSporOutdoorLinkiHome);
    }

    @And("kullanici kozmetik_kisisel bakim linke gelir")
    public void kullaniciKozmetik_kisiselBakimLinkeGelir() {
        actions.moveToElement(allPages.homePage().kozmetikKisiselBakimLinkiHome).perform();
    }

    @And("kullanici kozmetik_kisisel bakim seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciKozmetik_kisiselBakimSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(allPages.homePage().tirasUrunleriKozmetikKisiselBakimLinkiHome);
        waitFor(2);
        scrollIntoViewJS(allPages.homePage().ciltBakimiKozmetikKisiselBakimLinkiHome);
    }
    @And("kullanici supermarket_pet shop linke gelir")
    public void kullaniciSupermarket_petShopLinkeGelir() {
        actions.moveToElement(allPages.homePage().supermarketPetshopLinkHome).perform();
    }

    @And("kullanici supermarket_pet shop seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciSupermarket_petShopSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(allPages.homePage().evTuketimMalzemeleriSupermarketPetshopLinkHome);
        waitFor(2);
        scrollIntoViewJS(allPages.homePage().gidaUrunleriSupermarketPetshopLinkHome);
    }
    @And("kullanici kitap_muzik_film_hobi linke gelir")
    public void kullaniciKitap_muzik_film_hobiLinkeGelir() {
        actions.moveToElement(allPages.homePage().kitapMuzikFilmHobiLinkHome).perform();
    }

    @And("kullanici kitap_muzik_film_hobi seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciKitap_muzik_film_hobiSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(allPages.homePage().kitapMuzikFilmHobiLinkHome);
        waitFor(2);
        scrollIntoViewJS(allPages.homePage().filmSecenegiitapMuzikFilmHobiLinkHome);
    }

    @And("kullanici premium firsatlardan bir urunu sepete ekler")
    public void kullaniciPremiumFirsatlardanBirUrunuSepeteEkler() {
        scrollIntoViewJS(allPages.homePage().premiumFirsatlarTextHome);
        actions.moveToElement(allPages.homePage().premiumFirsatlarIlkUrunHome).perform();
        waitFor(2);
        clickByJS(allPages.homePage().sepeteEkleButonPremiumFirsatlarIlkUrunHome);
    }
    @And("kullanici ekledigi urunun sepet sayfasinda oldugunu dogrular")
    public void kullaniciEkledigiUrununSepetSayfasindaOldugunuDogrular() {
        assert Driver.getDriver().switchTo().alert().getText().contains("ürün sepete eklendi");
        //assert homePage.urunSepeteEklendiAlertHome.isDisplayed();
        clickWithTimeOut(allPages.homePage().sepeteGitLinkUrunSepeteEklendiAlertHome,2);
        assert Driver.getDriver().getCurrentUrl().contains("sepetim");
    }

    @And("kullanici secilen urunler textinin altinda odemesi gereken toplam ucreti goruntuler")
    public void kullaniciSecilenUrunlerTextininAltindaOdemesiGerekenToplamUcretiGoruntuler() {
        assert allPages.checkoutPage().secilenUrunlerToplamUcret.isDisplayed();

    }
    @And("kullanici urunlerin ucretini goruntuler")
    public void kullaniciUrunlerinUcretiniGoruntuler() {
        assert allPages.checkoutPage().urunlerFiyatCheckout.isDisplayed();

    }
    @And("kullanici kargo ucretini goruntuler")
    public void kullaniciKargoUcretiniGoruntuler() {
        assert allPages.checkoutPage().kargoFiyatCheckout.isDisplayed();

    }

    @When("kullanici urunler ve kargo ucretlerinin secilen urunlerin toplam fiyatina esit oldugunu dogrular")
    public void kullaniciUrunlerVeKargoUcretlerininSecilenUrunlerinToplamFiyatinaEsitOldugunuDogrular() {
        int kargoUcreti=Integer.parseInt(allPages.checkoutPage().kargoFiyatCheckout.getText().replaceAll("\\D",""));
        int urunUcreti=Integer.parseInt(allPages.checkoutPage().urunlerFiyatCheckout.getText().replaceAll("\\D",""));
        int urunToplamUcret=Integer.parseInt(allPages.checkoutPage().secilenUrunlerToplamUcret.getText().replaceAll("\\D",""));
        assert urunUcreti + kargoUcreti == urunToplamUcret;
    }

    @When("kullanici ev tekstili secenegine tiklar")
    public void kullaniciEvTekstiliSecenegineTiklar() {
        clickWithTimeOut(allPages.homePage().evTekstiliSecenegiEvYasamKirtasiyeOfisLinkHome,2);
    }

    @And("kullanici ev tekstili sayfasinin acildigini dogrular")
    public void kullaniciEvTekstiliSayfasininAcildiginiDogrular() {
        assert allPages.evTekstiliPage().evTekstiliUrunleriTextEvTekstili.isDisplayed();
    }

    @And("kullanici kategorilerden haliyi secer")
    public void kullaniciKategorilerdenHaliyiSecer() {
        scrollIntoViewJS(allPages.evTekstiliPage().evTekstiliUrunleriTextEvTekstili);
        waitFor(2);
        clickByJS(allPages.evTekstiliPage().haliLinkKategoriEvTekstili);
    }

    @And("kullanici marka olarak merinos haliyi secer")
    public void kullaniciMarkaOlarakMerinosHaliyiSecer() {
        scrollIntoViewJS(allPages.halilarPage().merinosCheckboxMarkaHalilar);
        waitFor(2);
        clickByJS(allPages.halilarPage().merinosCheckboxMarkaHalilar);
    }

    @And("kullanici fiyat araligi olarak en az bin girer")
    public void kullaniciFiyatAraligiOlarakEnAzBinGirer() {
        scrollIntoViewJS(allPages.halilarPage().fiyatAraligiTextHalilar);
        waitFor(1);
        allPages.halilarPage().enAzFiyatAraligiTextBoxHalilar.sendKeys("1000");
    }

    @And("kullanici fiyat olarak en cok bes bin girer")
    public void kullaniciFiyatOlarakEnCokBesBinGirer() {
        allPages.halilarPage().enCokFiyatAraligiTextBoxHalilar.sendKeys("5000");
    }

    @And("kullanici search butona tiklar")
    public void kullaniciSearchButonaTiklar() {
        allPages.halilarPage().searchButtonFiyatAraligiHalilar.click();
    }

    @And("kullanici degerlendirme puani olarak dort yildiz ve uzerini secer")
    public void kullaniciDegerlendirmePuaniOlarakDortYildizVeUzeriniSecer() {
        scrollIntoViewJS(allPages.halilarPage().dortYildizVeUzeriPuanHalilar);
        clickWithTimeOut(allPages.halilarPage().dortYildizVeUzeriPuanHalilar,1);
    }
    @And("kullanici kuponlu urunler secenegini aktiflestirir")
    public void kullaniciKuponluUrunlerSeceneginiAktiflestirir() {
        allPages.halilarPage().kuponluUrunlerCheckboxHalilar.click();
    }
    @And("kullanici ebat olarak iki_yuz_x_uc_yuz cm secer")
    public void kullaniciEbatOlarakIki_yuz_x_uc_yuzCmSecer() {
        scrollIntoViewJS(allPages.halilarPage().yuzUcYuzCmEbatHalilar);
        clickWithTimeOut(allPages.halilarPage().yuzUcYuzCmEbatHalilar,1);
    }

    @And("kullanici renk olarak krem secer")
    public void kullaniciRenkOlarakKremSecer() {
        scrollIntoViewJS(allPages.halilarPage().kremRenk1KategoriHalilar);
        clickWithTimeOut(allPages.halilarPage().kremRenk1KategoriHalilar,1);
    }

    @And("kullanici taban olarak dokuma taban secer")
    public void kullaniciTabanOlarakDokumaTabanSecer() {
        clickByJS(allPages.halilarPage().dokumaTabanKategoriHalilar);
    }

    @And("kullanici iplik turu olarak akrilik_pamuk_polyester secer")
    public void kullaniciIplikTuruOlarakAkrilik_pamuk_polyesterSecer() {
    clickByJS(allPages.halilarPage().akrilikIplikTuruKategoriHalilar);
    }

    @And("kullanici tema olarak modern secer")
    public void kullaniciTemaOlarakModernSecer() {
        clickByJS(allPages.halilarPage().modernTemaKategoriHalilar);
    }
    @And("kullanici filtrelenen urune tiklar")
    public void kullaniciFiltrelenenUruneTiklar() {
        scrollIntoViewJS(allPages.halilarPage().filtrelenenIlkUrunHalilar);
        clickByJS(allPages.halilarPage().filtrelenenIlkUrunHalilar);
    }
    @And("kullanici acilan sayfada sectigi urunun oldugunu dogrular")
    public void kullaniciAcilanSayfadaSectigiUrununOldugunuDogrular() {
        switchToWindow(1);
        assert allPages.coolHaliPage().coolHaliSecilenUrunCoolHali.getText().contains("Cool Halı");

    }

    @And("kullanici urunun altinda filtreledigi ozellikleri goruntuler")
    public void kullaniciUrununAltindaFiltreledigiOzellikleriGoruntuler() {
    }

    @And("kullanici hav yuksekligi on mm secer")
    public void kullaniciHavYuksekligiOnMmSecer() {
        scrollIntoViewJS(allPages.halilarPage().onMmHavYuksekligiKategoriHalilar);
        clickWithTimeOut(allPages.halilarPage().onMmHavYuksekligiKategoriHalilar,1);
    }

    @And("kullanici girisimci kadin urunleri secenegini aktif hale getirir")
    public void kullaniciGirisimciKadinUrunleriSeceneginiAktifHaleGetirir() {
        scrollIntoViewJS(allPages.halilarPage().girisimciKadinUrunleriCheckboxKategoriHalilar);
        clickByJS(allPages.halilarPage().girisimciKadinUrunleriCheckboxKategoriHalilar);
    }

    @And("kullanici indirimli urunler seceneginin aktif oldugunu dogrular")
    public void kullaniciIndirimliUrunlerSecenegininAktifOldugunuDogrular() {
        //clickByJS(halilarPage.yurtDisindanUrunlerCheckboxKategoriHalilar);
        assert allPages.halilarPage().yurtDisindanUrunlerCheckboxKategoriHalilar.isEnabled();
    }

    @And("kullanici Sepette Kampanyali urunler seceneginin aktif oldugunu dogrular")
    public void kullaniciSepetteKampanyaliUrunlerSecenegininAktifOldugunuDogrular() {
        //clickByJS(halilarPage.girisimciKadinUrunleriCheckboxKategoriHalilar);
        assert allPages.halilarPage().girisimciKadinUrunleriCheckboxKategoriHalilar.isEnabled();
    }

    @And("kullanici hepsi burada limiti secenegini aktif hale getirir")
    public void kullaniciHepsiBuradaLimitiSeceneginiAktifHaleGetirir() {
        //clickByJS(halilarPage.hepsiBuradaLimitiCheckboxKategoriHalilar);
        assert allPages.halilarPage().hepsiBuradaLimitiCheckboxKategoriHalilar.isEnabled();
    }

    @And("kullanici fotografli degerlendirme secenegini aktif hale getirir")
    public void kullaniciFotografliDegerlendirmeSeceneginiAktifHaleGetirir() {
        //clickByJS(halilarPage.fotografliDegerlendirmeCheckboxKategoriHalilar);
        assert allPages.halilarPage().fotografliDegerlendirmeCheckboxKategoriHalilar.isEnabled();
    }

    @And("kullanici guncel degerlendirme secenegini aktif hale getirir")
    public void kullaniciGuncelDegerlendirmeSeceneginiAktifHaleGetirir() {
        //clickByJS(halilarPage.guncelDegerlendirmeCheckboxKategoriHalilar);
        assert allPages.halilarPage().guncelDegerlendirmeCheckboxKategoriHalilar.isEnabled();
    }

    @And("kullanici yurtdisindan seceneginin aktif oldugunu dogrular")
    public void kullaniciYurtdisindanSecenegininAktifOldugunuDogrular() {
        //clickByJS(halilarPage.yurtDisindanUrunlerCheckboxKategoriHalilar);
        assert allPages.halilarPage().yurtDisindanUrunlerCheckboxKategoriHalilar.isEnabled();
    }

    @And("kullanici guvenle kapinda seceneginin aktif oldugunu dogrular")
    public void kullaniciGuvenleKapindaSecenegininAktifOldugunuDogrular() {
        //clickByJS(halilarPage.guvenleKapindaCheckboxKategoriHalilar);
        assert allPages.halilarPage().guvenleKapindaCheckboxKategoriHalilar.isEnabled();
    }

    @And("kullanici urunle ilgili ozellikleri goruntuler")
    public void kullaniciUrunleIlgiliOzellikleriGoruntuler() {
        scrollIntoViewJS(allPages.coolHaliPage().tumOzelliklerLinkCoolHalilar);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(allPages.coolHaliPage().urunOzellikleriCoolHalilar.getText().contains("Kenar Türü"));
        softAssert.assertTrue(allPages.coolHaliPage().urunOzellikleriCoolHalilar.getText().contains("Ürün Rengi"));
        softAssert.assertTrue(allPages.coolHaliPage().urunOzellikleriCoolHalilar.getText().contains("Hav Yüksekliği"));
        softAssert.assertTrue(allPages.coolHaliPage().urunOzellikleriCoolHalilar.getText().contains("Kesim Şekli"));
        softAssert.assertTrue(allPages.coolHaliPage().urunOzellikleriCoolHalilar.getText().contains("Taban"));
        softAssert.assertTrue(allPages.coolHaliPage().urunOzellikleriCoolHalilar.getText().contains("İplik Türü"));
        softAssert.assertAll();

    }
    @And("kullanici tum ozellikler linke tiklar")
    public void kullaniciTumOzelliklerLinkeTiklar() {
        clickByJS(allPages.coolHaliPage().tumOzelliklerLinkCoolHalilar);
        assert allPages.halilarPage().urunAciklamasiTextTitleHalilar.getText().contains("Ürün Açıklaması");
        scrollIntoViewJS(allPages.halilarPage().urunOzellikleriAltBasliklarHalilar);
        assert allPages.halilarPage().urunOzellikleriAltBasliklarHalilar.isDisplayed();
    }

}
