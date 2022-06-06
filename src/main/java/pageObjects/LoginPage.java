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

    @AndroidFindBy(accessibility = "Continuer")
    private MobileElement submitLoginForm;

    @AndroidFindBy(accessibility = "Mot de passe oublier")
    private MobileElement forbiddenPassword;

    @AndroidFindBy(accessibility = "Aller au site")
    private MobileElement readyButton;

    private String email = "zeufackp@gmail.com";

    private String password = "007hermann";

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    private MobileElement homeView;

    @AndroidFindBy(accessibility = "Game")
    private MobileElement headerCategory;

    private boolean isVerified = false;

    public void goToSubscriptionPage(){
        click(subscribeButton);
    }

    public void goToLoginPage(){
        isVerified  = validSpellingText();
        if(isConnected == 0){
            click(startButton);
        }
    }

    private boolean validSpellingText(){
        try {
            shortWaitUntil(visibilityOf(startButton));
            return !presentation.isDisplayed();
        }catch(Exception e){
            return false;
        }
    }

    public void lookPage(){
        shortWaitUntil(visibilityOf(subscribeButton));
    }

    public void connexion(){
        if (isConnected == 0){
            getLogged();
            goOnDashboard();
            isConnected++;
        }
        driver.navigate().back();
        goBackMenu();
        //click(homeView);
    }

    public void getLogged(){
        fillField(formField,"Email",email);
        fillField(passwordField,"Mot de passe",password);
        hideKeyboard();
        click(submitLoginForm);
    }

    public void goOnDashboard(){
        click(readyButton);
    }

    public boolean verifyForbiddenPassword(){
        try{
            shortWaitUntil(visibilityOf(forbiddenPassword));
            return forbiddenPassword.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public boolean verifySubmitButton(){
        try{
            shortWaitUntil(visibilityOf(submitLoginForm));
            return submitLoginForm.isDisplayed() && !submitLoginForm.getText().equals("Continue");
        }catch (Exception e){
            return false;
        }

    }

    public void goBack(){
        try{goBack.click();}catch (Exception e){
            System.out.println("button doesn't exist");
        }

    }

    public boolean verifyPresentationText(){
        return isVerified;
    }

    public boolean verifyAccountAccess(){
        try{
            shortWaitUntil(visibilityOf(readyButton));
            return readyButton.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void goBackMenu(){
        try{
            while (!homeView.isDisplayed()){
                driver.navigate().back();
            }
        }catch (Exception e){
            click(homeView);
        }
    }


}
