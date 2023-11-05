package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GirisPage {
    public GirisPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='Giriş yap'])[1]")
    public WebElement girisYapButonUyeOlYaniGiris;

    @FindBy(xpath = "(//*[text()='Giriş yap'])[2]")
    public WebElement girisYapButonOnaylamaGiris;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement epostaAdresiVeyaTelNoTextBoxGiris;


    @FindBy(xpath = "//*[.='Son birkaç adım kaldı…']")
    public WebElement telNoGirisAlertSonBirkacAdimKaldiGiris;

    @FindBy(xpath = "//*[@id='btnSignUpSubmit']")
    public WebElement devamEtButonGiris;

    @FindBy(xpath = "(//*[.='Doğrulama maili gönderildi'])[1]")
    public WebElement dogrulamaMailiGonderildiAlertGiris;

    @FindBy(xpath = "(//*[.='Üye ol'])[1]")
    public WebElement uyeOlKayitButonGiris;


    @FindBy(xpath = "//*[.='Son birkaç adım kaldı…']")
    public WebElement sonBirkacAdimKaldiAlertGiris;

    @FindBy(xpath = "//*[text()='Beklenmeyen bir hata oluştu.']")
    public WebElement beklenmeyenBirHataOlustuAlertGiris;


    @FindBy(xpath = "//*[@id='btnGoogle']")
    public WebElement googleIleGirisYapButonGiris;


    @FindBy(xpath = "//*[@id='btnApple']")
    public WebElement appleIleGirisYapButonGiris;


    @FindBy(xpath = "//*[@id='btnFacebook']")
    public WebElement facebookIleGirisYapButonGiris;

    @FindBy(xpath = "//*[@data-test-id='back-button']")
    public WebElement geriYonTusuSonBirkacAdimKaldiSayfasi;






}
