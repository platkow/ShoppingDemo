package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".login")
    private WebElement signInBtn;

    public LoginPage openLoginPage(){
        click(signInBtn);
        return new LoginPage(getDriver());
    }
}
