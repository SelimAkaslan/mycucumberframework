package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.FhcRegisterPage;
import pages.FhcTripLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcRegisterStepDefinitions {
    FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage();
    FhcRegisterPage fhcRegisterPage = new FhcRegisterPage();
    WebDriver driver;
    @Given("kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }
    @Given("kullanici create a new account butonuna tiklar")
    public void kullanici_create_a_new_account_butonuna_tiklar() {
        fhcRegisterPage.createButton.click();
    }
    @Given("kullanici username girer")
    public void kullanici_username_girer() {
        fhcRegisterPage.username.sendKeys("selim");
    }
    @Given("kullanici password girer")
    public void kullanici_password_girer() {
        fhcRegisterPage.password.sendKeys("password1");
    }
    @Given("kullanici email girer")
    public void kullanici_email_girer() {
        fhcRegisterPage.mail.sendKeys("aksel@gmail.com");
    }
    @Given("kullanici fullname girer")
    public void kullanici_fullname_girer() {
        fhcRegisterPage.fullname.sendKeys("Selo can");
    }
    @Given("kullanici phone girer")
    public void kullanici_phone_girer() {
        fhcRegisterPage.phone.sendKeys("15204106202");
    }
    @Given("kullanici SSN girer")
    public void kullanici_SSN_girer() {
        fhcRegisterPage.ssnumber.sendKeys("111 111 111 222");
    }
    @Given("kullanici Driven lisans girer")
    public void kullanici_Driven_lisans_girer() {
        fhcRegisterPage.drivingLicense.sendKeys("125 abc 11");
    }
    @Given("kullanici country dropdowndan secer")
    public void kullanici_country_dropdowndan_secer() {
        Select select =new Select(fhcRegisterPage.Country);
        select.selectByIndex(229);
    }
    @Given("kullanici state dropdowndan secer")
    public void kullanici_state_dropdowndan_secer() {
        Select select =new Select(fhcRegisterPage.Country);
        select.selectByIndex(7);
    }
    @Given("kullanici adress girer")
    public void kullanici_adress_girer() {
        fhcRegisterPage.address.sendKeys("orleans");
    }
    @Given("kullanici working sector girer")
    public void kullanici_working_sector_girer() {
        fhcRegisterPage.sector.sendKeys("IT egitim");
    }
    @Given("kullanici birthday girer")
    public void kullanici_birthday_girer() {
        fhcRegisterPage.birthdate.sendKeys("11.11.1981");
    }
    @Then("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        fhcRegisterPage.saveButton.click();
    }
}