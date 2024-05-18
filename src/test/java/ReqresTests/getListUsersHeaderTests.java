package ReqresTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class getListUsersHeaderTests {

    @BeforeClass void setUp() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test void getListUsersHeaderCheck() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .header("Content-Type", equalTo("application/json; charset=utf-8"))
                .header("Connection", equalTo("keep-alive"))
                .header("CF-RAY", not(equalTo("884b85456c1998a3-OTP")))
                .header("String", nullValue());
    }
}