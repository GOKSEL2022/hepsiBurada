package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UrunPage {
    public UrunPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@title='Arttır']")
    public WebElement arttirIsaretiUrun;

    @FindBy(xpath = "//*[@title='Azalt']")
    public WebElement azaltIsaretiUrun;

    @FindBy(xpath = "//*[@class='button big with-icon']")
    public WebElement sepeteEkleButonUrun;

    @FindBy(xpath = "(//*[.='Beğen'])[1]")
    public WebElement linkBegenUrun;

    @FindBy(xpath = "//div[@class='col lg-4 visible']")
    public WebElement urunOzellikleriUrun;

    @FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement cerezleriKabulEtAlertUrun;

    @FindBy(xpath = "//span[@class='checkoutui-ProductOnBasketHeader-nOvp_U8bHbLzgKbSUFaz']")
    public WebElement urunSepetinizdeAlertUrun;

    @FindBy(xpath = "//*[.='Sepete git']")
    public WebElement sepeteGitUrun;

    @FindBy(css = "//*[@buybox='true']")
    public WebElement saticiyaSorLinkShadowRoot1Urun;

    @FindBy(css = "//button[class='buybox']")
    public WebElement saticiyaSorLinkShadowRoot2Urun;

    @FindBy(css = "(//*[@class='voltran-fragment'])[4]")
    public WebElement saticiyaSorLinkUrun;






}
