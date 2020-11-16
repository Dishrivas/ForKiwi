package pagehandler;

import org.eclipse.jetty.websocket.common.extensions.compress.XWebkitDeflateFrameExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static navigator.InitPageFactory.*;

public class HomePageHandler {
    protected WebDriver wDriver;
    private WebDriverWait wait;

    public HomePageHandler(WebDriver wDriver){
        this.wDriver = wDriver;

    }


    public void enterLeftNumber(String i)
    {
        if (homePage.getleftNumber().isEnabled()) {
            homePage.getleftNumber().clear();
            homePage.getleftNumber().sendKeys(i);
        }

    }
    public void enterRightNumber(String i)
    {
       if (homePage.getrightNumber().isEnabled()){
           homePage.getrightNumber().clear();
           homePage.getrightNumber().sendKeys(i);
       }
    }

    public void clickGoButton() throws InterruptedException {
        //
        this.wDriver.switchTo().frame(0);
        homePage.getGoButton().click();
        Thread.sleep(3000);
        this.wDriver.switchTo().defaultContent();

    }
    public void selectPlusOperator(String S)
    {
        homePage.SelectOperatorDropdown(S);
    }
}
