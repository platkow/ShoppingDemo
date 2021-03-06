package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage {
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.btn.btn-default.button-medium")
    private WebElement addressPageProceedToCheckOutBtn;

    public ShippingPage addressPageProceedToCheckOut() {
        click(addressPageProceedToCheckOutBtn);
        return new ShippingPage(getDriver());
    }
}
