package stepdefinitions;

import com.github.javafaker.Faker;
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
    int number = Faker.instance().number().numberBetween(1000, 9999);
    String mail="@gmail.com";
    int phoneNo1 = Faker.instance().number().numberBetween(10, 99);
    int phoneNo2 = Faker.instance().number().numberBetween(541, 549);

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
        girisPage.epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(0+""+phoneNo2+""+phoneNo2+""+number);
    }
    @When("kullanici son birkac adim kaldi uyarisini goruntuler")
    public void kullaniciSonBirkacAdimKaldiUyarisiniGoruntuler() {
    }

}
