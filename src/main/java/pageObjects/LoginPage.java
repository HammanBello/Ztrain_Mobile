package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends Page{

    @AndroidFindBy(accessibility = "continue")
    private MobileElement startButton;

    @AndroidFindBy(accessibility = "S'inscrire")
    private MobileElement subscribeButton;

    @AndroidFindBy(accessibility = "Continue")
    private MobileElement submitLoginForm;

    private String email = "merlinmagicien1@gmail.com";

    private String spacePassword = "        ";

    public void goToSubscriptionPage(){
        click(subscribeButton);
    }

    public void goToLoginPage(){
        click(startButton);
    }


}
