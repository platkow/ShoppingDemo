package tests;

import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.MenuPage;
import pages.PaymentPage;
import providers.UserFactory;
import testBase.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingTest extends TestBase {
    private static Logger logger = LoggerFactory.getLogger(ShoppingTest.class);
    private MenuPage menuPage;
    private PaymentPage paymentPage;
    private User user;

    @BeforeEach
    public void setup() {
        menuPage = new MenuPage(driver);
        paymentPage = new PaymentPage(driver);
        user = new UserFactory().getRandomUser();
    }

    @Test
    public void shouldBuyProduct() {
        logger.info(">>>>>>>>>>   Start test   >>>>>>>>>>");

        menuPage.openLoginPage()
                .openRegistrationPage()
                .registerNewUser(user)
                .goBackToMainMenu()
                .openSummerDressesPage()
                .openProductPage()
                .addProductToCart()
                .productPageProceedToCheckout()
                .summaryPageProceedToCheckout()
                .addressPageProceedToCheckOut()
                .shippingPageProceedToCheckOut()
                .choosePaymentMethod()
                .conformOrder();

        String actualOrderStatus = paymentPage.getOrderStatus();
        String expectedOrderStatus = System.getProperty("eStatus");
        assertThat(actualOrderStatus, equalTo(expectedOrderStatus));
    }
}
