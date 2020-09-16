package test;

import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Metodo_POST {

    @Test
    public void POST_AcessarSite()
    {
        JSONObject request = new JSONObject();
        given().
                body(request.toJSONString()).
                when().
                post("https://rep-nota-1000-staging.herokuapp.com/api/v1/login").
                then().
                statusCode(200);

    }

    @Test
    public void Post_login()
    {
        JSONObject obj = new JSONObject();
               given().
                body(obj.toJSONString()).
                when().
                post("https://rep-nota-1000-staging.herokuapp.com/api/v1/login").
                then().
                statusCode(200);
        obj.put("seller[email]", "test.partner@pag.net");
        obj.put("seller[password]", "Pagnet123");

    }
}
