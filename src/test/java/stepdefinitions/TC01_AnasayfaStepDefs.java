package stepdefinitions;
import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;
public class TC01_AnasayfaStepDefs {
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici anasayfanin acildigini dogrular")
    public void kullaniciAnasayfaninAcildiginiDogrular() {
        //assert Driver.getDriver().getCurrentUrl().contains("hepsiburada");
        assert Driver.getDriver().getTitle().contains("Hepsiburada");
        //assert Driver.getDriver().getTitle().equalsIgnoreCase("Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com");
        //System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }
    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
