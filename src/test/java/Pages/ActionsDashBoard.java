package Pages;

import net.serenitybdd.core.pages.PageObject;

public class ActionsDashBoard extends PageObject {

    public void loginVerified(){
        System.out.println(getDriver().getTitle());
    }
}
