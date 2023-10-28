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
}
