package api.stepdefinitions;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;


public class TestBaseApi {

    protected RequestSpecification spec;


    public void setUp(){
        spec= new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com").build();
    }

}
