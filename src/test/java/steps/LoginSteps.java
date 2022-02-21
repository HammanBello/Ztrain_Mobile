package steps;

import io.cucumber.java.en.Given;
import pageObjects.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("User is on LoginPage")
    public void loginPage() {
        loginPage.goToLoginPage();
    }

    @Given("User go on subscription page")
    public void subscriptionPage() {
        loginPage.goToSubscriptionPage();
    }

}
