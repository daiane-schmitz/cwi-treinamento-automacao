package pageObjects;

import elementMapper.MyAccountPageMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);

    }

    public String getTextMyAccount(){
        return myAccount.getText();
    }

    public boolean isMyAccountPage(){
        return getTextMyAccount().equals("My account");
    }
}
