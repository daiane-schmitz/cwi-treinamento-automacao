package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Preencheu o e-mail")
    public void fillEmail(){
        email.sendKeys("rrsetcwi+autopractice@gmail.com");
    }

    @Step("Preencheu a senha")
    public void fillPasswd(){
        passwd.sendKeys("teste123");
    }

    @Step("Clicou em Sign In")
    public void clickBtnSubmitLogin(){
        submitLogin.click();
    }

    @Step("Preencheu o e-mail para criar a conta")
    public void fillEmailCreateAcc(){
        emailCreate.sendKeys("aaadduigf@yahoo.com.br");
    }

    @Step("Clicou em Create Account")
    public void clickBtnCreateAccount(){
        btnCreateAccount.click();
    }

    public String getYourPersonalInformation(){
        return yourPersonalInformation.getText();
    }
}
