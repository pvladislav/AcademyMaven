package ReqresTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static ReqresTests.EqualToIgnoringCaseAndWhitespace.equalToIgnoringCaseAndWhitespace;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class GetListUsersBodyTests {

    @BeforeClass void setUp() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test void getListUsersBodyCheck() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .assertThat()
                .body(containsString("Rachel"))//happy
                .body(containsString("rachel.howell@reqres.in"))//happy

                .body("data.email", hasItem(endsWith("reqres.in")))
                .body("data.first_name[0]", equalTo("Michael"))
                .body("data.first_name[0]", is("Michael"))
                .body("data.first_name[0]", not(equalTo("MichaelTEST")))
                .body("data.first_name[0]", equalToIgnoringCase("michael"))
                .body("data.first_name[0]", equalToIgnoringWhiteSpace(" Michael"))
                .body("data.first_name[0]", allOf(
                        equalToIgnoringCase("michAel"),
                        equalToIgnoringWhiteSpace(" Michael ")))
                .body("data.first_name[0]", equalToIgnoringCaseAndWhitespace(" michael  "))//overwritten construction
                .body("data.first_name", hasItem("Michael"))
                .body("data.id[0]", lessThan(9))
                .body("data.id[0]", lessThanOrEqualTo(8))
                .body("data.id[0]", greaterThan(6))
                .body("data.id[0]", greaterThanOrEqualTo(7))
                .log().all();

        Response response = given()
                .get("https://reqres.in/api/users?page=2");
        response.prettyPrint();
    }

    @Test
    void getListUsers1() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.printf("Response status code = %d %n", response.statusCode());
        System.out.println(response.getHeader("page").equals(null));
        System.out.println(response.getBody().asString());
    }
}
