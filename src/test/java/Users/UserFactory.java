package Users;

import java.util.ResourceBundle;

public class UserFactory {
    static ResourceBundle user = ResourceBundle.getBundle("user");
    static public User getValidUser(){
      return new User(
              user.getString("userName"),
              user.getString("password"),
              user.getString("email")

              )  ;
    }
}
