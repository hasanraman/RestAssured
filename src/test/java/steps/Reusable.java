package steps;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Reusable {
    public void getaclient(Integer id){


        String baseUrl="http://api.endamti.com/";

        Response response=

                given()
                .queryParam("id",590)
                .get(baseUrl+"clients/get");

        System.out.println("response = " +response.statusCode() );
        System.out.println("response = " + response.prettyPrint());

        Assert.assertEquals(404,response.statusCode());



    }



        public void createNewUser(){
            String baseUrl="http://api.endamti.com/";

            JSONObject data=new JSONObject();


            data.put("active", true);
            data.put("balance", 0);
            data.put("canSms", true);
            data.put("city", "string");
            data.put("email", "string");
            data.put("entryDate", "string");
            data.put("firstname", "demo2");
            data.put("gender", "string");
            data.put("id", 506);
            data.put("internalId", "string");
            data.put("lastVisit", "string");
            data.put("lastname", "string");
            data.put("notificationBy", "string");
            data.put( "optIn", true);
            data.put("organization", "string");
            data.put( "otherPhone", "string");
            data.put("phone", "string");
            data.put("prefix", "string");
            data.put("state", "string");
            data.put("status", "string");
            data.put("street", "string");
            data.put("title", "string");
            data.put("visits", 0);
            data.put("zip", "string");
            Response response =
                             given()
                            .contentType("application/json")
                            .body(data)
                            .post(baseUrl+"clients/add");
            System.out.println(response.statusCode());
            System.out.println(response.prettyPrint());
        }


        public void ActivateUser(){
            String baseUrl="http://api.endamti.com/";
        Response response=
                given()
                .queryParam("id","590")
                .put(baseUrl+"clients/add");

        Assert.assertEquals("200",response.statusCode());
        }
}
