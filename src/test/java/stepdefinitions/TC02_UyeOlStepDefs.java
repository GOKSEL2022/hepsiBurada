package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02_UyeOlStepDefs {
    HomePage homePage=new HomePage();
    GirisPage girisPage=new GirisPage();
    AccountPage accountPage=new AccountPage();
    AppleidPage appleidPage=new AppleidPage();
    FacebookPage facebookPage=new FacebookPage();
    Actions actions=new Actions(Driver.getDriver());
    int number = Faker.instance().number().numberBetween(1000, 9999);
    String mail="@gmail.com";
    int phoneNo1 = Faker.instance().number().numberBetween(530, 549);

    @And("kullanici giris_yapHome alanina gelir")
    public void kullaniciGiris_yapHomeAlaninaGelir() throws InterruptedException {
        actions.moveToElement(homePage.giris_yapHome).perform();
    }
    @And("kullanici uye ol linkini secer")
    public void kullaniciUyeOlLinkiniSecer() {
        ReusableMethods.clickByJS(homePage.uyeOlLinkGiris_yapHome);
    }

    @And("kullanici ePosta veya telefon alanina gecerli bir email adresi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaGecerliBirEmailAdresiGirer() {
        girisPage.epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(Faker.instance().name().firstName()+number+mail);
    }

    @And("kullanici devam et butonuna tiklar")
    public void kullaniciDevamEtButonunaTiklar() {
        ReusableMethods.clickByJS(girisPage.devamEtButonGiris);
    }
    @And("kullanici dogrulama maili gonderildi uyarisini goruntuler")
    public void kullaniciDogrulamaMailiGonderildiUyarisiniGoruntuler() {
        assert girisPage.dogrulamaMailiGonderildiAlertGiris.isDisplayed();
    }

    @And("kullanici uye_olKayit butona tiklar")
    public void kullaniciUye_olKayitButonaTiklar() {
        ReusableMethods.clickByJS(girisPage.uyeOlKayitButonGiris);

    }
    @And("kullanici ePosta veya telefon alanina gecerli bir telefon numarasi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaGecerliBirTelefonNumarasiGirer() {
        girisPage.epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(""+phoneNo1+""+phoneNo1+""+number);
    }
    @When("kullanici son birkac adim kaldi uyarisini goruntuler")
    public void kullaniciSonBirkacAdimKaldiUyarisiniGoruntuler() {
        assert girisPage.beklenmeyenBirHataOlustuAlertGiris.isDisplayed();
    }

    @And("kullanici google ile giris yap alanina tiklar")
    public void kullaniciGoogleIleGirisYapAlaninaTiklar() {
        ReusableMethods.scrollIntoViewJS(girisPage.googleIleGirisYapButonGiris);
        ReusableMethods.clickWithTimeOut(girisPage.googleIleGirisYapButonGiris,2);
    }

    @And("kullanici google ile oturum acin yazisini goruntuler")
    public void kullaniciGoogleIleOturumAcinYazisiniGoruntuler() {
        assert accountPage.googleIleOturumAcinTextAccount.isDisplayed();
    }

    @And("kullanici bir onceki sayfaya doner")
    public void kullaniciBirOncekiSayfayaDoner() {
        Driver.getDriver().navigate().back();
    }
    @And("kullanici apple ile giris yap alanina tiklar")
    public void kullaniciAppleIleGirisYapAlaninaTiklar() {
        ReusableMethods.scrollIntoViewJS(girisPage.appleIleGirisYapButonGiris);
        ReusableMethods.clickWithTimeOut(girisPage.appleIleGirisYapButonGiris,2);

    }

    @And("kullanici apple kimligi yazisini goruntuler")
    public void kullaniciAppleKimligiYazisiniGoruntuler() {
        assert appleidPage.appleKimligiTextAppleid.isDisplayed();
    }

    @And("kullanici facebook ile giris yap alanina tiklar")
    public void kullaniciFacebookIleGirisYapAlaninaTiklar() {
        ReusableMethods.scrollIntoViewJS(girisPage.facebookIleGirisYapButonGiris);
        ReusableMethods.clickWithTimeOut(girisPage.facebookIleGirisYapButonGiris,2);
    }
    @And("kullanici facebooka giris yap yazisini goruntuler")
    public void kullaniciFacebookaGirisYapYazisiniGoruntuler() {
        assert facebookPage.facebookYeniHesapOlusturTitleFacebook.isDisplayed();
    }
    @When("kullanici uye_olKayit butonu goruntuler")
    public void kullaniciUye_olKayitButonuGoruntuler() throws InterruptedException {
        Thread.sleep(2000);
        assert girisPage.uyeOlKayitButonGiris.isDisplayed();
    }
    @Given("kullanici ePosta veya telefon alanina turk telekom{string} girer")
    public void kullaniciEPostaVeyaTelefonAlaninaTurkTelekomGirer(String string) {
        girisPage.epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(string);
    }
    @Given("kullanici ePosta veya telefon alanina turkcell_vodafone numarasi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaTurkcell_vodafoneNumarasiGirer() {
        girisPage.epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(""+phoneNo1+""+phoneNo1+""+number);
    }
    @Given("kullanici ePosta veya telefon alanina bosluk karakteri girer ve enter a basar")
    public void kullaniciEPostaVeyaTelefonAlaninaBoslukKarakteriGirerVeEnterABasar() {
    }

    @When("kullanici eposta adresinizi veya telefon numaranizi girmelisiniz uyarisini gorur")
    public void kullaniciEpostaAdresiniziVeyaTelefonNumaraniziGirmelisinizUyarisiniGorur() {
    }

    @And("kullanici ePosta veya telefon alanina sembol girer")
    public void kullaniciEPostaVeyaTelefonAlaninaSembolGirer() {
    }

    @And("kullanici gecerli bir cep telefonu girmelisiniz uyarisini gorur")
    public void kullaniciGecerliBirCepTelefonuGirmelisinizUyarisiniGorur() {
    }

    @And("kullanici ePosta veya telefon alanina son hanesi harf iceren bir telefon no girer")
    public void kullaniciEPostaVeyaTelefonAlaninaSonHanesiHarfIcerenBirTelefonNoGirer() {
    }


}
