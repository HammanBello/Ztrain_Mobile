package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class FavorisPage extends Page{

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android" +
            ".view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
    private MobileElement favorisView;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View" +
            "/android.view.View/android.view.View/android.widget.ImageView[3]")
    private MobileElement accountView;

    @AndroidFindBy(accessibility = "Favoris")
    private MobileElement favorisProof;

            public void clickOnFavoris(){
        click(favorisView);
    }

    public boolean verifyFavorisContain(){
        try{
            shortWaitUntil(visibilityOf(accountView));
            return mediumWaitUntil(visibilityOf(favorisProof));
        }catch (Exception e){
            return false;
        }
    }

}
