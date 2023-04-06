package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC05_MerveASteps {
    Elements e = new Elements();
    @Given("Navigate to OrangeHRM Website")
    public void navigateToOrangeHRMWebsite() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("I login as an admin")
    public void iLoginAsAnAdmin() {
        e.sendKeysFunction(e.loginUsername,"Admin");
        e.sendKeysFunction(e.loginPassword,"admin123");
        e.clickFunction(e.loginButton);
    }

    @And("I navigate to admin management page")
    public void iNavigateToUserManagementPage() {
        e.clickFunction(e.adminButton);
    }

    @When("I click on add button")
    public void iClickOnAddButton() {
        e.javaScpritClickFunction(e.addButton);
    }

    @And("I enter an invalid name in to the Employee name field")
    public void ıEnterAnInvalidNameInToTheEmployeeNameField() {
        e.sendKeysFunction(e.employeeName,"Merve");

    }

    @Then("I verify that notification messages “no records found” and “invalid” in red color displayed.")
    public void ıVerifyThatNotificationMessagesNoRecordsFoundAndInvalidInRedColorDisplayed() {
        e.displaymessage.isDisplayed();
    }
}
