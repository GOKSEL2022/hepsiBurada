package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) //@RunWith sınıfı çalıştırmak için kullanılır.Bu olmadan Runner sınıfı  çalıştırılamaz.
@CucumberOptions ( //@CucumberOptions eklemek için kullanılır.özellik yolu, adım tanımı,yol,etiketler, DryRun, rapor eklentileri
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml", // cucumber report plugini
                "rerun:target/failed_scenarios.txt", // fail eden testleri tekrar calistirir
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // spark report plugini
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features="src/test/resources/features", // features in pathi
        glue= {"stepdefinitions", "hooks"}, //stepdefinitions pathi
        tags=" @filtreleme_testi"  ,
        dryRun= false // dryRun ,eksik step olup olmadigini kontrol eder.
)
public class Runner {
}
