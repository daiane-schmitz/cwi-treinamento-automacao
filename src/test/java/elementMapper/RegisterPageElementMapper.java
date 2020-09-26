package elementMapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageElementMapper {

    @FindBy(css = "#columns > div.breadcrumb.clearfix > span.navigation_page")
    public WebElement authentication;

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

    @FindBy(id = "days")
    public WebElement dayBirth;

    @FindBy(id = "months")
    public WebElement monthBirth;

    @FindBy(id = "years")
    public WebElement yearBirth;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "optin")
    public WebElement specialOffers;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "address2")
    public WebElement addressCont;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "other")
    public WebElement additionalInformation;

    @FindBy(id = "phone")
    public WebElement phone_home;

    @FindBy(id = "phone_mobile")
    public WebElement phone_mobile;

    @FindBy(id = "alias")
    public WebElement addresAlias;

    @FindBy(id = "submitAccount")
    public WebElement btnRegister;

}
