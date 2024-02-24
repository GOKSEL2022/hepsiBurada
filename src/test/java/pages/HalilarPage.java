package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HalilarPage {
    public HalilarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@value='merinos']")
    public WebElement merinosCheckboxMarkaHalilar;

    @FindBy(xpath = "(//*[.='Fiyat Aralığı'])[1]")
    public WebElement fiyatAraligiTextHalilar;

    @FindBy(xpath = "(//*[@class='moria-Input-ekkfpy bcnTZc su64jddnmlf'])[1]")
    public WebElement enAzFiyatAraligiTextBoxHalilar;

    @FindBy(xpath = "(//*[@class='moria-Input-ekkfpy bcnTZc su64jddnmlf'])[2]")
    public WebElement enCokFiyatAraligiTextBoxHalilar;

}
