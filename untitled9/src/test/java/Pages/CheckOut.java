package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOut {
    private WebDriver driver;

    public CheckOut(WebDriver driver) {
        this.driver = driver;
    }

    private By Shoppingcart = By.cssSelector("#termsofservice");
    private By Shoppingcart1 = By.cssSelector("#checkout");

    public void CheckOut_Page() {

        driver.findElement(Shoppingcart).click();
        driver.findElement(Shoppingcart1).click();

    }
}