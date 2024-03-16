package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CoolHaliPage {
    public CoolHaliPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='product-name']")
    public WebElement coolHaliSecilenUrunCoolHali;

    @FindBy(xpath = "//*[@class='col lg-4 visible']")
    public WebElement urunOzellikleriCoolHalilar;

    @FindBy(xpath = "(//*[.='Tüm Özellikler'])[1]")
    public WebElement tumOzelliklerLinkCoolHalilar;
}
