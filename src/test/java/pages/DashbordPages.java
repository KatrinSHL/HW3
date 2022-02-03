package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DashbordPages extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbEmailUser;

    @FindBy(xpath = "//div [@class = 'Left']/p [@class = 'make_message']")
    private WebElement btnMessage;


    @FindBy(xpath = "//*[@id='mesgList']/form/div[1]")
    private WebElement read;

    public String getLbEmailUser() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(lbEmailUser));
        return lbEmailUser.getText();
    }

    public void sentMessage() {
        btnMessage.click();

    }

    public void Read() {

        read.click();
    }
}
