package tests;

import models.User;
import org.junit.jupiter.api.BeforeEach;
import pages.LoginPage;
import pages.MenuPage;
import pages.RegistrationPage;
import pages.UserAccountPage;
import testBase.TestBase;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingTest extends TestBase {
    private static Logger logger = LoggerFactory.getLogger(ShoppingTest.class);
    private MenuPage menuPage;
    private User user;

    @BeforeEach
    public void setup(){
        menuPage = new MenuPage(driver);
        user = new User("Jank", "Kowalskki", "Bazkkka123", "5", "5", "1988",
                "IMB", "Krakowska 52 St.",
                "LA", "California", "12300", "United States", "123456987", "Home address");
    }


    @Test
    public void shouldBuyProduct(){
        logger.info(">>>>>>>>>>   Start test   >>>>>>>>>>");

        menuPage.openLoginPage()
                .openRegistrationPage()
                .registerNewUser(user)
                .goBackToMainMenu();


        String actualTitle = driver.getTitle();
        String expectedTitle = System.getProperty("eTitle");
        assertThat(expectedTitle, equalTo(actualTitle));
    }
}
