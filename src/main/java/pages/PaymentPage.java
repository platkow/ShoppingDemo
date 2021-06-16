package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import providers.RandomIntGenerator;

import java.util.List;

public class PaymentPage extends BasePage{
    RandomIntGenerator rnd = new RandomIntGenerator();

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".payment_module")
    private List<WebElement> paymentMethods;

    @FindBy(css = "button.btn.btn-default.button-medium")
    private WebElement confirmOrderBtn;

    @FindBy(css = ".cheque-indent")
    private WebElement orderStatus;

    public PaymentPage choosePaymentMethod(){
        paymentMethods.get(rnd.generateRandomIndex(paymentMethods.size()));
        return new PaymentPage(getDriver());
    }

    public void conformOrder(){
        click(confirmOrderBtn);
    }

    public String getOrderStatus(){
        return orderStatus.getText();
    }
}
