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
}
