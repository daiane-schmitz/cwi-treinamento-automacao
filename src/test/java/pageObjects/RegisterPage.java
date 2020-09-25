package pageObjects;

import elementMapper.RegisterPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class RegisterPage extends RegisterPageElementMapper {

    public RegisterPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
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
        dayBirth.click();
    }

    public void selectMonthBirth(){
        monthBirth.click();
    }

    public void selectYearBirth(){
        yearBirth.click();
    }

    public void selectSignUpForNewsletter(){
        newsletter.click();
    }

    public void selectReceiveSpecialOffers(){
        specialOffers.click();
    }

    public void fillAddress(){
        address.sendKeys("Rua dos Bobos");
    }

    public void fillCity(){
        city.sendKeys("Cidade");
    }

    public void selectState(){
        stateAlaska.click();
    }

    public void fillPostcode(){
        postcode.sendKeys("01234");
    }

    public void selectCountry(){
        countryUSA.click();
    }

    public void fillAdditionalInformation(){
        additionalInformation.sendKeys("blabla");
    }


    public void fillPhoneMobile(){
        phone_mobile.sendKeys("9548519818");
    }

    public void clickBtnRegister(){
        btnRegister.click();
    }
}
