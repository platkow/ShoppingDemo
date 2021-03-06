package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".login")
    private WebElement signInBtn;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenLink;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    private WebElement summerDressesLink;

    public LoginPage openLoginPage() {
        waitForLoadedPage(signInBtn);
        click(signInBtn);
        return new LoginPage(getDriver());
    }

    public SummerDressesPage openSummerDressesPage() {
        mouseHover(womenLink);
        click(summerDressesLink);
        return new SummerDressesPage(getDriver());
    }
}
