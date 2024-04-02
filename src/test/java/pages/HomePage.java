package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@data-test-id='account']")
    public WebElement giris_yapHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/uyelik/giris?ReturnUrl=https%3A%2F%2Fwww.hepsiburada.com%2F']")
    public WebElement girisYapLinkGiris_yapHome;

    @FindBy(xpath = "//a[@id='register']")
    public WebElement uyeOlLinkGiris_yapHome;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement hesabimGokselCelikHome;

    @FindBy(xpath = "//*[@class='searchBoxOld-M1esqHPyWSuRUjMCALPK']")
    public WebElement searchBoxHome;

    @FindBy(xpath = "//div[@id='react-autowhatever-1']")
    public WebElement aramayaBaslamakIcinEnAz2KarakterYazmalisinizTextHome;

    @FindBy(xpath = "(//*[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[1]")
    public WebElement elektronikLinkiHome;

    @FindBy(xpath = "(//a[@href='https://www.hepsiburada.com/bilgisayarlar-c-2147483646'])[2]")
    public WebElement bilgisayarTabletSecenegiElektronikLinkHome;

    @FindBy(xpath = "//*[@class='shipping-src-universal-partials-ShippingLocation-components-locationSelector-button-ShippingLocationSelectorButton__locationLabel']")
    public WebElement konumLinkHome;

    @FindBy(xpath = "(//*[@data-test-id='select-dropdown'])[1]")
    public WebElement ilSecKonumLinkHome;

    @FindBy(xpath = "(//*[.='İSTANBUL'])[2]")
    public WebElement istanbulIlSec;

    @FindBy(xpath = "(//*[@class='shipping-src-universal-partials-ShippingLocation-components-form-content-AddressSelector-style__label'])[2]")
    public WebElement ilceSecKonumLinkHome;

    @FindBy(xpath = "(//*[text()='ADALAR'])[2]")
    public WebElement adalarIlceSec;

    @FindBy(xpath = "//*[text()='Mahalle seçin']")
    public WebElement mahalleSecKonumLinkHome;

    @FindBy(xpath = "(//*[@data-test-id='option-item'])[1]")
    public WebElement burgazadaMahalleSec;

    @FindBy(xpath = "//*[@kind='primary']")
    public WebElement kaydetButonKonumSecHome;

    @FindBy(xpath = "//*[@class='hb-toast-text']")
    public WebElement konumDegistirildiAlertHome;

    @FindBy(xpath = "//*[@data-test-id='option-item']")
    public List<WebElement> tumAdalarMahalleSec;

    @FindBy(xpath = "//*[.='Yazıcılar & Projeksiyon']")
    public WebElement yazicilarProjeksiyonSecenegiElektronikHome;

    @FindBy(xpath = "//*[.='Telefon & Telefon Aksesuarları']")
    public WebElement telefonTelefonAksesuarlariSecenegiElektronikHome;

    @FindBy(xpath = "//*[.='TV, Görüntü & Ses Sistemleri']")
    public WebElement tvGoruntuSesSistemleriSecenegiElektronikHome;

    @FindBy(xpath = "//a[text()='Beyaz Eşya']")
    public WebElement beyazEsyaSecenegiElektronikHome;

    @FindBy(xpath = "//a[text()='Klima ve Isıtıcılar']")
    public WebElement klimaVeIsiticilarSecenegiElektronikHome;

    @FindBy(xpath = "//a[text()='Elektrikli Ev Aletleri']")
    public WebElement elektrikliEvAletleriSecenegiElektronikHome;

    @FindBy(xpath = "//a[text()='Foto & Kamera']")
    public WebElement fotoKameraSecenegiElektronikHome;

    @FindBy(xpath = "//a[text()='Oyun & Oyun Konsolları']")
    public WebElement oyunOyunKonsollariSecenegiElektronikHome;

    @FindBy(xpath = "(//*[.='Moda'])[1]")
    public WebElement modaLinkiHome;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1796']")
    public WebElement kadinSecenegiModaLinkiHome;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-2790']")
    public WebElement modaAnasaydaSecenegiModaLinkiHome;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1801']")
    public WebElement erkekSecenegiModaLinkiHome;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-3623']")
    public WebElement ayakkabiCantaSecenegiModaLinkiHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/kulce-ziynet-cumhuriyet-altinlari-c-530175']")
    public WebElement altinSecenegiModaLinkHome;

    @FindBy(xpath = "//*[@title='Hepsiburada']")
    public WebElement hepsiBuradaTitleHome;

    @FindBy(css = "a[class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-995']")
    public WebElement cocukSecenegiModaLinkiHome;

    @FindBy(css = "a[class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-3404']")
    public WebElement yurtdisindanSecenegiModaLinkiHome;

    @FindBy(css = "a[class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1307']")
    public WebElement outdoorGiyimAyakkabiSecenegiModaLinkiHome;

    @FindBy(css = "a[class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1283']")
    public WebElement kadinAksesuarTakiSecenegiModaLinkiHome;

    @FindBy(xpath = "(//*[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[3]")
    public WebElement evYasamKirtasiyeOfisLinkiHome;

    @FindBy(xpath = "//*[.='Ofis Mobilyaları']")
    public WebElement ofisMobilyalariSecenegiEvYasamKirtasiyeOfisLinkiHome;

    @FindBy(xpath= "//*[.='Ev Tekstili']")
    public WebElement evTekstiliSecenegiEvYasamKirtasiyeOfisLinkiHome;

    @FindBy(xpath = "(//*[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[4]")
    public WebElement otoBahceYapiMarketLinkiHome;

    @FindBy(xpath = "(//*[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[4]")
    public WebElement bahceSecenegiotoBahceYapiMarketLinkiHome;

    @FindBy(xpath = "(//*[@href='https://www.hepsiburada.com/banyolar-c-455418'])[2]")
    public WebElement banyoMutfakSecenegiotoBahceYapiMarketLinkiHome;

    @FindBy(xpath = "(//*[.='Anne, Bebek, Oyuncak'])[2]")
    public WebElement anneBebekOyuncakLinkiHome;

    @FindBy(xpath = "//*[.='Bebek Odası & Güvenlik']")
    public WebElement bebekOdasiGuvenlikSecenegiAnneBebekOyuncakLinkiHome;

    @FindBy(xpath = "//*[.='Bebek Bezi & Islak Mendil']")
    public WebElement bebekBeziIslakMendilSecenegiAnneBebekOyuncakLinkiHome;

    @FindBy(xpath = "(//*[.='Spor, Outdoor'])[1]")
    public WebElement sporOutdoorLinkiHome;

    @FindBy(xpath = "//*[.='Bisiklet']")
    public WebElement bisikletSecenegiSporOutdoorLinkiHome;

    @FindBy(xpath = "(//*[@href='https://www.hepsiburada.com/fitness-kondisyon-urunleri-c-353045'])[1]")
    public WebElement fitnessKondisyonUrunleriSecenegiSporOutdoorLinkiHome;

    @FindBy(xpath = "(//*[.='Kozmetik, Kişisel Bakım'])[1]")
    public WebElement kozmetikKisiselBakimLinkiHome;

    @FindBy(xpath = "(//*[@href='https://www.hepsiburada.com/erkek-tiras-urunleri-c-26012116'])[1]")
    public WebElement tirasUrunleriKozmetikKisiselBakimLinkiHome;

    @FindBy(xpath = "(//*[@href='https://www.hepsiburada.com/cilt-bakim-urunleri-c-32000005'])[1]")
    public WebElement ciltBakimiKozmetikKisiselBakimLinkiHome;

    @FindBy(xpath = "(//*[.='Süpermarket, Pet Shop'])[1]")
    public WebElement supermarketPetshopLinkHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/mutfak-sarf-malzemeleri-c-60001205']")
    public WebElement evTuketimMalzemeleriSupermarketPetshopLinkHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/gida-urunleri-c-28001469']")
    public WebElement gidaUrunleriSupermarketPetshopLinkHome;

    @FindBy(xpath = "(//*[.='Kitap, Müzik, Film, Hobi'])[2]")
    public WebElement kitapMuzikFilmHobiLinkHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/hobi-eglence-urunleri-c-2147483605']")
    public WebElement hobiOyunKSecenegiitapMuzikFilmHobiLinkHome;

    @FindBy(xpath = "(//*[@href='https://www.hepsiburada.com/filmler-c-2147483640'])[1]")
    public WebElement filmSecenegiitapMuzikFilmHobiLinkHome;

    @FindBy(xpath = "(//*[@class='sf-Recommendation-ZmmUxNsGCewXhMdEXHFw'])[1]")
    public WebElement premiumFirsatlarTextHome;

    @FindBy(xpath = "(//*[@data-test-id='product-image-image'])[1]")
    public WebElement premiumFirsatlarIlkUrunHome;

    @FindBy(xpath = "//*[@data-test-id='product-info-button']")
    public WebElement sepeteEkleButonPremiumFirsatlarIlkUrunHome;

    @FindBy(xpath = "//*[@class='hb-toast-message']")
    public WebElement urunSepeteEklendiAlertHome;

    @FindBy(xpath = "//*[@href='https://checkout.hepsiburada.com']")
    public WebElement sepeteGitLinkUrunSepeteEklendiAlertHome;

    @FindBy(xpath = "//*[.='Ev Tekstili']")
    public WebElement evTekstiliSecenegiEvYasamKirtasiyeOfisLinkHome;

    @FindBy(xpath = "//*[.='Kategoriler']")
    public WebElement kategorilerTextAnasayfaAltiHome;

    @FindBy(xpath = "//a[@href='https://www.hepsiburada.com/bilgisayarlar-c-2147483646']")
    public WebElement bilgisayarLinkKategorilerTextAnasayfaAltiHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/tablet-c-3008012']")
    public WebElement tabletLinkKategorilerTextAnasayfaAltiHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/telefonlar-c-2147483642']")
    public WebElement telefonlarLinkKategorilerTextAnasayfaAltiHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/laptop-notebook-dizustu-bilgisayarlar-c-98']")
    public WebElement laptopLinkKategorilerTextAnasayfaAltiHome;

    @FindBy(css = "a[href='https://www.hepsiburada.com/kombiler-c-17723'")
    public WebElement kombiLinkKategorilerHome;

    @FindBy(css = "a[href='https://www.hepsiburada.com/klimalar-c-17453'")
    public WebElement klimaLinkKategorilerHome;

    @FindBy(css = "a[href='https://www.hepsiburada.com/camasir-makineleri-c-155121'")
    public WebElement camasirMakinesiLinkKategorilerHome;

    @FindBy(css = "a[href='https://www.hepsiburada.com/bulasik-makineleri-c-22156'")
    public WebElement bulasikMakinesiLinkKategorilerHome;












}
