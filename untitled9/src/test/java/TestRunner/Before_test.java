package TestRunner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class Before_test {
    public static WebDriver driver;

    @BeforeTest
    public void Open_Website() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        String Url = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/";
        System.out.println(Url);
        if (Url.equals(expectedURL)) {
            System.out.println("Register Page opened successfully");
        } else {
            System.err.println("error in Open Register page");
        }

    }

    @AfterTest
    public void Close_Website() {

      //driver.quit();
    }
}


