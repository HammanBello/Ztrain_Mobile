package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SubscriptionPage extends Page {

    @AndroidFindBy(className = "android.widget.EditText")
    private List<MobileElement> passwordField;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> formField;

    @AndroidFindBy(accessibility = "Allez au site")
    private MobileElement readyButton;

    @AndroidFindBy(accessibility = "Continuer")
    private MobileElement submitForm;

    private String email = "merlin@gmail.com";

    private String spacePassword = "        ";

    public boolean verifySpacePassword(){
        try{
            shortWaitUntil(visibilityOf(readyButton));
            return readyButton.isDisplayed();
        }catch(Exception e){
            return false;
        }
    }

    public void setEmail(){
        shortWaitUntil(visibilityOf(submitForm));
        fillField(formField,"Email",email);
    }

    public void setPassword(){
        fillField(passwordField,"Mot de passe",spacePassword);
        fillField(passwordField,"Confirmer le mot de passe",spacePassword);
        hideKeyboard();
        click(submitForm);
    }




}
