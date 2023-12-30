package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.AraPage;
import pages.BilgisayarlarPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.clickWithTimeOut;
import static utilities.ReusableMethods.scrollIntoViewJS;

public class TC05_AnasayfadakiLinklerinTestiStepDefs {
    AraPage araPage=new AraPage(); HomePage homePage=new HomePage();
    BilgisayarlarPage bilgisayarlarPage=new BilgisayarlarPage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir")
    public void kullaniciAramaAlanininAltindaElektronikSekmesininUzerineGelir() {
        actions.moveToElement(homePage.elektronikLinkiHome).perform();
    }

    @And("kullanici bilgisayar_tablet secenegine tiklar")
    public void kullaniciBilgisayar_tabletSecenegineTiklar() {
        clickWithTimeOut(homePage.bilgisayarTabletSecenegiElektronikLinkHome,2);
    }

    @And("kullanici acilan sayfanin bilgisayar urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninBilgisayarUrunleriIcerdiginiDogrular() {
        scrollIntoViewJS(bilgisayarlarPage.bilgisayarFiyatlariVeModelleriTextBilgisayarlar);
        assert bilgisayarlarPage.bilgisayarFiyatlariVeModelleriTextBilgisayarlar.isDisplayed();
    }
}
