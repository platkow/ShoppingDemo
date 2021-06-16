package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#id_gender1")
    private WebElement genderMaleRadio;

    @FindBy(css = "#customer_firstname")
    private WebElement customerFirstName;

    @FindBy(css = "#customer_lastname")
    private WebElement customerLastName;

    @FindBy(css = "#passwd")
    private WebElement password;

    @FindBy(css = "#days")
    private WebElement days;

    @FindBy(css = "#months")
    private WebElement months;

    @FindBy(css = "#years")
    private WebElement years;

    @FindBy(css = "#company")
    private WebElement company;

    @FindBy(css = "#address1")
    private WebElement address;

    @FindBy(css = "#city")
    private WebElement city;

    @FindBy(css = "#id_state")
    private WebElement states;

    @FindBy(css = "#postcode")
    private WebElement postcode;

    @FindBy(css = "#id_country")
    private WebElement country;

    @FindBy(css = "#phone_mobile")
    private WebElement mobilePhone;

    @FindBy(css = "#alias")
    private WebElement addressAlias;

    @FindBy(css = "#submitAccount")
    private WebElement submitAccountBtn;



    public UserAccountPage registerNewUser(User user){
        genderMaleRadio.click();
        customerFirstName.sendKeys(user.getCustomerFirstName());
        customerLastName.sendKeys(user.getCustomerLastName());
        password.sendKeys(user.getPassword());

        Select selectDay = new Select(days);
        selectDay.selectByValue(user.getDayOfBirth());

        Select selectMonth = new Select(months);
        selectMonth.selectByValue(user.getMonthOfBirth());

        Select selectYear = new Select(years);
        selectYear.selectByValue(user.getYearOfBirth());

        company.sendKeys(user.getCompany());
        address.sendKeys(user.getAddress());
        city.sendKeys(user.getCity());

        Select stateSelect = new Select(states);
        stateSelect.selectByVisibleText(user.getState());

        postcode.sendKeys(user.getPostalCode());

        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText(user.getCountry());

        mobilePhone.sendKeys(user.getMobilePhone());

        addressAlias.clear();
        addressAlias.sendKeys(user.getAddressAlias());
        submitAccountBtn.click();

        return new UserAccountPage(getDriver());
    }

    private WebElement getRandomElement(List<WebElement> elements) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements.size());
        return elements.get(randomNumber);
    }




}
