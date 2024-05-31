package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class TC05_AnasayfadakiLinklerinTestiStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir")
    public void kullaniciAramaAlanininAltindaElektronikSekmesininUzerineGelir() {
        actions.moveToElement(allPages.homePage().elektronikLinkiHome).perform();
    }
    @And("kullanici bilgisayar_tablet secenegine tiklar")
    public void kullaniciBilgisayar_tabletSecenegineTiklar() {
        clickWithTimeOut(allPages.homePage().bilgisayarTabletSecenegiElektronikLinkHome,2);
    }
    @And("kullanici acilan sayfanin bilgisayar urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninBilgisayarUrunleriIcerdiginiDogrular() {
        scrollIntoViewJS(allPages.bilgisayarlarPage().bilgisayarFiyatlariVeModelleriTextBilgisayarlar);
        assert allPages.bilgisayarlarPage().bilgisayarFiyatlariVeModelleriTextBilgisayarlar.isDisplayed();
    }
    @And("kullanici konum sec linke tiklar")
    public void kullaniciKonumSecLinkeTiklar() {
        clickWithTimeOut(allPages.homePage().konumLinkHome,2);
    }
    @And("kullanici bir il secer")
    public void kullaniciBirIlSecer() {
        clickWithTimeOut(allPages.homePage().ilSecKonumLinkHome,2);
        clickByJS(allPages.homePage().istanbulIlSec);
    }
    @And("kullanici bir ilce secer")
    public void kullaniciBirIlceSecer() {
        clickWithTimeOut(allPages.homePage().ilceSecKonumLinkHome,2);
        clickByJS(allPages.homePage().adalarIlceSec);
        }
    @And("kullanici bir mahalle secer")
    public void kullaniciBirMahalleSecer() {
        clickByJS(allPages.homePage().mahalleSecKonumLinkHome);
        clickByJS(allPages.homePage().burgazadaMahalleSec);
        }
    @And("kullanici kaydet butonuna tiklar")
    public void kullaniciKaydetButonunaTiklar() {
        clickWithTimeOut(allPages.homePage().kaydetButonKonumSecHome,2);
    }
    @When("kullanici konum degistirildi alerti goruntuler")
    public void kullaniciKonumDegistirildiAlertiGoruntuler() {
        assert allPages.homePage().konumDegistirildiAlertHome.isDisplayed();
    }
    @And("kullanici yazicilar_projeksiyon secenegine tiklar")
    public void kullaniciYazicilar_projeksiyonSecenegineTiklar() {
        clickByJS(allPages.homePage().yazicilarProjeksiyonSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin yazici model ve fiyatlari icerdigini dogrular")
    public void kullaniciAcilanSayfaninYaziciModelVeFiyatlariIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yazicilar");
    }
    @And("kullanici telefon_telefon aksesuarlari secenegine tiklar")
    public void kullaniciTelefon_telefonAksesuarlariSecenegineTiklar() {
        clickByJS(allPages.homePage().telefonTelefonAksesuarlariSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin telefon ile ilgili oldugunu dogrular")
    public void kullaniciAcilanSayfaninTelefonIleIlgiliOldugunuDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("telefonlar");
    }
    @And("kullanici tv_goruntu ve ses secenegini tiklar")
    public void kullaniciTv_goruntuVeSesSeceneginiTiklar() {
        clickByJS(allPages.homePage().tvGoruntuSesSistemleriSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin ses ve goruntu urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninSesVeGoruntuUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("ses-goruntu-sistemleri");
    }
    @And("kullanici beyaz esya secenegini tiklar")
    public void kullaniciBeyazEsyaSeceneginiTiklar() {
        clickByJS(allPages.homePage().beyazEsyaSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin beyaz esya urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninBeyazEsyaUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("beyaz-esya");
    }
    @And("kullanici klima ve isiticilar secenegini tiklar")
    public void kullaniciKlimaVeIsiticilarSeceneginiTiklar() {
        clickByJS(allPages.homePage().klimaVeIsiticilarSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin isitme_sogutma urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninIsitme_sogutmaUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("isitma-sogutma-urunleri");
    }
    @And("kullanici elektrikli ev aletleri secenegini tiklar")
    public void kullaniciElektrikliEvAletleriSeceneginiTiklar() {
        clickByJS(allPages.homePage().elektrikliEvAletleriSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin elektrikli ev aletleri urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninElektrikliEvAletleriUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("elektrikli-ev-aletleri");
    }
    @And("kullanici foto_kamera secenegini tiklar")
    public void kullaniciFoto_kameraSeceneginiTiklar() {
        clickByJS(allPages.homePage().fotoKameraSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin foto_kamera urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninFoto_kameraUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("foto-kameralari");
    }
    @And("kullanici oyun_oyun konsollari secenegini tiklar")
    public void kullaniciOyun_oyunKonsollariSeceneginiTiklar() {
        clickByJS(allPages.homePage().oyunOyunKonsollariSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin oyun_oyun konsollari icerdigini dogrular")
    public void kullaniciAcilanSayfaninOyun_oyunKonsollariIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("oyunlar-oyun-konsollari");
    }
    @Given("kullanici moda linke gelir")
    public void kullaniciModaLinkeGelir() throws InterruptedException {
        actions.moveToElement(allPages.homePage().modaLinkiHome).perform();
    }
    @And("kullanici kadin basligina tiklar")
    public void kullaniciKadinBasliginaTiklar() {
        clickWithTimeOut(allPages.homePage().kadinSecenegiModaLinkiHome,2);
    }
    @And("kullanici acilan sayfanin kadin urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninKadinUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("bayan-giyim-modelleri");
    }
    @And("kullanici moda anasayfa basligina tiklar")
    public void kullaniciModaAnasayfaBasliginaTiklar() {
        clickWithTimeOut(allPages.homePage().modaAnasaydaSecenegiModaLinkiHome,2);
    }
    @And("kullanici acilan sayfanin moda ile ilgili oldugunu dogrular")
    public void kullaniciAcilanSayfaninModaIleIlgiliOldugunuDogrular() {
        assert allPages.giyimAyakkabiPage().modaAksesuarTitleGiyimAyakkabi.isDisplayed();
    }
    @And("kullanici erkek basligina tiklar")
    public void kullaniciErkekBasliginaTiklar() {
        clickByJS(allPages.homePage().erkekSecenegiModaLinkiHome);
    }
    @And("kullanici acilan sayfanin erkek urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninErkekUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("erkek-giyim-modelleri");
    }
    @And("kullanici ayakkabi_canta basligina tiklar")
    public void kullaniciAyakkabi_cantaBasliginaTiklar() {
        clickByJS(allPages.homePage().ayakkabiCantaSecenegiModaLinkiHome);
    }
    @And("kullanici acilan sayfanin ayakkabi_canta urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninAyakkabi_cantaUrunleriIcerdiginiDogrular() {
        assert allPages.staticPage().ayakkabiCantaImageStatic.isDisplayed();
    }
    @And("kullanici kadin_aksesuar_taki basligina tiklar")
    public void kullaniciKadin_aksesuar_takiBasliginaTiklar() throws InterruptedException {
        scrollIntoViewJS(allPages.homePage().telefonTelefonAksesuarlariSecenegiElektronikHome);
        Thread.sleep(1000);
        clickByJS(allPages.homePage().telefonTelefonAksesuarlariSecenegiElektronikHome);
    }
    @And("kullanici acilan sayfanin kadin aksesuarlari icerdigini dogrular")
    public void kullaniciAcilanSayfaninKadinAksesuarlariIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("bayan-kol-saatleri");
    }
    @And("kullanici erkek_aksesuar_taki basligina tiklar")
    public void kullaniciErkek_aksesuar_takiBasliginaTiklar() throws InterruptedException {
        scrollIntoViewJS(allPages.homePage().erkekSecenegiModaLinkiHome);
        Thread.sleep(1000);
        clickByJS(allPages.homePage().erkekSecenegiModaLinkiHome);
    }
    @And("kullanici acilan sayfanin erkek aksesuarlari icerdigini dogrular")
    public void kullaniciAcilanSayfaninErkekAksesuarlariIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("erkek-kol-saatleri");
    }
    @And("kullanici altin basligina tiklar")
    public void kullaniciAltinBasliginaTiklar() {
        scrollIntoViewJS(allPages.homePage().altinSecenegiModaLinkHome);
        clickWithTimeOut(allPages.homePage().altinSecenegiModaLinkHome,2);
    }
    @And("kullanici acilan sayfanin altin urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninAltinUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kulce-ziynet-cumhuriyet-altinlari");
    }
    @And("kullanici cocuk basligina tiklar")
    public void kullaniciCocukBasliginaTiklar() {
        scrollIntoViewJS(allPages.homePage().cocukSecenegiModaLinkiHome);
        clickByJS(allPages.homePage().cocukSecenegiModaLinkiHome);
    }
    @And("kullanici acilan sayfanin cocuk urunleri icerdigini dogrular")
    public void kullaniciAcilanSayfaninCocukUrunleriIcerdiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("cocuk-giyim-kiyafetleri");
    }
    @And("kullanici outdoor giyim_ayakkabi basligina tiklar")
    public void kullaniciOutdoorGiyim_ayakkabiBasliginaTiklar() {
        scrollIntoViewJS(allPages.homePage().outdoorGiyimAyakkabiSecenegiModaLinkiHome);
        clickByJS(allPages.homePage().outdoorGiyimAyakkabiSecenegiModaLinkiHome);
    }
    @And("kullanici outdoor giyim_ayakkabi sayfasina yonlendirildigini dogrular")
    public void kullaniciOutdoorGiyim_ayakkabiSayfasinaYonlendirildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("outdoor-giyim-ayakkabilar");
    }
    @And("kullanici yurt disindan basligina tiklar")
    public void kullaniciYurtDisindanBasliginaTiklar() {
        scrollIntoViewJS(allPages.homePage().yurtdisindanSecenegiModaLinkiHome);
        clickByJS(allPages.homePage().yurtdisindanSecenegiModaLinkiHome);
    }
    @When("kullanici yurdisi urunleri sayfasina yonlendirildigini dogrular")
    public void kullaniciYurdisiUrunleriSayfasinaYonlendirildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yurt-disindan-urunler");
    }
    @And("kullanici hepsiBuradaTitle a tiklar")
    public void kullaniciHepsiBuradaTitleATiklar() {
        clickByJS(allPages.homePage().hepsiBuradaTitleHome);
    }
    @And("kullanici outdoor giyim_ayakkabi basligini goruntuler")
    public void kullaniciOutdoorGiyim_ayakkabiBasliginiGoruntuler() {
        scrollIntoViewJS(allPages.homePage().outdoorGiyimAyakkabiSecenegiModaLinkiHome);
    }
    @And("kullanici erkek basligini goruntuler")
    public void kullaniciErkekBasliginiGoruntuler() {
        scrollIntoViewJS(allPages.homePage().erkekSecenegiModaLinkiHome);
    }
}

