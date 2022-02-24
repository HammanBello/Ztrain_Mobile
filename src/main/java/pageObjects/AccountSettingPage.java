package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AccountSettingPage extends Page{

    @AndroidFindBy(accessibility = "Log Out")
    private MobileElement logOutButton;

    @AndroidFindBy(accessibility = "Mon compte")
    private MobileElement myAccountButton;

    @AndroidFindBy(accessibility = "Ok")
    private MobileElement checkPoint;

    @AndroidFindBy(accessibility = "Mofifiez-vos informations")
    private MobileElement accountInfo;

    @AndroidFindBy(accessibility = "Mofifier")
    private MobileElement submitButton;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> formField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    private MobileElement accountView;

    private String spaceText = "        ";

    public void clickOnAccountSetting(){
        click(accountView);
    }

    public void clickOnLogOut(){
        click(logOutButton);
    }

    public void clickOnMyAccount(){
        click(myAccountButton);
    }

    public boolean verifyLogOut(){
        try{
            shortWaitUntil(visibilityOf(logOutButton));
            return logOutButton.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public boolean verifyTextSpelling(){
        try{
            shortWaitUntil(visibilityOf(accountInfo));
            return (accountInfo.isDisplayed()&&submitButton.isDisplayed());
        }catch (Exception e){
            return false;
        }
    }

    public void fillForm(){
        fillField(formField,"Nom",spaceText);
        fillField(formField,"Prénom",spaceText);
        fillField(formField,"Adresse",spaceText);
        click(submitButton);
    }

    public boolean verifyModification(){
        try{
            shortWaitUntil(visibilityOf(checkPoint));
            return checkPoint.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }






}
