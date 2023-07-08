package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Returning_Customer {
    private WebDriver driver;

    public Returning_Customer(WebDriver driver) {
        this.driver = driver;
    }
    private By Email1 = By.cssSelector("#Email");
    private By Pass = By.cssSelector("#Password");
    private By Login = By.xpath("//button[contains(text(),'Log in')]");
    public void ReturningCustomer(String Email,String Password) {

        driver.findElement(Email1).sendKeys(Email);
        driver.findElement(Pass).sendKeys(Password);
        driver.findElement(Login).click();

    }
}
