package ui.stepdefinitions;
import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import ui.pages.AmazonWebElements;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;


public class TC01StepDefinitions {
    AmazonWebElements pages =new AmazonWebElements();
    Logger log = (Logger) LogManager.getLogger(TC01StepDefinitions.class);

    @When("user goes to Amazon Home Page")
    public void user_goes_to_amazon_home_page() {
        Driver.getDriver().
                get(ConfigReader.getProperty("amazonUrl"));
        log.info("anasayfa açıldı");
    }

    @Then("user clicks signin button")
    public void user_clicks_signin_button() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions=new Actions(Driver.getDriver()) ;

        actions.moveToElement(pages.mainMenu).
                click(pages.signInButton).perform();
        log.info("sign in butonuna tıklandı");


    }

    @Then("user enters invalid email")
    public void users_enters_invalid_email() {

        pages.emailtextbox.sendKeys(ConfigReader.getProperty("invalidemail"));
        log.info("invalid email girildi");

    }

    @Then("clicks continue button")
    public void clicks_continue_button() {
        pages.continueButton.click();
        log.info("devam butonuna tıklandı");

    }

    @Then("checks that the error message is displayed")
    public void checks_that_the_error_message_is_displayed() {

        Assert.assertTrue(pages.errorMessage.isDisplayed());
        log.info("hata mesajı doğrulandı");



    }

    @And("close page")
    public void closePage() {
        Driver.closeDriver();
    }
}
