package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccountPage extends BasePage {

    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Home']")
    private WebElement homeBtn;

    public MenuPage goBackToMainMenu() {
        waitForLoadedPage(homeBtn);
        click(homeBtn);
        return new MenuPage(getDriver());
    }
}
