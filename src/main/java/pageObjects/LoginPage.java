package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends Page{

    @AndroidFindBy(className = "android.widget.EditText")
    private List<MobileElement> passwordField;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> formField;

    @AndroidFindBy(accessibility = "continue")
    private MobileElement startButton;

    @AndroidFindBy(accessibility = "Back")
    private MobileElement goBack;

    @AndroidFindBy(accessibility = "ZTrain\n" +
            "Nous recherchons les meilleures offre pour vous")
    private MobileElement presentation;

    @AndroidFindBy(accessibility = "S'inscrire")
    private MobileElement subscribeButton;

    @AndroidFindBy(accessibility = "Continue")
    private MobileElement submitLoginForm;

    @AndroidFindBy(accessibility = "Mot de passe oublier")
    private MobileElement forbiddenPassword;

    @AndroidFindBy(accessibility = "Allez au site")
    private MobileElement readyButton;

    private String email = "zeufackp@gmail.com";

    private String password = "007hermann";

    public void goToSubscriptionPage(){
        click(subscribeButton);
    }

    public void goToLoginPage(){
        click(startButton);
    }

    public void lookPage(){
        shortWaitUntil(visibilityOf(subscribeButton));
    }

    public void getLogged(){
        fillField(formField,"Email",email);
        fillField(passwordField,"Mot de passe",password);
        hideKeyboard();
        click(submitLoginForm);
        click(readyButton);
    }

    public boolean verifyForbiddenPassword(){
        try{
            return forbiddenPassword.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public boolean verifySubmitButton(){
        try{
            return submitLoginForm.isDisplayed();
        }catch (Exception e){
            return false;
        }

    }

    public void goBack(){
        click(goBack);
    }

    public boolean verifyPresentationtext(){
        try{
            return presentation.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }


}
