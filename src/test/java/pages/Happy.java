package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Happy extends BasePage {

    @FindBy(xpath = "//li[@class='new']")
    private WebElement ref;

    public void RMessage() {

        ref.click();
    }
}
