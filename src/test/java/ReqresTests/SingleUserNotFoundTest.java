package ReqresTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SingleUserNotFoundTest {

    @BeforeClass
    void setUp() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    void getSingleUserNotFound() {
        given()
                .when()
                .get("/api/users/23")
                .then()
                .assertThat()
                .statusCode(404)
                .body(equalTo("{}"));
    }
}