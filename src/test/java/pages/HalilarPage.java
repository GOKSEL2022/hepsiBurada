package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HalilarPage {
    public HalilarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@value='merinos']")
    public WebElement merinosCheckboxMarkaHalilar;

    @FindBy(xpath = "(//*[.='Fiyat Aralığı'])[1]")
    public WebElement fiyatAraligiTextHalilar;

    @FindBy(xpath = "//input[@placeholder='En az']")
    public WebElement enAzFiyatAraligiTextBoxHalilar;

    @FindBy(xpath = "//input[@placeholder='En çok']")
    public WebElement enCokFiyatAraligiTextBoxHalilar;

    @FindBy(xpath = "(//*[@viewBox='0 0 20 20'])[2]")
    public WebElement searchButtonFiyatAraligiHalilar;

    @FindBy(xpath = "//*[@value='1000-5000']")
    public WebElement binBesBinCheckboxHalilar;

    @FindBy(xpath = "//*[@value='4-max']")
    public WebElement dortYildizVeUzeriPuanHalilar;

    @FindBy(xpath = "(//*[@aria-checked='false'])[1]")
    public WebElement kuponluUrunlerCheckboxHalilar;

    @FindBy(xpath = "//*[@value='100€20x€20300€20cm']")
    public WebElement yuzUcYuzCmEbatHalilar;

    @FindBy(xpath = "(//*[@name='havyuksekligi'])[1]")
    public WebElement onMmHavYuksekligiKategoriHalilar;

    @FindBy(xpath = "//*[@value='Akrilik']")
    public WebElement akrilikIplikTuruKategoriHalilar;

    @FindBy(xpath = "//*[@value='Dokuma€20Taban']")
    public WebElement dokumaTabanKategoriHalilar;

    @FindBy(xpath = "//*[@value='Modern']")
    public WebElement modernTemaKategoriHalilar;

    @FindBy(xpath = "(//*[@value='Krem'])[1]")
    public WebElement kremRenk1KategoriHalilar;

    @FindBy(xpath = "(//*[.='Krem'])[6]")
    public WebElement kremRenk2KategoriHalilar;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement hepsiBuradaLimitiCheckboxKategoriHalilar;

    @FindBy(xpath = "(//*[@type='button'])[3]")
    public WebElement fotografliDegerlendirmeCheckboxKategoriHalilar;

    @FindBy(xpath = "(//*[@type='button'])[4]")
    public WebElement guncelDegerlendirmeCheckboxKategoriHalilar;
    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement girisimciKadinUrunleriCheckboxKategoriHalilar;

    @FindBy(xpath = "(//*[@type='button'])[6]")
    public WebElement yurtDisindanUrunlerCheckboxKategoriHalilar;

    @FindBy(xpath = "(//*[@type='button'])[7]")
    public WebElement indirimliUrunlerCheckboxKategoriHalilar;

    @FindBy(xpath = "(//*[@type='button'])[8]")
    public WebElement guvenleKapindaCheckboxKategoriHalilar;

    @FindBy(xpath = "(//*[@type='button'])[9]")
    public WebElement sepetteKampanyaliUrunlerCheckboxKategoriHalilar;

    @FindBy(xpath = "//*[.='Cool Halı']")
    public WebElement filtrelenenIlkUrunHalilar;

    @FindBy(xpath = "//*[@id='productDescription']")
    public  WebElement urunAciklamasiTextTitleHalilar;

    @FindBy(xpath = "//*[@id='productTechSpecContainer']")
    public  WebElement urunOzellikleriAltBasliklarHalilar;









}
