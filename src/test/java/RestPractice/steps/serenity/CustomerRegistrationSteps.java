package RestPractice.steps.serenity;

import RestPractice.Pojo.CreateUserBody;
import RestPractice.Pojo.CreateUserResponse;
import RestPractice.Utilites.CommonUtils;
import groovy.util.logging.Slf4j;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.decorators.ResponseDecorated;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.rest.SerenityRest.rest;

@Slf4j
public class CustomerRegistrationSteps extends CommonUtils {

    public Response createCustomerResponse;

    Logger logger = LoggerFactory.getLogger(CustomerRegistrationSteps.class.getName());

    @Step
    public Response createCustomerRequest() {

        RequestSpecification createCustomerRequestSpecs = rest();

        CreateUserBody createUserBody = new CreateUserBody();
        createUserBody.setUsername(genrateRandomString(4));
        createUserBody.setAddress("144 Townsend, San Francisco 99999");
        createUserBody.setEmail(genrateRandomString(4)+"@example.com");
        createUserBody.setCustomerId("0");
        createUserBody.setPhone("513 222 5555");
        createUserBody.setRole("USER");
        createUserBody.setName("Sally Vallery");
        createUserBody.setPassword("sallypassword");
        createUserBody.setEnabled("true");

        createCustomerRequestSpecs.accept("application/json");
        createCustomerRequestSpecs.contentType("application/json");
        createCustomerRequestSpecs.body(createUserBody);

        createCustomerResponse =  createCustomerRequestSpecs.with().baseUri("http://localhost:8080").port(8080).post("/api/customer/");
        createCustomerResponse.prettyPrint();
        return createCustomerResponse;
    }
    @Step
    public void verifyResponseCode(int code) {
        Assert.assertTrue(createCustomerResponse.statusCode()==code);
        logger.info("The user was created successfully");
    }

    @Step
    public void verifyCustomerIdIsReturned(){
        if(createCustomerResponse instanceof CreateUserResponse){
        }else{
            logger.error("The response was other than expected");
            Assert.fail("The response was other than expected");
        }
    }
}
