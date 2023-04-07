package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC12_HasanSteps {
    Elements e = new Elements();

    @Then("I write password but all uppercase")
    public void iWritePasswordButAllUppercase() {
        e.sendKeysFunction(e.password, "ISTANBUL");
    }

    @And("I verify contains lower-case message displayed and message color in red")
    public void iVerifyContainsMessageDisplayedAndMessageColorInRed() {
        e.verifyContainsTextFunction(e.usernameMessage, "lower-case");
        e.classContainsAttirbuteAssert(e.usernameMessage, "error");
    }
}