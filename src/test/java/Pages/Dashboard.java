package Pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
    ActionsDashBoard dashBoard;

    @Step
    public void verifyAdmin(){
        dashBoard.loginVerified();
    }

}
