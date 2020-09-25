package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "SubmitLogin")
    public WebElement submitLogin;

    @FindBy(id = "email_create")
    public WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    public WebElement btnCreateAccount;

    @FindBy(css = "#account-creation_form > div:nth-child(1) > h3")
    public WebElement yourPersonalInformation;

}
