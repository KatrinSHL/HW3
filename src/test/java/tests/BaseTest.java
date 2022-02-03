package tests;

import Users.User;
import Users.UserFactory;
import com.it.App;
import message.NewMessage;
import message.UserMessage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User validUser = UserFactory.getValidUser();
    static NewMessage MText = UserMessage.newMessage();
    static NewMessage GText = UserMessage.newMessage();

    @AfterSuite
    public void afterSuit() {
        app.close();
    }
}
