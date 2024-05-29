package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.GirisPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;

public class TC03_GirisYapStepDefs {
    HomePage homePage=new HomePage();
    GirisPage girisPage=new GirisPage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici girisYapLinkGiris_yapHome linkini tiklar")
    public void kullaniciGirisYapLinkGiris_yapHomeLinkiniTiklar() {
        clickByJS(homePage.girisYapLinkGiris_yapHome);
    }
    @Given("kullanici girisYapButonOnaylamaGiris e tiklar")
    public void kullaniciGirisYapButonOnaylamaGirisETiklar() {
        clickByJS(girisPage.girisYapButonOnaylamaGiris);
    }
    @When("kullanici ePosta veya telefon alanina kayitli email girer ve enter a tiklar")
    public void kullaniciEPostaVeyaTelefonAlaninaKayitliEmailGirerVeEnterATiklar() {
        girisPage.epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(ConfigReader.getProperty("kayitliEmail"), Keys.ENTER);
    }
    @And("kullanici sifre alanina kayitli sifresini girer ve enter a tiklar")
    public void kullaniciSifreAlaninaKayitliSifresiniGirerVeEnterATiklar() {
        girisPage.sifreAlaniTextBoxGirisYapGiris.sendKeys(ConfigReader.getProperty("kayitliSifre"),Keys.ENTER);
    }
    @When("kullanici kayitli hesap ile sayfaya giris yaptigini dogrular")
    public void kullaniciKayitliHesapIleSayfayaGirisYaptiginiDogrular() {
        assert homePage.hesabimGokselCelikHome.isDisplayed();
    }

    @When("kullanici ePosta veya telefon alanina invalid email {string} girer")
    public void kullaniciEPostaVeyaTelefonAlaninaInvalidEmailGirer(String string) {
        girisPage.epostaAdresiVeyaTelNoTextBoxGiris.sendKeys(string);
    }
}
