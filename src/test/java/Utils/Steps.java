package Utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;

public class Steps {
    @Step
    public static Response GET(String endPoint) {
        Allure.addAttachment("URL:", baseURI + endPoint);

        Response response =  get(endPoint);
        Allure.addAttachment("Response body:", response.body().prettyPrint());
        Allure.addAttachment("Status code:", String.valueOf(response.statusCode()));

        return response;
    }

    @Step
    public static void isStatusCodeValid(Response response, int expectedResult) {
        response.then().assertThat().statusCode(expectedResult);
    }
}
