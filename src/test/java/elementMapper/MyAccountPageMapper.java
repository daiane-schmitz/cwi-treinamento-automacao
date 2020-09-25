package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageMapper {

    @FindBy(css = ".clearfix > span.navigation_page")
    public WebElement myAccount;

}
