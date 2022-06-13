package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AccountSettingPage extends Page {

    @AndroidFindBy(accessibility = "D\u00e9connexion")
    private MobileElement logOutButton;

    @AndroidFindBy(accessibility = "Mon compte")
    private MobileElement myAccountButton;

    @AndroidFindBy(accessibility = "Ok")
    private MobileElement checkPoint;

    @AndroidFindBy(accessibility = "Vos Informations")
    private MobileElement accountInfo;

    @AndroidFindBy(accessibility = "Modifier")
    private MobileElement submitButton;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> formField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayou" +
            "t/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/andro" +
            "id.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    private MobileElement accountView;

    private final String  spaceText = "        ";

    public void clickOnAccountSetting() {
        for (int i = 0; 10 > i; i++) {
            try {
                click(accountView);
                break;
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void clickOnLogOut() {
        click(logOutButton);
        isConnected = 0;
    }

    public void clickOnMyAccount() {
        shortWaitUntil(visibilityOf(logOutButton));
        click(myAccountButton);
    }

    public boolean verifyLogOut() {
        try {
            shortWaitUntil(visibilityOf(logOutButton));
            return logOutButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void homeBack() {
        driver.navigate().back();
    }

    public boolean verifyLogOutText() {
        try {
            shortWaitUntil(visibilityOf(logOutButton));
            return logOutButton.getAttribute("content-desc").contains("out");
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyTextSpelling() {
        try {
            shortWaitUntil(visibilityOf(accountInfo));
            return (accountInfo.isDisplayed() && submitButton.isDisplayed());
        } catch (Exception e) {
            return false;
        }
    }

    public void fillForm() {
        for (int i = 0; 10 > i; i++){
            try{
        fillField(formField, "Noms", spaceText);
                break;}
            catch (Exception e){
                System.out.println(e);
            }}
        for (int i = 0; 10 > i; i++){
            try{
                fillField(formField, "Pr\u00E9nom", spaceText);
                break;}
            catch (Exception e){
                System.out.println(e);
            }}
        for (int i = 0; 10 > i; i++){
            try{
                fillField(formField, "Adresse", spaceText);
                break;}
            catch (Exception e){
                System.out.println(e);
            }}
        for (int i = 0; 10 > i; i++){
            try{
                fillField(formField, "Num\u00E9ro", spaceText);
                break;}
            catch (Exception e){
                System.out.println(e);
            }}
        click(submitButton);
    }

    public boolean verifyModification() {
        try {
            shortWaitUntil(visibilityOf(checkPoint));
            return checkPoint.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


}
