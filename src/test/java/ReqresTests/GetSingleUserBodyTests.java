package ReqresTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class GetSingleUserBodyTests {

    @BeforeClass void setUp() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test void getSingleUser() {
        given()
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .assertThat()
                .statusCode(200)
                .assertThat()
                .body("data.id", equalTo(2))
                .body("data.email", containsString("@reqres.in"))
                .body("data.avatar", not(equalTo("https://google.com/img/faces/2-image.jpg")))
                .body("support.text", containsString("ReqRes"));
    }
}