package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import providers.RandomStringGenerator;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    RandomStringGenerator rndString = new RandomStringGenerator();

    @FindBy(css = "#email_create")
    private WebElement emailFld;

    @FindBy(css = "#SubmitCreate")
    private WebElement createAccountBtn;

    public RegistrationPage openRegistrationPage() {
        sendKeys(emailFld, rndString.generateRandomEmail(5));
        click(createAccountBtn);
        return new RegistrationPage(getDriver());
    }
}
