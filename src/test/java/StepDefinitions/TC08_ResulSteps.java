package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC08_ResulSteps {

    Elements e = new Elements();
    @Then("I verify that add button is displayed")
    public void iVerifyThatAddButtonIsDisplayed() {
        e.waitUntilVisible(e.addButton);
        Assert.assertTrue(e.addButton.isDisplayed());
    }
}
