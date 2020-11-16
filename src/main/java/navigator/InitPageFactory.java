package navigator;

import org.openqa.selenium.WebDriver;
import page.HomePage;
import static org.openqa.selenium.support.PageFactory.initElements;

public class InitPageFactory {
    public static HomePage homePage;

    public static HomePage homePageInit(WebDriver webDriver){
        homePage = initElements(webDriver, HomePage.class);
        return homePage;
    }
}
