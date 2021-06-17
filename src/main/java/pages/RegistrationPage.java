package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#id_gender1")
    private WebElement genderMaleRadio;

    @FindBy(css = "#customer_firstname")
    private WebElement customerFirstNameFld;

    @FindBy(css = "#customer_lastname")
    private WebElement customerLastNameFld;

    @FindBy(css = "#passwd")
    private WebElement passwordFld;

    @FindBy(css = "#days")
    private WebElement days;

    @FindBy(css = "#months")
    private WebElement months;

    @FindBy(css = "#years")
    private WebElement years;

    @FindBy(css = "#company")
    private WebElement companyFld;

    @FindBy(css = "#address1")
    private WebElement addressFld;

    @FindBy(css = "#city")
    private WebElement cityFld;

    @FindBy(css = "#id_state")
    private WebElement states;

    @FindBy(css = "#postcode")
    private WebElement postcodeFld;

    @FindBy(css = "#id_country")
    private WebElement country;

    @FindBy(css = "#phone_mobile")
    private WebElement mobilePhoneFld;

    @FindBy(css = "#alias")
    private WebElement addressAliasFld;

    @FindBy(css = "#submitAccount")
    private WebElement submitAccountBtn;


    public UserAccountPage registerNewUser(User user) {
        click(genderMaleRadio);
        sendKeys(customerFirstNameFld, user.getCustomerFirstName());
        sendKeys(customerLastNameFld, user.getCustomerLastName());
        sendKeys(passwordFld, user.getPassword());

        Select selectDay = new Select(days);
        selectDay.selectByValue(String.valueOf(user.getDayOfBirth()));

        Select selectMonth = new Select(months);
        selectMonth.selectByValue(String.valueOf(user.getMonthOfBirth()));

        Select selectYear = new Select(years);
        selectYear.selectByValue(String.valueOf(user.getYearOfBirth()));

        sendKeys(companyFld, user.getCompany());
        sendKeys(addressFld, user.getAddress());
        sendKeys(cityFld, user.getCity());

        Select stateSelect = new Select(states);
        stateSelect.selectByValue(String.valueOf(user.getState()));

        sendKeys(postcodeFld, String.valueOf(user.getPostalCode()));

        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText(user.getCountry());

        sendKeys(mobilePhoneFld, String.valueOf(user.getMobilePhone()));
        addressAliasFld.clear();
        sendKeys(addressAliasFld, user.getAddressAlias());
        click(submitAccountBtn);

        return new UserAccountPage(getDriver());
    }
}
