package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private WebDriver driver;
    //private static Logger logger = LoggerFactory.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void click(WebElement element){
        //logger.debug("Clicking on element: " + element);
        element.click();
    }

    public void sendKeys(WebElement element, String text){
        element.sendKeys(text);
        //logger.debug("Sending text: " + text + " to element: " + element);
    }
}
