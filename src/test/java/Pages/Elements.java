package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent {

    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    // Login kısmı
    @FindBy(css = "[name='username']" )
    public WebElement loginUsername;

    @FindBy(css = "[name='password']" )
    public WebElement loginPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;


    //Admin sayfasına gitmek için sol taraftaki admin butonu
    @FindBy(xpath = "(//ul[@class='oxd-main-menu']/li)[1]")
    public WebElement adminButton;


    //Admin sayfasındaki ekleme butonu
    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addButton;


    //ekleme tuşuna bastıktan sonra gelen kısım

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    public WebElement userRole;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[3]")
    public WebElement selectRoleESS;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    public WebElement status;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[2]")
    public WebElement selectStatusEnable;

    @FindBy(css = "p[class='oxd-userdropdown-name']")
    public WebElement employeeNameIcin;  // sağ üstteki Admin fotosunda yazan ismi alıp Employee Name e göndericez
    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[1]")
    public WebElement employeeName;

    @FindBy(xpath = "(//div[@class='oxd-autocomplete-wrapper']/div[@role='listbox']/div)[1]")
    public WebElement selectEmployeeName;

    @FindBy(css = "span[class*='message']")
    public WebElement usernameMessage;
    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[2]")
    public WebElement username;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input)[1]")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input)[2]")
    public WebElement passwordConfirm;

    @FindBy(css = "button[type='submit']")
    public WebElement saveButton;


    @FindBy(xpath = "//*[ @class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement displaymessage; //merve d. ekledi



    //admin sayfasındaki üst arama kısmı için
    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[1]")
    public WebElement usernameSearchBox;

    @FindBy(css = "button[type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell']/div)[2]")
    public WebElement searchResult;

    @FindBy(css = "div[class='oxd-table-cell-actions']>button")
    public WebElement searchDeleteIcon;

    @FindBy(xpath = "(//div[@class='orangehrm-modal-footer']/button)[2]")
    public WebElement searchDeleteConfirmButton;

    @FindBy(xpath = "//*[text()='No Records Found']")
    public WebElement searchDeleteConfirmMessage;


}