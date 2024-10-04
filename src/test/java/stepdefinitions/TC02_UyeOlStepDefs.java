package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class TC02_UyeOlStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    int number = Faker.instance().number().numberBetween(1000, 9999);
    String mail="@gmail.com";
    int phoneNo1 = Faker.instance().number().numberBetween(530, 549);
    String karakter = Faker.instance().lorem().characters(10,15);

    @And("kullanici giris_yapHome alanina gelir")
    public void kullaniciGiris_yapHomeAlaninaGelir() {
        actions.moveToElement(allPages.homePage().giris_yapHome).perform();
    }
    @And("kullanici uye ol linkini secer")
    public void kullaniciUyeOlLinkiniSecer() {
        clickByJS(allPages.homePage().uyeOlLinkGiris_yapHome);
    }
    @And("kullanici ePosta veya telefon alanina gecerli bir email adresi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaGecerliBirEmailAdresiGirer() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(Faker.instance().name().firstName()+number+mail);
    }
    @And("kullanici devam et butonuna tiklar")
    public void kullaniciDevamEtButonunaTiklar() {
        clickByJS(allPages.girisPage().devamEtButonGiris);
    }
    @And("kullanici dogrulama maili gonderildi uyarisini goruntuler")
    public void kullaniciDogrulamaMailiGonderildiUyarisiniGoruntuler() {
        assert allPages.girisPage().dogrulamaMailiGonderildiAlertGiris.isDisplayed();
    }
    @And("kullanici uye_olKayit butona tiklar")
    public void kullaniciUye_olKayitButonaTiklar() {
        clickByJS(allPages.girisPage().uyeOlKayitButonGiris);
    }
    @And("kullanici ePosta veya telefon alanina gecerli bir telefon numarasi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaGecerliBirTelefonNumarasiGirer() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(""+phoneNo1+""+phoneNo1+""+number);
    }
    @When("kullanici son birkac adim kaldi uyarisini goruntuler")
    public void kullaniciSonBirkacAdimKaldiUyarisiniGoruntuler() {
        assert allPages.girisPage().beklenmeyenBirHataOlustuAlertGiris.isDisplayed();
    }
    @And("kullanici google ile giris yap alanina tiklar")
    public void kullaniciGoogleIleGirisYapAlaninaTiklar() {
        scrollIntoViewJS(allPages.girisPage().googleIleGirisYapButonGiris);
        clickWithTimeOut(allPages.girisPage().googleIleGirisYapButonGiris,2);
    }
    @And("kullanici google ile oturum acin yazisini goruntuler")
    public void kullaniciGoogleIleOturumAcinYazisiniGoruntuler() {
        assert allPages.accountPage().googleIleOturumAcinTextAccount.isDisplayed();
    }
    @And("kullanici bir onceki sayfaya doner")
    public void kullaniciBirOncekiSayfayaDoner() {
        Driver.getDriver().navigate().back();
    }
    @And("kullanici apple ile giris yap alanina tiklar")
    public void kullaniciAppleIleGirisYapAlaninaTiklar() {
        scrollIntoViewJS(allPages.girisPage().appleIleGirisYapButonGiris);
        clickWithTimeOut(allPages.girisPage().appleIleGirisYapButonGiris,2);
    }
    @And("kullanici apple kimligi yazisini goruntuler")
    public void kullaniciAppleKimligiYazisiniGoruntuler() {
        assert allPages.appleidPage().appleKimligiTextAppleid.isDisplayed();
    }
    @And("kullanici facebook ile giris yap alanina tiklar")
    public void kullaniciFacebookIleGirisYapAlaninaTiklar() {
        scrollIntoViewJS(allPages.girisPage().facebookIleGirisYapButonGiris);
        clickWithTimeOut(allPages.girisPage().facebookIleGirisYapButonGiris,2);
    }
    @And("kullanici facebooka giris yap yazisini goruntuler")
    public void kullaniciFacebookaGirisYapYazisiniGoruntuler() {
        assert allPages.facebookPage().facebookYeniHesapOlusturTitleFacebook.isDisplayed();
    }
    @When("kullanici uye_olKayit butonu goruntuler")
    public void kullaniciUye_olKayitButonuGoruntuler() throws InterruptedException {
        Thread.sleep(2000);
        assert allPages.girisPage().uyeOlKayitButonGiris.isDisplayed();
    }
    @Given("kullanici ePosta veya telefon alanina turk telekom{string} girer")
    public void kullaniciEPostaVeyaTelefonAlaninaTurkTelekomGirer(String string) {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(string);
    }
    @Given("kullanici ePosta veya telefon alanina turkcell_vodafone numarasi girer")
    public void kullaniciEPostaVeyaTelefonAlaninaTurkcell_vodafoneNumarasiGirer() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(""+phoneNo1+""+phoneNo1+""+number);
    }
    @Given("kullanici ePosta veya telefon alanina bosluk karakteri girer ve enter a basar")
    public void kullaniciEPostaVeyaTelefonAlaninaBoslukKarakteriGirerVeEnterABasar() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.ENTER);
    }
    @When("kullanici eposta adresinizi veya telefon numaranizi girmelisiniz uyarisini gorur")
    public void kullaniciEpostaAdresiniziVeyaTelefonNumaraniziGirmelisinizUyarisiniGorur() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.girisPage().epostaAdresiniziVeyaTelefonNoGirmelisinizAlertGiris.isDisplayed();
    }
    @And("kullanici ePosta veya telefon alanina sembol girer")
    public void kullaniciEPostaVeyaTelefonAlaninaSembolGirer() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys("////");
    }
    @When("kullanici gecerli bir cep telefonu girmelisiniz uyarisini gorur")
    public void kullanici_gecerli_bir_cep_telefonu_girmelisiniz_uyarisini_gorur() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.girisPage().gecerliBirCepTelefonuGirmelisinizAlertGiris.isDisplayed();
    }
    @And("kullanici ePosta veya telefon alanina son hanesi harf iceren bir telefon no girer")
    public void kullaniciEPostaVeyaTelefonAlaninaSonHanesiHarfIcerenBirTelefonNoGirer() throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys("546507525a",Keys.ENTER);
    }
    @When("kullanici gecerli bir eposta adresi girmelisiniz uyarisini gorur")
    public void kullaniciGecerliBirEpostaAdresiGirmelisinizUyarisiniGorur() {
        assert allPages.girisPage().gecerliBirEpostaAdresiGirmelisinizAlertGiris.isDisplayed();
    }
    @And("kullanici sayfayi yeniler")
    public void kullaniciSayfayiYeniler() {
        Driver.getDriver().navigate().refresh();
    }
    @And("kullanici ePosta veya telefon alanina {string} girer")
    public void kullaniciEPostaVeyaTelefonAlaninaGirer(String string) {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(string);
    }
    @Given("kullanici ePosta veya telefon alanina alfabetik harfler girer ve enter a basar")
    public void kullaniciEPostaVeyaTelefonAlaninaAlfabetikHarflerGirerVeEnterABasar() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(karakter+mail,Keys.ENTER);
    }
    @And("kullanici iki saniye bekler")
    public void kullaniciIkiSaniyeBekler() throws InterruptedException {
        Thread.sleep(2000);
    }
    @And("kullanici ePosta veya telefon alanina tiklar")
    public void kullaniciEPostaVeyaTelefonAlaninaTiklar() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.click();
    }
    @And("kullanici buEpostaAdresineAitHesapOldugunuFarkEttik uyarisini gorur")
    public void kullaniciBuEpostaAdresineAitHesapOldugunuFarkEttikUyarisiniGorur() {
        assert allPages.girisPage().buEpostaAdresineAitHesapOldugunuFarkEttikTextGiris.isDisplayed();
    }
    @Given("kullanici ePosta veya telefon alanina kayitli email girer")
    public void kullaniciEPostaVeyaTelefonAlaninaKayitliEmailGirer() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(ConfigReader.getProperty("kayitliEmail"), Keys.ENTER);
    }
}
