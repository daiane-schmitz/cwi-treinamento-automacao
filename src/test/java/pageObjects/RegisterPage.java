package pageObjects;

import elementMapper.RegisterPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class RegisterPage extends RegisterPageElementMapper {

    public RegisterPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextAuthentication(){
        return authentication.getText();
    }

    public boolean isCreateAccountPage(){
        return getTextAuthentication().equals("Authentication");
    }

    public void selectGenderMale(){
        genderMale.click();
    }

    public void selectGenderFemale(){
        genderFemale.click();
    }

    public void fillFirstName(){
        firstName.sendKeys("Daiane");
    }

    public void fillLastName(){
        lastName.sendKeys("Schmitz");
    }

    public void fillPasswd(){
        passwd.sendKeys("teste");
    }

    public void selectDayBirth(){
        Select selectStateElement = new Select(dayBirth);
        selectStateElement.selectByValue("22");
    }

    public void selectMonthBirth(){
        Select selectStateElement = new Select(monthBirth);
        selectStateElement.selectByValue("4");
    }

    public void selectYearBirth(){
        Select selectStateElement = new Select(yearBirth);
        selectStateElement.selectByValue("1990");
    }

    public void selectSignUpForNewsletter(){
        newsletter.click();
    }

    public void selectReceiveSpecialOffers(){
        specialOffers.click();
    }

    public void fillCompany(){
        company.sendKeys("CWI");
    }

    public void fillAddress(){
        address.sendKeys("Rua dos Bobos");
    }

    public void fillAddressCont(){
        addressCont.sendKeys("continuação");
    }

    public void fillCity(){
        city.sendKeys("Cidade");
    }

    public void selectState(){
        Select selectStateElement = new Select(state);
        selectStateElement.selectByValue("2");
    }
    public void fillPostcode(){
        postcode.sendKeys("01234");
    }

    public void selectCountry(){
        Select selectStateElement = new Select(country);
        selectStateElement.selectByValue("21");
    }

    public void fillAdditionalInformation(){
        additionalInformation.sendKeys("blabla");
    }

    public void fillPhoneHome(){
        phone_home.sendKeys("5904804851");
    }

    public void fillPhoneMobile(){
        phone_mobile.sendKeys("9548519818");
    }

    public void fillAddressAlias() {
        addresAlias.clear();
        addresAlias.sendKeys("Casa");
    }

    public void clickBtnRegister(){
        btnRegister.click();
    }
}
