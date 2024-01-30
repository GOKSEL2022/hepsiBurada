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

    @FindBy(xpath = "(//*[.='Yurt Dışından'])[3]")
    public WebElement yurtDisindanSecenegiEvYasamKirtasiyeOfisLinkiHome;

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

    @FindBy(xpath = "(//*[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[6]")
    public WebElement sporOutdoorLinkiHome;

    @FindBy(xpath = "//*[@href='https://www.hepsiburada.com/outdoor-doga-sporlari-c-22007826']")
    public WebElement dogaSporlariSecenegiSporOutdoorLinkiHome;

    @FindBy(xpath = "(//*[@href='https://www.hepsiburada.com/fitness-kondisyon-urunleri-c-353045'])[1]")
    public WebElement fitnessKondisyonUrunleriSecenegiSporOutdoorLinkiHome;








}
