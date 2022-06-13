package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.AccountSettingPage;

public class AccountSettingSteps {

    private final AccountSettingPage accountSettingPage;

    public AccountSettingSteps(AccountSettingPage accountSettingPage) {
        this.accountSettingPage = accountSettingPage;
    }

    @And("User click on account setting")
    public void accountSetting() {
        accountSettingPage.clickOnAccountSetting();
    }

    @When("User click on log-out button")
    public void logOut() {
        accountSettingPage.clickOnLogOut();
    }

    @Then("User not be able to get back on account setting")
    public void backOnAccountSetting() {
        Assert.assertFalse(accountSettingPage.verifyLogOut());
    }

    @And("User click on \"my account\"")
    public void userClickOn() {
        accountSettingPage.clickOnMyAccount();
    }

    @Then("User should see correct account spelling")
    public void userShouldSeeCorrectAccountSpelling() {
        Assert.assertTrue(accountSettingPage.verifyTextSpelling());
    }

    @And("User fill fields with space")
    public void fillFieldsWithSpace() {
        accountSettingPage.fillForm();
    }

    @Then("User should see modifications not validated")
    public void modificationsValidation() {
        Assert.assertFalse(accountSettingPage.verifyModification());
    }

    @When("User click again on account setting")
    public void twiceClickOnAccountSetting() {
        accountSettingPage.clickOnAccountSetting();
    }

    @Then("User should same language for options")
    public void sameLangageForOptions() {
        Assert.assertFalse(accountSettingPage.verifyLogOutText());
    }

    @And("User click on phone back button")
    public void userClickOnPhoneBackButton() {
        accountSettingPage.homeBack();
    }
}
