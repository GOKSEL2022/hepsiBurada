package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AraPage {
    public AraPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[text()='Kategori']")
    public WebElement kategoriTextAra;

    @FindBy(xpath = "//*[text()=' ile ilgili sonuç bulunamamıştır']")
    public WebElement sembolIleIlgiliSonucBulunamamistirTextAra;

    @FindBy(xpath = "(//*[text()='iphone 11'])[2]")
    public WebElement iphone11IleIlgiliUrunBuldukTextAra;

    @FindBy(xpath = "(//*[@data-test-id='carousel-grid-item'])[1]")
    public WebElement iphone11IlkUrunAra;

    @FindBy(xpath = "//*[.='iPhone 11 128 GB']")
    public WebElement iphone11IlkUrunGbBilgisiAra;

    @FindBy(xpath = "(//*[@data-test-id='price-current-price'])[1]")
    public WebElement iphone11IlkUrunFiyatBilgisiAra;
}
