package pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    static protected MyDriver driver= MyDriver.getMyDriver();
   public BasePage(){PageFactory.initElements(driver, this);}
//    static {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.i.ua/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.navigate().refresh();




//    public BasePage() {
//        PageFactory.initElements(driver, this);
//    }
}



