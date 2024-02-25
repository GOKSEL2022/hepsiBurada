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

    @FindBy(xpath = "//input[@placeholder='En az']")
    public WebElement enAzFiyatAraligiTextBoxHalilar;

    @FindBy(xpath = "//input[@placeholder='En çok']")
    public WebElement enCokFiyatAraligiTextBoxHalilar;

    @FindBy(xpath = "(//*[@viewBox='0 0 20 20'])[2]")
    public WebElement searchButtonFiyatAraligiHalilar;

}
