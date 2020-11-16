package page;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    @FindBy(id = "calculate")
    private WebElement GoButton;
    @FindBy(id = "leftNumber")
    private WebElement leftNumberField;
    @FindBy(id = "rightNumber")
    private WebElement rightNumberField;
    @FindBy(css = "input.result")
    private WebElement resultField;
    @FindBy(id = "operator")
    private WebElement operatorDropdown;

    public WebElement getleftNumber() { return leftNumberField;}
    public WebElement getrightNumber() { return rightNumberField;}

    public WebElement getGoButton() { return GoButton;}
    public WebElement getOperatorDropdown() { return operatorDropdown;}

    public void SelectOperatorDropdown(String operator){
        Select s = new Select(getOperatorDropdown());
        switch (operator) {
            case "+":
                s.selectByValue("+");
                break;
            case "-":
                s.selectByValue("-");
                break;
            case "*":
                s.selectByValue("*");
                break;
            case "/":
                s.selectByValue("/");
                break;
        }
        }
    }



