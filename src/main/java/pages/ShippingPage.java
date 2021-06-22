package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends BasePage {
    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.btn.btn-default.standard-checkout.button-medium")
    private WebElement shippingPageProceedToCheckOutBtn;

    @FindBy(css = "#cgv")
    private WebElement termsOfServiceCbx;

    public PaymentPage shippingPageProceedToCheckOut() {
        selectCbx(termsOfServiceCbx);
        System.out.println("Marking checkobox success!");
        click(shippingPageProceedToCheckOutBtn);
        return new PaymentPage(getDriver());
    }
}
