package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Message extends BasePage {

    @FindBy(xpath = "//span [@class = 'field']/textarea[@name='to']")
    private WebElement inputUserName;
    //span [@class = 'field']
    //textarea[@name='to']

    @FindBy(name = "subject")
    private WebElement inputSubject;


//input [@name = 'subject']

//@FindBy (xpath = "//div/textarea[@name='body']" )

    //  private WebElement fr;

    @FindBy(xpath = "//div/textarea[@name='body']")
    private WebElement inputMessage;
    //div/textarea[@name='body']
    @FindBy(xpath = "//input[@class='bold']")
    private WebElement btnSent;


    public void message(String UserName, String Subject, String TextMessage) {

        inputUserName.clear();
        inputUserName.sendKeys(UserName);
        inputSubject.clear();
        inputSubject.sendKeys(Subject);
        //WebDriver fr = driver.switchTo().frame("wysiwygtext");
        // fr.findElement(By.id("wysiwygtext"));
        //driver.switchTo().defaultContent();

        inputMessage.clear();
        inputMessage.sendKeys(TextMessage);
        btnSent.click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


}




