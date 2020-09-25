package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageElementMapper {

    @FindBy(id = "uniform-id_gender1")
    public WebElement genderMale;

    @FindBy(id = "uniform-id_gender2")
    public WebElement genderFemale;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(css = "#days > option:nth-child(23)")
    public WebElement dayBirth;

    @FindBy(css = "#months > option:nth-child(5)")
    public WebElement monthBirth;

    @FindBy(css = "#years > option:nth-child(32)")
    public WebElement yearBirth;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "optin")
    public WebElement specialOffers;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "address2")
    public WebElement addressCont;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(css = "#id_state > option:nth-child(3)")
    public WebElement stateAlaska;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(css = "#id_country > option:nth-child(2)")
    public WebElement countryUSA;

    @FindBy(id = "other")
    public WebElement additionalInformation;

    @FindBy(id = "phone")
    public WebElement phone_home;

    @FindBy(id = "phone_mobile")
    public WebElement phone_mobile;

    @FindBy(id = "submitAccount")
    public WebElement btnRegister;

}
