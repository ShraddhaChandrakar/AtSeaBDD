package RestPractice.steps.serenity;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.decorators.ResponseDecorated;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.rest;


public class CustomerRegistrationSteps {

    public Response createCustomerResponse;

    @Step
    public Response createCustomerRequest() {

        RequestSpecification createCustomerRequestSpecs = rest();

        createCustomerRequestSpecs.accept("application/json");
        createCustomerRequestSpecs.contentType("application/json");
        createCustomerRequestSpecs.body("{\n" +
                "    \"customerId\" : 0,\n" +
                "    \"name\"       : \"Sally Vallery\",\n" +
                "    \"address\"    : \"144 Townsend, San Francisco 99999\",\n" +
                "    \"email\"      : \"sally123@example.com\",\n" +
                "    \"phone\"      : \"513 222 5555\",\n" +
                "    \"username\"   : \"sally1221\",\n" +
                "    \"password\"   : \"sallypassword\",\n" +
                "    \"enabled\"    : \"true\",\n" +
                "    \"role\"       : \"USER\"\n" +
                "}");

        createCustomerResponse =  createCustomerRequestSpecs.with().baseUri("http://localhost:8080").port(8080).post("/api/customer/");
        createCustomerResponse.prettyPrint();
        return createCustomerResponse;
    }
    @Step
    public void verifyResponseCode(int code) {
        Assert.assertTrue(createCustomerResponse.statusCode()==code);
    }

}
