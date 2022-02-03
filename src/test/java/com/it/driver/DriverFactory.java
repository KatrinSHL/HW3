package com.it.driver;

import com.it.CommonP.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    static public WebDriver getDriver() {
        WebDriver driver = null;
        String driverName = System.getProperty("driver");
        if (driverName != null) {
            if ("chrome".equals(driverName)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }  else if ("eg".equals(driverName)){
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }
            else {
                throw new UnsupportedOperationException();
            }
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        return driver;

    }
}
