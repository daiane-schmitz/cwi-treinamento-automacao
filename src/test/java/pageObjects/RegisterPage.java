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

    public void fillPhoneMobile(){
        phone_mobile.sendKeys("9548519818");
    }

}
