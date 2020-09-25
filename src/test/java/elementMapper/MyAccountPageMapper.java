package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageMapper {

    @FindBy(css = "#center_column > h1")
    public WebElement myAccountTitle;

}
