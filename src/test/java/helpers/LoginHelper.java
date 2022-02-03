package helpers;

import Users.User;
import pages.LoginPages;

public class LoginHelper extends LoginPages {
    public void login(User user) {
        login(user.userName, user.password);
    }
}
