package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;
public class TC03_GirisYapStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici girisYapLinkGiris_yapHome linkini tiklar")
    public void kullaniciGirisYapLinkGiris_yapHomeLinkiniTiklar() {
        clickByJS(allPages.homePage().girisYapLinkGiris_yapHome);
    }
    @Given("kullanici girisYapButonOnaylamaGiris e tiklar")
    public void kullaniciGirisYapButonOnaylamaGirisETiklar() {
        clickByJS(allPages.girisPage().girisYapButonOnaylamaGiris);
    }
    @When("kullanici ePosta veya telefon alanina kayitli email girer ve enter a tiklar")
    public void kullaniciEPostaVeyaTelefonAlaninaKayitliEmailGirerVeEnterATiklar() {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(ConfigReader.getProperty("kayitliEmail"), Keys.ENTER);
    }
    @And("kullanici sifre alanina kayitli sifresini girer ve enter a tiklar")
    public void kullaniciSifreAlaninaKayitliSifresiniGirerVeEnterATiklar() {
        allPages.girisPage().sifreAlaniTextBoxGirisYapGiris.sendKeys(ConfigReader.getProperty("kayitliSifre"),Keys.ENTER);
    }
    @When("kullanici kayitli hesap ile sayfaya giris yaptigini dogrular")
    public void kullaniciKayitliHesapIleSayfayaGirisYaptiginiDogrular() {
        assert allPages.homePage().hesabimGokselCelikHome.isDisplayed();
    }
    @When("kullanici ePosta veya telefon alanina invalid email {string} girer")
    public void kullaniciEPostaVeyaTelefonAlaninaInvalidEmailGirer(String invalid_email) {
        allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(invalid_email);
    }

    @And("kullanici dropdown menu basliklariini goruntuler")
    public void kullaniciDropdownMenuBasliklariiniGoruntuler() {
        actions.moveToElement(allPages.homePage().giris_yapHome).perform();
        assert allPages.homePage().girisYapLinkGiris_yapHome.isDisplayed();
    }

    @And("kullanici siparislerim secenegine tiklar")
    public void kullaniciSiparislerimSecenegineTiklar() {
        clickByJS(allPages.homePage().siparislerimLinkGirisYapDropdownHome);
    }

    @And("kullanici giris yap alanina yonlendirildigini dogrular")
    public void kullaniciGirisYapAlaninaYonlendirildiginiDogrular() {
        assert allPages.girisPage().epostaAdresiVeyaTelNoTextBoxGiris.isDisplayed();
    }

    @And("kullanici uye olmadan verdiginiz siparisleri buradan takip edebilirsiniz uyarisini goruntuler")
    public void kullaniciUyeOlmadanVerdiginizSiparisleriBuradanTakipEdebilirsinizUyarisiniGoruntuler() {

    }

    @And("kullanici giris islemi yapmadan siparis takibi basligina tiklar")
    public void kullaniciGirisIslemiYapmadanSiparisTakibiBasliginaTiklar() {
        clickByJS(allPages.girisPage().siparisTakibiButonGirisYapGiris);
    }

    @And("kullanici siparis icin girdigi eposta adresini girer")
    public void kullaniciSiparisIcinGirdigiEpostaAdresiniGirer() {
        allPages.girisPage().epostaAdresiTextBoxSiparisTakibiButonGirisYapGiris.sendKeys(ConfigReader.getProperty("kayitliEmail"));
    }

    @And("kullanici EPosta adresinizi dogrulayin basligi goruntuler")
    public void kullaniciEPostaAdresiniziDogrulayinBasligiGoruntuler() {
    }

    @And("kullanici EPosta adresinize gonderilen dogrulama baglantisina tiklayarak siparis takibi yapabilirsiniz uyarisini dogrular")
    public void kullaniciEPostaAdresinizeGonderilenDogrulamaBaglantisinaTiklayarakSiparisTakibiYapabilirsinizUyarisiniDogrular() {
    }
}
