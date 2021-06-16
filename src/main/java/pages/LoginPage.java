package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#email_create")
    private WebElement emailField;

    @FindBy(css = "#SubmitCreate")
    private WebElement createAccountBtn;

    public RegistrationPage openRegistrationPage(){
        sendKeys(emailField, "kasssqaia@wp.pl");
        click(createAccountBtn);
        return new RegistrationPage(getDriver());
    }

    /*private String randomEmailGenerator(){
        //tu kontynuuj
    }*/

}
