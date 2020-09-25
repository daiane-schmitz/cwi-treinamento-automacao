package pageObjects;

import elementMapper.MyAccountPageMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageMapper {

    MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);

    }

    public void getMyAccountTitle(){
        myAccountTitle.getText();
    }
}
