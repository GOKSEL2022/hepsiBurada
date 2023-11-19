package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.GirisPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC03_GirisYapStepDefs {
    HomePage homePage=new HomePage();
    GirisPage girisPage=new GirisPage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici girisYapLinkGiris_yapHome linkini tiklar")
    public void kullaniciGirisYapLinkGiris_yapHomeLinkiniTiklar() {
        ReusableMethods.clickByJS(homePage.girisYapLinkGiris_yapHome);
    }

    @Given("kullanici girisYapButonOnaylamaGiris e tiklar")
    public void kullaniciGirisYapButonOnaylamaGirisETiklar() {
        ReusableMethods.clickByJS(girisPage.girisYapButonOnaylamaGiris);
    }

    @When("kullanici ePosta veya telefon alanina kayitli email girer")
    public void kullaniciEPostaVeyaTelefonAlaninaKayitliEmailGirer() {
    }

    @And("kullanici giris Yap butona tiklar")
    public void kullaniciGirisYapButonaTiklar() {
    }

    @And("kullanici sifre alanina kayitli sifresini girer")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer() {
    }

    @When("kullanici kayitli hesap ile sayfaya giris yaptigini dogrular")
    public void kullaniciKayitliHesapIleSayfayaGirisYaptiginiDogrular() {
    }
}
