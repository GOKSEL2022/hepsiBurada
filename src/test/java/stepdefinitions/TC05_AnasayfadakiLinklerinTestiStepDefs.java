package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AraPage;
import pages.BilgisayarlarPage;
import pages.HomePage;
import utilities.Driver;
import java.util.List;
import java.util.Random;
import static utilities.ReusableMethods.*;

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
    @And("kullanici konum sec linke tiklar")
    public void kullaniciKonumSecLinkeTiklar() {
        clickWithTimeOut(homePage.konumLinkHome,2);
    }
    @And("kullanici bir il secer")
    public void kullaniciBirIlSecer() {
        clickWithTimeOut(homePage.ilSecKonumLinkHome,2);
        clickByJS(homePage.istanbulIlSec);
    }
    @And("kullanici bir ilce secer")
    public void kullaniciBirIlceSecer() {
        clickWithTimeOut(homePage.ilceSecKonumLinkHome,2);
        clickByJS(homePage.adalarIlceSec);
        }
    @And("kullanici bir mahalle secer")
    public void kullaniciBirMahalleSecer() {
        clickByJS(homePage.mahalleSecKonumLinkHome);
        clickByJS(homePage.burgazadaMahalleSec);
        }
    @And("kullanici kaydet butonuna tiklar")
    public void kullaniciKaydetButonunaTiklar() {
        clickWithTimeOut(homePage.kaydetButonKonumSecHome,2);
    }
    @When("kullanici konum degistirildi alerti goruntuler")
    public void kullaniciKonumDegistirildiAlertiGoruntuler() {
        assert homePage.konumDegistirildiAlertHome.isDisplayed();
    }
    }

