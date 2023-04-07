package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC04_SametSteps {

    Elements e = new Elements();

    @And("I enter a required value in to the password field and different value in to the confirm password field")
    public void iEnterARequiredValueInToThePasswordFieldAndDifferentValueInToTheConfirmPasswordField() {

        e.sendKeysFunction(e.password, "SamBay123.");
        e.sendKeysFunction(e.passwordConfirm,"SamBay123");

    }

    @Then("I verify that notification messages “Passwords do not match” in red color displayed.")
    public void iVerifyThatNotificationMessagesPasswordsDoNotMatchInRedColorDisplayed() {

        e.verifyContainsTextFunction(e.redErrorMessage,"Passwords do not match");

    }
}
