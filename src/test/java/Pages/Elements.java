package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent {

    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    //Yolumun üstündeki bazı locaterları da buldum arkadaşlar lazım olanı alabilirsiniz.

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

    //admin sayfasındaki üst arama kısmı için

    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[1]")
    public WebElement usernameSearch;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    public WebElement userRole; // hem search hem addbuttona tıkladıktan sonra ortak locater


    //Admin sayfasındaki ekleme butonu

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addButton;

    //userRole yukarıda var aynı locater

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[3]")
    public WebElement selectRoleESS;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    public WebElement status;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[2]")
    public WebElement selectStatusEnable;

    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[1]")
    public WebElement employeeName;

    @FindBy(xpath = "(//div[@class='oxd-autocomplete-wrapper']/div[@role='listbox']/div)[1]")
    public WebElement selectEmployeeName;
    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[2]")
    public WebElement username;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input)[1]")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input)[2]")
    public WebElement passwordConfirm;

    @FindBy(css = "button[type='submit']")
    public WebElement saveButton;



}