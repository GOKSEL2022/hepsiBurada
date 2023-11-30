package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.HomePage;

public class TC04_sayfadaAramaTestiStepDefs {
    HomePage homePage=new HomePage();
    @And("kullanici arama alanina tiklar")
    public void kullaniciAramaAlaninaTiklar() throws InterruptedException {
        homePage.searchBoxHome.click();
        Thread.sleep(2000);
    }

    @And("kullanici arama alanina en az iki karakter girmesi gerektigini gorur")
    public void kullaniciAramaAlaninaEnAzIkiKarakterGirmesiGerektiginiGorur() {
        assert homePage.aramayaBaslamakIcinEnAz2KarakterYazmalisinizTextHome.getText().contains("en az 2 karakter girmelisiniz");
    }
}
