package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    // @Before testNg deki @BeforeMethod gibi calisir.
    // her scenario dan once calisir
    // Global Hooks annotation denir(hepsini etkiledigi icin)
    @Before(order = 1)
    public void setup(){
        System.out.println("Hooks Class- Setup Method");
    }
    // TAGGED Hooks annotation
    @Before(value = "@iphone",order = 2) // Her ozel(spesific) senaryodn once(sadece iphone senaryosu icin calisir.)
    public void searchIphone(){
        System.out.println("Hooks Class - Iphone method");
    }
    // Her scenario dan sonra calisir
    @After
    public void teardown(Scenario scenario){
        System.out.println("Hooks class - tearDown Method");

        // hooks u kullanmamizin amaci screenshot almaktir. bunuda...
        final byte[] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        // Her fail olan scenario dan sonra screnshot almaliyiz
        // scenario fail olursa image ekleyelim
        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }
        // Driver.closeDriver();
    }
}
