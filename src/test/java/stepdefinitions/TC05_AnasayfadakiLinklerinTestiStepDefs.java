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

    @And("kullanici yazicilar_projeksiyon secenegine tiklar")
    public void kullaniciYazicilar_projeksiyonSecenegineTiklar() {
    }

    @And("kullanici acilan sayfanin yazici model ve fiyatlari icerdigini dogrular")
    public void kullaniciAcilanSayfaninYaziciModelVeFiyatlariIcerdiginiDogrular() {
    }

    @And("kullanici telefon_telefon aksesuarlari secenegine tiklar")
    public void kullaniciTelefon_telefonAksesuarlariSecenegineTiklar() {
    }

    @And("kullanici acilan sayfanin telefon ile ilgili oldugunu dogrular")
    public void kullaniciAcilanSayfaninTelefonIleIlgiliOldugunuDogrular() {
    }

    @And("kullanici tv_goruntu ve ses secenegini tiklar")
    public void kullaniciTv_goruntuVeSesSeceneginiTiklar() {
    }

    @And("kullanici acilan sayfanin ses ve goruntu urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninSesVeGoruntuUrunleriIcerdiginiDogrular() {
    }

    @And("kullanici beyaz esya secenegini tiklar")
    public void kullaniciBeyazEsyaSeceneginiTiklar() {
    }

    @And("kullanici acilan sayfanin beyaz esya urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninBeyazEsyaUrunleriIcerdiginiDogrular() {
    }

    @And("kullanici klima ve isiticilar secenegini tiklar")
    public void kullaniciKlimaVeIsiticilarSeceneginiTiklar() {
    }

    @And("kullanici acilan sayfanin isitme_sogutma urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninIsitme_sogutmaUrunleriIcerdiginiDogrular() {
    }

    @And("kullanici elektrikli ev aletleri secenegini tiklar")
    public void kullaniciElektrikliEvAletleriSeceneginiTiklar() {
    }

    @And("kullanici acilan sayfanin elektrikli ev aletleri urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninElektrikliEvAletleriUrunleriIcerdiginiDogrular() {
    }

    @And("kullanici foto_kamera secenegini tiklar")
    public void kullaniciFoto_kameraSeceneginiTiklar() {
    }

    @And("kullanici acilan sayfanin foto_kamera urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninFoto_kameraUrunleriIcerdiginiDogrular() {
    }

    @And("kullanici oyun_oyun konsollari secenegini tiklar")
    public void kullaniciOyun_oyunKonsollariSeceneginiTiklar() {
    }

    @And("kullanici acilan sayfanin oyun_oyun konsollari icerdigini dogrular")
    public void kullaniciAcilanSayfaninOyun_oyunKonsollariIcerdiginiDogrular() {
    }
}

