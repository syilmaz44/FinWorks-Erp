package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import utilities.Driver;

public class titleVerificication {
    @When("User is on FinWorksErp homepage")
    public void user_is_on_FinWorksErp_homepage() {
        Driver.getDriver().get("https://finworkserp.com");

    }

    @Then("User should see title contains FinWorksErp")
    public void user_should_see_title_contains_FinWorksErp() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="FinWorksErp";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

}
