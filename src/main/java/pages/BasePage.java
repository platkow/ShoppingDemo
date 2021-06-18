package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static Logger logger = LoggerFactory.getLogger(BasePage.class);
    private WebDriver driver;
    private EventFiringMouse eventFiringMouse;
    protected WebListener listener;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void click(WebElement element) {
        getElement(element);
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        getElement(element);
        logger.info("######## Sending text: " + text + " to element: " + element.getTagName());
        element.clear();
        element.sendKeys(text);
    }

    public void selectCbx(WebElement element) {
        logger.info("######## Select element: " + element.getTagName() + " " + element.getText());
        if (!element.isSelected()) {
            element.click();
        }
    }

    public void mouseHover(WebElement element) {
        logger.info("######## mouseHover perform on the object: " + element.getText());
        eventFiringMouse = new EventFiringMouse(driver, listener);
        Locatable item = (Locatable) element;
        Coordinates coordinates = item.getCoordinates();
        eventFiringMouse.mouseMove(coordinates);
    }

    public WebElement getElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        logger.info("######### Checking if element: " + element.getTagName() + " " + element.getText() + " is present.");
        return element;
    }
}
