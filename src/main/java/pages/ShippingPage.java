package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends BasePage{
    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.btn.btn-default.standard-checkout.button-medium")
    private WebElement proceedToCheckOutBtn;

    @FindBy(css = "#cgv")
    private WebElement termsOfServiceCbx;

    public PaymentPage shippingPageProceedToCheckOut(){
        select(termsOfServiceCbx);
        click(proceedToCheckOutBtn);
        return new PaymentPage(getDriver());
    }
}
