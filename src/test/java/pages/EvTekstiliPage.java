package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EvTekstiliPage {
    public EvTekstiliPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='gQjF21piuOrwYvanqai8']")
    public WebElement evTekstiliUrunleriTextEvTekstili;

    @FindBy(xpath = "//*[@href='/halilar-c-9022246']")
    public WebElement haliLinkKategoriEvTekstili;

}
