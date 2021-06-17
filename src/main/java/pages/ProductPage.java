package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import providers.RandomIntGenerator;

public class ProductPage extends BasePage {
    RandomIntGenerator rnd = new RandomIntGenerator();

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#add_to_cart")
    private WebElement addToCartBtn;

    @FindBy(css = ".btn.btn-default.button.button-medium")
    private WebElement productPageProceedToCheckOutBtn;

    @FindBy(css = "#group_1")
    private WebElement sizes;

    @FindBy(css = ".span_link.no-print")
    private WebElement viewLargerProductBtn;

    @FindBy(css = ".fancybox-item.fancybox-close")
    private WebElement viewLargerCloseBtn;

    public ProductPage zoomProduct() {
        click(viewLargerProductBtn);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(viewLargerCloseBtn);
        return new ProductPage(getDriver());
    }

    public void changeSize() {
        Select availableSizes = new Select(sizes);
        availableSizes.selectByVisibleText(rnd.getRandomSize());
    }

    public ProductPage addProductToCart() {
        changeSize();
        click(addToCartBtn);
        return new ProductPage(getDriver());
    }

    public SummaryPage productPageProceedToCheckout() {
        click(productPageProceedToCheckOutBtn);
        return new SummaryPage(getDriver());
    }
}
