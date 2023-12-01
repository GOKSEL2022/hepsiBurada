package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;

public class TC04_sayfadaAramaTestiStepDefs {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    char harf='a';
    byte rakam=1;
    char sembol='*';
    @And("kullanici arama alanina tiklar")
    public void kullaniciAramaAlaninaTiklar() throws InterruptedException {
        homePage.searchBoxHome.click();
        Thread.sleep(2000);
    }

    @And("kullanici arama alanina en az iki karakter girmesi gerektigini gorur")
    public void kullaniciAramaAlaninaEnAzIkiKarakterGirmesiGerektiginiGorur() {
        assert homePage.aramayaBaslamakIcinEnAz2KarakterYazmalisinizTextHome.getText().contains("en az 2 karakter girmelisiniz");
    }

    @And("kullanici arama alanina bir adet harf  girer")
    public void kullaniciAramaAlaninaBirAdetHarfGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(""+harf).perform();

    }

    @And("kullanici arama alanina bir adet rakam  girer")
    public void kullaniciAramaAlaninaBirAdetRakamGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(""+rakam).perform();
    }

    @And("kullanici arama alanina bir adet sembol  girer")
    public void kullaniciAramaAlaninaBirAdetSembolGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(""+sembol).perform();
    }
}
