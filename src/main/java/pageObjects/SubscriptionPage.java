package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SubscriptionPage extends Page {

    @AndroidFindBy(className = "android.widget.EditText")
    private List<MobileElement> passwordField;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> mailField;

    @AndroidFindBy(accessibility = "Aller au site")
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
        mailField = driver.findElements(By.className("android.widget.ImageView"));
        for (int i = 0; i < mailField.size(); i++) {
            shortWaitUntil(visibilityOf(mailField.get(i)));
            System.out.println(mailField.get(i).getText());
            if (mailField.get(i).getText().equals("Email")) {
                System.out.println(mailField.get(i).getText());
                mailField.get(i).click();
                System.out.println(mailField.get(i).getText());
                mailField.get(i).clear();
                mailField.get(i).sendKeys(email);
                break;
            }
        }
      hideKeyboard();
//        fillField(mailField,"Email",email);
//        fillField(mailField,"Email exemple@gmail.com",email);



    }

    public void setPassword(){
        fillField(passwordField,"Mot de passe",spacePassword);
        fillField(passwordField,"Confirmer le mot de passe",spacePassword);
        hideKeyboard();
        click(submitForm);
    }




}
