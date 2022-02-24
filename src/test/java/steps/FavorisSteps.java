package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.FavorisPage;

public class FavorisSteps {

    private FavorisPage favorisPage;

    public FavorisSteps(FavorisPage favorisPage) {
        this.favorisPage = favorisPage;
    }

    @When("User click on favoris view")
    public void userClickOnFavorisView() {
        favorisPage.clickOnFavoris();
    }


    @Then("User should see favoris contain")
    public void favorisContain() {
        Assert.assertEquals(favorisPage.verifyFavorisContain(),true);
    }
}
