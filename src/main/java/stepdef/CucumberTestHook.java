package stepdef;

import navigator.InitPageFactory;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class CucumberTestHook {
    public static WebDriver driver;
    public static String URL;

    @Before(order = 1)
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:/code/WP/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver .manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        initAllpages();
    }
    public void initAllpages()
    {
        InitPageFactory.homePageInit(driver);

    }
    public void Logout()
    {
        //AltoroLoginPageHandler pageHandler = new AltoroLoginPageHandler(driver);
       // pageHandler.clickLogOutButton();

    }
}
