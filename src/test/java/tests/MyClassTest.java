package tests;


import message.NewMessage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashbordPages;
import pages.LoginPages;

import java.util.concurrent.TimeUnit;

public class MyClassTest extends BaseTest {
    @Test
    public void test1() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLbEmailUser(), validUser.email);
        app.dashboard.sentMessage();

    }

    @Test
    public void test2()  {
        app.message.message(MText);

    }

    @Test
    public void test3() {
        app.happy.RMessage();
        app.dashboard.Read();

    }

    @Test
    public void test4() {
        app.email.BodyM(GText);
        Assert.assertEquals(MText, GText);


    }


}
