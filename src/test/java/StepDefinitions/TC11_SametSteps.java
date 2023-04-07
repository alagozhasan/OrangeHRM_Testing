package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC11_SametSteps {

    Elements e = new Elements();

    @And("I enter a value into the Password field which is less than 8 characters")
    public void iEnterAValueIntoThePasswordFieldWhichIsLessThanEightCharacters() {

        e.sendKeysFunction(e.password, "SamBay");

    }

    @Then("I verify that notification messages “Should have at least 8 characters” in red color displayed.")
    public void iVerifyThatNotificationMessagesShouldHaveAtLeastEightCharactersInRedColorDisplayed() {

        e.verifyContainsTextFunction(e.redErrorMessage,"Should have at least 8 characters");

    }
}
