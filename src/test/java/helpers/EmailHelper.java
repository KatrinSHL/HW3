package helpers;


import message.NewMessage;
import pages.EmailPage;

public class EmailHelper extends EmailPage {
public void BodyM(NewMessage message){
   setBody(message.UserName, message.Subject, message.TextMessage);
}



}
