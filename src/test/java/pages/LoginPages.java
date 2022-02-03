package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPages extends BasePage {
    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@tabindex = '5']")
    private WebElement btnLogin;


    public void login(String login, String password) {
       driver.scrollDown();
       try {
           Thread.sleep(2000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
        inputLogin.clear();
        inputLogin.sendKeys(login);
        inputPassword.clear();
        inputPassword.sendKeys(password);
        btnLogin.click();
        driver.takeSnapShot();


    }


}
