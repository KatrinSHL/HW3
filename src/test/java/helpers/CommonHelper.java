package helpers;

import pages.BasePage;

public class CommonHelper extends BasePage {
    public void closeApp() {
        driver.quit();
    }
}
