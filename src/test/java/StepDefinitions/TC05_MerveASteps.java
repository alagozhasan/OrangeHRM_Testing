package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.*;


public class TC05_MerveASteps {
    Elements e = new Elements();

    @And("I enter an invalid name in to the Employee name field")
    public void iEnterAnInvalidNameInToTheEmployeeNameField() {
        e.sendKeysFunction(e.employeeName,"Merve");

    }

    @Then("I verify that notification messages “no records found” and “invalid” in red color displayed.")
    public void iVerifyThatNotificationMessagesNoRecordsFoundAndInvalidInRedColorDisplayed() {
        e.displaymessage.isDisplayed();
    }
}
