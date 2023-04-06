package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.*;


public class TC01_ResulSteps {

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

        e.clickFunction(e.addButton);

    }

    @And("I fill up the form with required info")
    public void iFillUpTheFormWithRequiredInfo() {
        e.clickFunction(e.userRole);
        e.clickFunction(e.selectRoleESS);
        e.sendKeysFunction(e.employeeName,"Paul Collings");
        GWD.waitForJustTry(5);
        e.clickFunction(e.selectEmployeeName);
        e.clickFunction(e.status);
        e.clickFunction(e.selectStatusEnable);
        e.sendKeysFunction(e.username,"ress61");
        e.sendKeysFunction(e.password, "Ress123.");
        e.sendKeysFunction(e.passwordConfirm,"Ress123.");

    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        e.clickFunction(e.saveButton);
    }

    @Then("I verify that ESS user on the list")
    public void iVerifyThatESSUserOnTheList() {
    }
}
