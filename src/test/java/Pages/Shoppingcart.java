package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shoppingcart {

    private WebDriver driver;

    public Shoppingcart(WebDriver driver) {
        this.driver = driver;
    }

    public By Cart = By.xpath("//span[contains(text(),'Shopping cart')]");

    public void Open_Cart() {

        driver.findElement(Cart).click();
    }

}
