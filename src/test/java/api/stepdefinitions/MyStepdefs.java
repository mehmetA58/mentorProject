package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class MyStepdefs {
    Response response;

    @Given("user send a GET request")
    public void userSendAGETRequest() {
        String url = "https://restful-booker.herokuapp.com/booking/3";

        //2- beklenen sonuç(expected result) oluşturulur.

        // bu case de benden body doğrulaması istenmediği için şimdilik beklenen sonuç oluşturmuyoruz

        //3-  request gönder

        response= given().
                accept("application/json").  // accept("application/json") kullanılabilir.
                        when().
                get(url);
    }


    @Then("user get a response")
    public void userGetAResponse() {

        response.prettyPrint();

    }
}
