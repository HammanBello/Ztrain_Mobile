package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.AccountSettingPage;

public class AccountSettingSteps {

    private AccountSettingPage accountSettingPage;

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
        Assert.assertEquals(accountSettingPage.verifyLogOut(),false);
    }

    @And("User click on {string}")
    public void userClickOn(String arg0) {
        accountSettingPage.clickOnMyAccount();
    }

    @Then("User should see correct account spelling")
    public void userShouldSeeCorrectAccountSpelling() {
        Assert.assertEquals(accountSettingPage.verifyTextSpelling(),false);
    }

    @And("User fill fields with space")
    public void fillFieldsWithSpace() {
        accountSettingPage.fillForm();
    }

    @Then("User should see modifications not validated")
    public void modificationsValidation() {
        Assert.assertEquals(accountSettingPage.verifyModification(),false);
    }

    @When("User click again on account setting")
    public void twiceClickOnAccountSetting() {
        accountSettingPage.clickOnAccountSetting();
    }

    @Then("User should same langage for options")
    public void sameLangageForOptions() {
        Assert.assertEquals(accountSettingPage.verifyLogOutText(),false);
    }

    @And("User click on phone back button")
    public void userClickOnPhoneBackButton() {
        accountSettingPage.homeBack();
    }
}
