package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AraPage;
import pages.HomePage;
import utilities.Driver;
public class TC04_sayfadaAramaTestiStepDefs {
    HomePage homePage=new HomePage();
    AraPage araPage=new AraPage();
    Actions actions=new Actions(Driver.getDriver());
    char harf='a';   byte rakam=1;  char sembol='*';
    @And("kullanici arama alanina tiklar")
    public void kullaniciAramaAlaninaTiklar() throws InterruptedException {
        homePage.searchBoxHome.click();
        Thread.sleep(2000);
    }
    @And("kullanici arama alanina en az iki karakter girmesi gerektigini gorur")
    public void kullaniciAramaAlaninaEnAzIkiKarakterGirmesiGerektiginiGorur() {
        assert homePage.aramayaBaslamakIcinEnAz2KarakterYazmalisinizTextHome.getText().contains("en az 2 karakter");
        Driver.getDriver().navigate().refresh();
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
    @And("kullanici arama alanina bir bosluk girer")
    public void kullaniciAramaAlaninaBirBoslukGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(Keys.SPACE).perform();
    }
    @And("kullanici arama alanina iki adet bosluk girer")
    public void kullaniciAramaAlaninaIkiAdetBoslukGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(Keys.SPACE,Keys.SPACE).perform();
    }
    @And("kullanici arama alanina uc bosluk girer")
    public void kullaniciAramaAlaninaUcBoslukGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE).perform();
    }
    @And("kullanici arama alanina gecerli deger {string} girer")
    public void kullaniciAramaAlaninaGecerliDegerGirer(String string) {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici kategori basligini goruntuler")
    public void kullaniciKategoriBasliginiGoruntuler() {
        assert araPage.kategoriTextAra.isDisplayed();
    }
    @And("kullanici arama alanina gecerli sembol {string} girer")
    public void kullaniciAramaAlaninaGecerliSembolGirer(String string) {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici arama ile ilgili sonuc bulunamamistir yazisini goruntuler")
    public void kullaniciAramaIleIlgiliSonucBulunamamistirYazisiniGoruntuler() {
        assert araPage.sembolIleIlgiliSonucBulunamamistirTextAra.isDisplayed();
    }
}
