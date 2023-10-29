package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.GirisPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02_GirisStepDefs {
    HomePage homePage=new HomePage();
    GirisPage girisPage=new GirisPage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici giris_yapHome alanina gelir")
    public void kullaniciGiris_yapHomeAlaninaGelir() throws InterruptedException {
        actions.moveToElement(homePage.giris_yapHome).perform();
    }
    @And("kullanici giris yap linkini secer")
    public void kullaniciGirisYapLinkiniSecer() {
        actions.moveToElement(homePage.girisYapLinkGiris_yapHome).
                doubleClick(homePage.girisYapLinkGiris_yapHome).build().perform();


    }

    @And("kullanici ePosta veya telefon alanina gecerli bir email adresi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaGecerliBirEmailAdresiGirer() {
    }

    @And("kullanici devam et butonuna tiklar")
    public void kullaniciDevamEtButonunaTiklar() {
    }

    @And("kullanici dogrulama maili gonderildi uyarisini goruntuler")
    public void kullaniciDogrulamaMailiGonderildiUyarisiniGoruntuler() {
    }

    @And("kullanici giris_yapKayit butona tiklar")
    public void kullaniciGiris_yapKayitButonaTiklar() {
    }

    @And("kullanici ePosta veya telefon alanini temizler")
    public void kullaniciEPostaVeyaTelefonAlaniniTemizler() {
    }

    @And("kullanici ePosta veya telefon alanina gecerli bir telefon numarasi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaGecerliBirTelefonNumarasiGirer() {
    }

    @When("kullanici son birkac adim kaldi uyarisini goruntuler")
    public void kullaniciSonBirkacAdimKaldiUyarisiniGoruntuler() {
    }
}
