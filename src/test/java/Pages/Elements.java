package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent {

    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
}