package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.AraPage;
import pages.HomePage;
import utilities.Driver;

public class TC05_AnasayfadakiLinklerinTestiStepDefs {
    AraPage araPage=new AraPage(); HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir")
    public void kullaniciAramaAlanininAltindaElektronikSekmesininUzerineGelir() {
        actions.moveToElement(homePage.elektronikLinkiHome).perform();
    }

    @And("kullanici bilgisayar_tablet secenegine tiklar")
    public void kullaniciBilgisayar_tabletSecenegineTiklar() {
    }

    @And("kullanici acilan sayfanin bilgisayar urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninBilgisayarUrunleriIcerdiginiDogrular() {
    }
}
