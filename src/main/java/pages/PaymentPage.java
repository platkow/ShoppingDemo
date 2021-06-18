package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentPage extends BasePage {
    private static Logger logger = LoggerFactory.getLogger(PaymentPage.class);

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
        String orderStatus = "";
        try {
            orderStatus = orderStatusMsg.getText();
            logger.info("Order status: " + orderStatus);
            return orderStatus;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Order status was not available.");
            return null;
        }
    }
}
