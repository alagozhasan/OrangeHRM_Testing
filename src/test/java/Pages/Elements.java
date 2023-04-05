import Pages.Parent;
import Utilities.GWD;

public class Elements extends Parent {

    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
}