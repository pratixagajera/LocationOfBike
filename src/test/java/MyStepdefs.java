
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class MyStepdefs {



    @Given("as a user I want to verify {string} with {string}")
    public void as_a_user_i_want_to_verify_with(String cityName, String countryName) {
        Response response = given()
                .basePath("/v2/networks")
                .param("city", cityName)
                .param("country", countryName)
                .and()
                .when()
                .get();
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.getString("location.city"), "Frankfurt");
        Assert.assertEquals(jsonPath.getString("location.country"), "Germany");

    }
    @Given("{double}, {double} of that city")
    public void of_that_city(Double latitude, Double longitude)
    {
        Response response = given()
                .basePath("/v2/networks")
                .param("latitude", latitude)
                .param("longitude", longitude)
                .and()
                .when()
                .get();
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.getString("location.latitude"),  50.1072);
        Assert.assertEquals(jsonPath.getString("location.longitude"),  8.66375);

    }
}
