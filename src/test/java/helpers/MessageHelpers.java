package helpers;

import message.NewMessage;
import pages.Message;

public class MessageHelpers extends Message {
    public void message(NewMessage message) {
        message(message.UserName, message.Subject, message.TextMessage);

    }


}
