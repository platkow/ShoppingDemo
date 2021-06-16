package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebListener extends AbstractWebDriverEventListener {
    Logger logger = LoggerFactory.getLogger(WebListener.class);

    public void beforeClickOn(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>> Before clicking on element: " + element.getText() + " <<<<<<<<<<<");
    }

    public void beforeGetText(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>> Before getting text form element: " + element.getText() + " <<<<<<<<<<<");
    }

    //pomysl czy dodać after
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        logger.info(">>>>>>>>>>> Before changing value of element: " + element.getText() + " <<<<<<<<<<<");
    }
}
