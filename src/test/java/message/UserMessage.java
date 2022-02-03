package message;

import javafx.scene.input.Clipboard;

import java.util.ResourceBundle;

public class UserMessage {

    static ResourceBundle message = ResourceBundle.getBundle("message");

    static public NewMessage newMessage() {
        return new NewMessage(
                message.getString("UserName"),
                message.getString("Subject"),
                message.getString("TextMessage")
        );
    }


}
