package pageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class LoginPage extends Page{

    @AndroidFindBy(className = "android.widget.EditText")
    private List<MobileElement> passwordField;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> formField;

    @AndroidFindBy(xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/andr" +
            "oid.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]")
    private MobileElement formFieldu;


    @AndroidFindBy(accessibility = "continue")
    private MobileElement startButton;

    @AndroidFindBy(accessibility = "Back")
    private MobileElement goBack;


    @AndroidFindBy(accessibility = "S'inscrire")
    private MobileElement subscribeButton;

    @AndroidFindBy(accessibility = "Continuer")
    private MobileElement submitLoginForm;

    @AndroidFindBy(accessibility = "Mot de passe oubli\u00E9")
    private MobileElement forbiddenPassword;

    @AndroidFindBy(accessibility = "Aller au site")
    private MobileElement readyButton;

    private final String email = "zeufackp@gmail.com";

    private final String password = "007hermann";

    @AndroidFindBy(accessibility = "ZTrain\nNous recherchons les meilleures offres pour vous")
    private MobileElement homeView;

    @AndroidFindBy(accessibility = "Game")
    private MobileElement headerCategory;

    private boolean isVerified = false;

    public LoginPage() {
    }

    public void goToSubscriptionPage(){
        click(subscribeButton);
        shortWaitUntil(visibilityOf(driver.findElement(MobileBy.AccessibilityId("Continuer"))));
    }

    public void goToLoginPage(){
        isVerified  = validSpellingText();
        if(isConnected == 0){
            click(startButton);
            shortWaitUntil(visibilityOfAllElements());
        }
    }

    private boolean validSpellingText(){
        try {
            shortWaitUntil(visibilityOf(startButton));
            System.out.println(homeView.getText());
            return shortWaitUntil(visibilityOf(homeView));
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public void lookPage(){
        shortWaitUntil(visibilityOf(subscribeButton));
    }

    public void connexion(){

                    getLogged();
                    goOnDashboard();



 //           isConnected++;

//        driver.navigate().back();
//        goBackMenu();
        //click(homeView);
    }

    public void getLogged(){
//        formFieldu.click();
        for (int i = 0; 10 > i; i++){
        try{
        fillField(formField,"Email",email);
        break;}
              catch (Exception e){
                System.out.println(e);
            }}
            for (int i = 0; 10 > i; i++){
                try{
                    fillField(passwordField,"Mot de passe",password);
                    break;}
                catch (Exception e){
                    System.out.println(e);
                }}
        hideKeyboard();
        click(submitLoginForm);
    }

    public void goOnDashboard(){
        click(readyButton);
    }

    public boolean verifyForbiddenPassword(){
        try{
            System.out.println("try forbidenn");
            System.out.println(forbiddenPassword);
            return true;
        }catch (Exception e){
            System.out.println("got it...................."+e);
            return false;
        }
    }

    public boolean verifySubmitButton(){
        try{
            shortWaitUntil(visibilityOf(submitLoginForm));
            System.out.println(submitLoginForm.getText());
            return    true;
        }catch (Exception e){
            System.out.println("got it...................."+e);
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
