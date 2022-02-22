package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.SubscriptionPage;

public class SubscriptionSteps {

    private SubscriptionPage subscriptionPage;

    public SubscriptionSteps(SubscriptionPage subscriptionPage) {
        this.subscriptionPage = subscriptionPage;
    }

    @When("User enter an email")
    public void userEnterAnEmail() {
        subscriptionPage.setEmail();
    }


    @And("User enter space lenght password")
    public void userEnterSpaceLenghtPassword() {
        subscriptionPage.setPassword();
    }

    @Then("User should see subscription error")
    public void userShouldSeeSubscriptionError() {
        Assert.assertEquals(subscriptionPage.verifySpacePassword(),false);
    }
}
