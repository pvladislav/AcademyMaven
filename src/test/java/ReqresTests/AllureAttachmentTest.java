package ReqresTests;

import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Utils.Steps.*;
import static io.restassured.RestAssured.baseURI;

public class AllureAttachmentTest {

    @BeforeSuite void setUp() {
        baseURI = "https://reqres.in/api";
    }

    @Test
    void getListUsers() {
        String url = "/users?page=2";

        GET(url);
        Response response = GET(url);
        isStatusCodeValid(response, 200);
    }

    @Test
    public void testCreate() {
        String url = "/api/users";
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        Response response = POST(body, url);
        isStatusCodeValid(response, 201);
    }
}