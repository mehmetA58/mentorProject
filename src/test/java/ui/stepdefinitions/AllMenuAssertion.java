package ui.stepdefinitions;

import io.cucumber.java.en.Then;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import ui.pages.AmazonWebElements;
import ui.utilities.Log;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMenuAssertion {

    AmazonWebElements pages=new AmazonWebElements();
    @Then("user clicks ALL menu")
    public void user_clicks_all_menu() {
        Log.startTestCase("all menu testi");
        pages.allButton.click();
        Log.info("All butonuna tıklandı");


    }
    @Then("user selects {string}")
    public void user_selects(String categori) {
        for (int i=0; i< pages.categoriMenu.size(); i++){
            if (pages.categoriMenu.get(i).getText().equals(categori)){
                pages.categoriMenu.get(i).click();
            }
        }
        Log.info("menu seçildi");


    }
    @Then("user verifies that there are {int} subcategories")
    public void user_verifies_that_there_are_subcategories(int numOfCategories) {

        Assert.assertEquals(pages.subCategoriMenu.size()-1,numOfCategories);
        Log.info ("alt katogorilerin kaç tane olduğu doğrulandı");


    }

    @Then("user verifies the title of all subcategories")
    public void userVerifiesTheTitleOfAllSubcategories() {


        List<String> expectedSubMenu= Arrays.asList(
                "Accessories & Supplies",
                "Camera & Photo",
                "Car & Vehicle Electronics",
                "Cell Phones & Accessories",
                "Computers & Accessories",
                "GPS & Navigation",
                "Headphones",
                "Home Audio",
                "Office Electronics",
                "Portable Audio & Video",
                "Security & Surveillance",
                "Service Plans",
                "Television & Video",
                "Video Game Consoles & Accessories",
                "Video Projectors",
                "Wearable Technology",
                "eBook Readers & Accessories");

        List<String>actualSubMenu=new ArrayList<>();
        for (int i=0; i< pages.subCategoriMenu.size(); i++){
            actualSubMenu.add(pages.subCategoriMenu.get(i).getText());
        }

        Assert.assertTrue(actualSubMenu.containsAll(expectedSubMenu));
        Log.info("beklenen tüm alt kategorilerin olduğu doğrulandı");
        Log.endTestCase("all menu testi");


    }
}
