package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    @FindBy(xpath = "//*[@id='SearchBoxOld_a3ac64c2-4f9e-481f-1045-9bc3cb7968eb']")
    public WebElement aramayaBaslamakIcinEnAz2KarakterYazmalisinizTextHome;




}
