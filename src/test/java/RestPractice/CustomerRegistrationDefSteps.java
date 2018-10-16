package RestPractice;

import RestPractice.steps.serenity.CustomerRegistrationSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CustomerRegistrationDefSteps {

    @Steps
    CustomerRegistrationSteps customerRegistrationSteps;


    @Given("Customer is new to application")
    public void givenCustomerIsNewToApplication() {
        
    }

    @When("create customer reqeust is sent by customer with all valid data")
    public void whenCreateCustomerReqeustIsSentByCustomerWithAllValidData() {

        customerRegistrationSteps.createCustomerRequest();
    }

    @Then("success response with http 'code' should be returned to customer")
    
    public void thenSuccessResponseWithHttpcodeShouldBeReturnedToCustomer() {
     customerRegistrationSteps.verifyResponseCode(201);
    }
}
