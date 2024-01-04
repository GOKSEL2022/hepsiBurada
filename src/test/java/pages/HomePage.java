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





}
