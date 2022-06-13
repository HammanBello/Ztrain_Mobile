package pageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class SubscriptionPage extends Page {

    @AndroidFindBy(className = "android.widget.EditText")
    private List<MobileElement> passwordField;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> mailField;

    @AndroidFindBy(accessibility = "Aller au site")
    private MobileElement readyButton;

    @AndroidFindBy(accessibility = "Continuer")
    private MobileElement submitForm;


    private final String email = "rddsdsdtzyx@fc.om";

    private final String spacePassword = "        ";

    public boolean verifySpacePassword() {
        try {
            shortWaitUntil(visibilityOf(readyButton));
            return readyButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void setEmail() {
//        MobileElement mailFieldu = driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.wid" +
//                "get.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/andr" +
//                "oid.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android" +
//                ".view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
//        mediumWaitUntil(visibilityOf(mailFieldu));
//        mailFieldu.click();
//        mailFieldu.clear();
//        mailFieldu.sendKeys(email);
        for (int i = 0; 10 > i; i++){
            try{
        fillField(mailField,"Email",email);
                break;}
            catch (Exception e){
                System.out.println(e);
            }}
        hideKeyboard();

//        fillField(mailField,"Email exemple@gmail.com",email);


    }

    public void setPassword() {
        for (int i = 0; 10 > i; i++){
            try{
        fillField(passwordField, "Mot de passe", spacePassword);
        fillField(passwordField, "Confirmer le mot de passe", spacePassword);
                break;}
            catch (Exception e){
                System.out.println(e);
            }}
        hideKeyboard();
        click(submitForm);
    }


}
