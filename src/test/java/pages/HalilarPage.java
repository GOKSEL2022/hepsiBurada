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

    @FindBy(xpath = "(//*[@value='Krem'])[1]")
    public WebElement kremRenk1KategoriHalilar;

    @FindBy(xpath = "(//*[@value='Krem'])[2]")
    public WebElement kremRenk2KategoriHalilar;





}
