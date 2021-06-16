package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#add_to_cart")
    private WebElement addToCartBtn;

    @FindBy(css = ".btn.btn-default.button.button-medium")
    private WebElement proceedToCheckOutBtn;

    public ProductPage addProductToCart(){
        click(addToCartBtn);
        return new ProductPage(getDriver());
    }

    public SummaryPage productPageProceedToCheckout(){
        click(proceedToCheckOutBtn);
        return new SummaryPage(getDriver());
    }
}
