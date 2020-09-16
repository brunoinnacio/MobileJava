package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

public class Metodo_GET {

    String url = "https://reqres.in/api/users";

    @Test
    public void getPageOne(){

        given().
                param("page", " 1").
                when().                get(url).
                then().
                statusCode(200).
                body("page", equalTo(1));
    }

    @Test
    public void getUser() {
        get(url + "/2").then().body("data.id", equalTo(2));
    }

    @Test
    public void GET()
    {
        given().
                get("https://rep-nota-1000-staging.herokuapp.com/api/v1/sellers/30317756192").
                then().
                statusCode(400).
                body("data.id[1]", equalTo(8)).
                body("data.first_name", hasItems("Michael", "Lindsay"));

    }
}