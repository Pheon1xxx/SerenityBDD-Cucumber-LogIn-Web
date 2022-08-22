package Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ActionsHomePage extends PageObject {

    public void enterUName(){
        $(By.id("email")).type("dec2020secondbatch@gmail.com");
    }
    public void enterPassword() { $(By.id("passwd")).type("Selenium@12345"); }
    public void clickLogin(){
        $(By.id("SubmitLogin")).click();
    }

}
