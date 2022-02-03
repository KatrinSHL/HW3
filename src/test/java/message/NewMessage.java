package message;

public class NewMessage {
public String UserName;
    public String Subject;
    public String TextMessage;

    public NewMessage(String userName, String subject, String textMessage) {
        UserName = userName;
        Subject = subject;
        TextMessage = textMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewMessage that = (NewMessage) o;

        if (UserName != null ? !UserName.equals(that.UserName) : that.UserName != null) return false;
        if (Subject != null ? !Subject.equals(that.Subject) : that.Subject != null) return false;
        return TextMessage != null ? TextMessage.equals(that.TextMessage) : that.TextMessage == null;
    }

    @Override
    public int hashCode() {
        int result = UserName != null ? UserName.hashCode() : 0;
        result = 31 * result + (Subject != null ? Subject.hashCode() : 0);
        result = 31 * result + (TextMessage != null ? TextMessage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NewMessage{" +
                "UserName='" + UserName + '\'' +
                ", Subject='" + Subject + '\'' +
                ", TextMessage='" + TextMessage + '\'' +
                '}';
    }
}
