package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DialogContent {
    public static void main(String[] args) {
        System.out.println("Factory");
        System.out.println("Burcuuu");
        
    }
    @FindBy(css = "")
    public WebElement nameInput;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement passwordInput;
    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

//    @FindBy(css="input[formcontrolname='password']")
//    public WebElement password; // Aynısından vardı

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;


    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;
    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;




}
