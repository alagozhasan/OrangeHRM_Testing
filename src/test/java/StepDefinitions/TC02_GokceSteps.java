package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;

public class TC02_GokceSteps {

    Elements e = new Elements();
    @And("I fill up the form with Mandatory fields")
    public void iFillUpTheFormWithMandatoryFields() {
        e.clickFunction(e.userRole);
        e.clickFunction(e.selectRoleESS);
        e.sendKeysFunction(e.employeeName,e.employeeNameIcin.getText());
        e.waitTextToBePresent(e.selectEmployeeName, e.employeeNameIcin.getText());
        e.clickFunction(e.selectEmployeeName);
        e.clickFunction(e.status);
        e.clickFunction(e.selectStatusEnable);
        e.sendKeysFunction(e.username,"ress6161");
        e.waitUntilInVisible(e.usernameMessage);
        e.sendKeysFunction(e.password, "Ress123.");
        e.sendKeysFunction(e.passwordConfirm,"Ress123.");

    }
}
