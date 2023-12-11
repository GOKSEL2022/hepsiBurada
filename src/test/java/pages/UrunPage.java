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

    @FindBy(xpath = "//*[@id='addToCart']")
    public WebElement sepeteEkleButonUrun;


}
