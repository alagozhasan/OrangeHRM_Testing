package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class TC03_BurcuSteps {
    Elements e=new Elements();
    @Then("Verify “Required“ notification message on AddUserPage")
    public void verifyRequiredNotificationMessageOnAddUserPage() {

        e.verifyContainsTextFunction(e.redErrorMessage,"Required");
        if(e.findWebElementNumberOnPage(e.allRedErrorMessage) == 6)
            System.out.println("All mandatory fields are empty, user cannot be added ");
        else
            System.out.println("Some of mandatory fields are empty, user cannot be added");

    }

    @And("Fill only {string} and {string} fields on Add User Page")
    public void fillOnlyAndFieldsOnAddUserPage(String username, String password) {

        e.sendKeysFunction(e.username,username);
        e.sendKeysFunction(e.password,password);
        e.waitTextToBePresent(e.passwordChip, "Strongest");
        e.waitUntilInVisible(e.redErrorMessage);

    }



}
