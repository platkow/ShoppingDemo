package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import providers.RandomIntGenerator;

import java.util.List;

public class SummerDressesPage extends BasePage {
    RandomIntGenerator rnd = new RandomIntGenerator();

    public SummerDressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-container:not(.layer_cart_img)")
    private List<WebElement> products;

    public ProductPage openProductPage() {
        click(products.get(rnd.generateRandomIndex(products.size())));
        return new ProductPage(getDriver());
    }
}
