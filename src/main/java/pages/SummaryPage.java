package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends BasePage {

    public SummaryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
    private WebElement summaryPageProceedToCheckOutBtn;

    public AddressPage summaryPageProceedToCheckout() {
        click(summaryPageProceedToCheckOutBtn);
        return new AddressPage(getDriver());
    }
}
