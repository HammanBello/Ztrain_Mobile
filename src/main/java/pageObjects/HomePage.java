package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage extends Page {

    @AndroidFindBy(accessibility = "Wireless Controller for PS4™ €64.99")
    private MobileElement pantItem;

    @AndroidFindBy(className = "android.view.View")
    private List<MobileElement> item;

    @AndroidFindBy(accessibility = "Ajouter au panier")
    private MobileElement addToCart;

    @AndroidFindBy(accessibility = "Panier mise à jours")
    private MobileElement cartNotification;

    @AndroidFindBy(accessibility = "Allez au site")
    private MobileElement readyButton;

    public void goToHomeboard(){
        click(readyButton);
    }

    public void selectItem(){
        scrollClick("Wireless Controller for PS4™ €64.99");
        actOnElementList(item, "Wireless Controller for PS4™ €64.99");
    }

    public void addItemToCart(){
        click(addToCart);
    }

    public boolean verifyNotification(){
        try{
            shortWaitUntil(visibilityOf(cartNotification));
            return cartNotification.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}
