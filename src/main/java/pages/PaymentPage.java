package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".cheque")
    private WebElement paymentByCheckBtn;

    @FindBy(css = "button.btn.btn-default.button-medium")
    private WebElement confirmOrderBtn;

    @FindBy(css = ".alert.alert-success")
    private WebElement orderStatusMsg;

    public PaymentPage payByCheck() {
        click(paymentByCheckBtn);
        return new PaymentPage(getDriver());
    }

    public void conformOrder() {
        click(confirmOrderBtn);
    }

    public String getOrderStatusMsg() {
        return orderStatusMsg.getText();
    }
}
