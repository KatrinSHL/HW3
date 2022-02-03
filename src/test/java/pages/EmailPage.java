package pages;


import message.NewMessage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePage{
    @FindBy(xpath = "//div[@class='field_value']/b")
    private WebElement name;

    @FindBy (xpath = "//div[@class='message_header clear']/h3")
    private WebElement header;

    @FindBy (xpath = "//div[@class='message_body']")
    private WebElement body;

    public NewMessage setBody(String UserName, String Subject, String TextMessage){
               return new NewMessage(name.getText(),header.getText(), body.getText());
    }

}
