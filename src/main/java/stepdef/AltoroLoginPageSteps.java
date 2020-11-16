package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigator.WebDriverController;
import pagehandler.HomePageHandler;

public class AltoroLoginPageSteps{
//public WebDriver driver;


    AltoroLoginPageHandler pagehandler = new AltoroLoginPageHandler(WebDriverController.webDriverController);
    HomePageHandler homePageHandler = new HomePageHandler(WebDriverController.webDriverController);



    private void login(String username, String password) {

    }

    @Then("^I should be able to see the home page$")
    public void iShouldBeAbleToSeeTheHomePage() {

    }

    @Given("^I enter user credential and login$")
    public void iEnterUserCredentialAndLogin() {
        login("admin","admin");
    }



    /*@When("^I enter values left number and  right number in calculator$")
    public void iEnterValuesLeftNumberAndRightNumberInCalculator(String x, String y) {
     homePageHandler.enterLeftNumber(x);
        homePageHandler.enterRightNumber(y);

    }*/

    @When("^I enter value \"([^\"]*)\" as left number in calculator$")
    public void iEnterValueAsLeftNumberInCalculator(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageHandler.enterLeftNumber(arg0);
    }

    @When("^I enter value \"([^\"]*)\" as right number in calculator$")
    public void iEnterValueAsRightNumberInCalculator(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageHandler.enterRightNumber(arg0);
    }


    @And("^I Click ‘Calculate’$")
    public void iClickCalculate() throws InterruptedException {
        homePageHandler.clickGoButton();
    }

    @And("^I select \"([^\"]*)\" as the operator$")
    public void iSelectAsTheOperator(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageHandler.selectPlusOperator(arg0);
    }
}

