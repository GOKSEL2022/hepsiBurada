package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
}
