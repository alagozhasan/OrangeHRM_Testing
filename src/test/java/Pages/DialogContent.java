package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DialogContent {
    public static void main(String[] args) {
        System.out.println("Factory");

    }
    @FindBy(css = "")
    public WebElement nameInput;

    @FindBy(css = "")
    public WebElement passwordInput;
    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;




}
