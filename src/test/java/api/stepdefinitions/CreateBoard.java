package api.stepdefinitions;


import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBoard extends TestBaseApi {

    Response response;
    JsonPath jsonPath;



    @Given("Send POST request for create {string} board")
    public void send_post_request_for_create_board(String boardName) {

        //url tanımla
        //expected data-request data
       // request gönder
        //resposu al
        //assert et
        setUp();
        spec.pathParams("parametre1",1,"parametre2","boards");

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("name",boardName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        System.out.println(requestBody);

        response =given().
                 spec(spec).
                 contentType("application/json").
                 body(requestBody).
                 when().
                 post("/{parametre1}/{parametre2}");

        response.prettyPrint();
        jsonPath=response.jsonPath();


    }

    @Then("Assert status code {int}")
    public void assertStatusCode(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());

    }

    @Then("Assert board name is {string}")
    public void assert_board_name_is(String boardName) {

        Assert.assertEquals(boardName,jsonPath.getString("name"));

    }



}
