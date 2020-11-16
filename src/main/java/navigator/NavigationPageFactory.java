package navigator;

import configdefinition.PageTypeConfig;
import org.openqa.selenium.WebDriver;
import static navigator.WebDriverController.webDriverController;
import static navigator.InitPageFactory.*;
import static stepdef.CucumberTestHook.*;
import static org.openqa.selenium.support.PageFactory.initElements;


public class NavigationPageFactory {
  public static String baseURL = "https://calculator-web.azurewebsites.net/";

  public static void navigateToLoginPage(WebDriver webDriver){
      webDriver.get(baseURL);
  }

  public static void navigateToPage(WebDriver webDriver, PageTypeConfig pageType) {

    switch (pageType) {

        case LOGIN_PAGE:
            navigateToLoginPage(webDriver);
            break;
    }
  }
}
