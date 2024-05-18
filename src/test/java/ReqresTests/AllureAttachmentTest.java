package ReqresTests;

import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Utils.Steps.GET;
import static Utils.Steps.isStatusCodeValid;
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
}