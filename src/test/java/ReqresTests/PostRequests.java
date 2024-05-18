package ReqresTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class PostRequests {

    @BeforeClass public static void setUp() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    public void createUser() {
        given()
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .post("/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .assertThat()
                .body(containsString("id"));
    }

    @Test public void createUserAnotherWay() {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "leader");

        given()
                .body(requestBody)
                .when()
                .post("/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .assertThat()
                .body(containsString("id"));
    }
}