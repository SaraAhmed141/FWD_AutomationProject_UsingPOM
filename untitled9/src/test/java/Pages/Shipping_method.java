package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shipping_method {
    private WebDriver driver;

    public Shipping_method(WebDriver driver) {

        this.driver = driver;
    }

    private By Button1 = By.cssSelector("#shippingoption_1");
    private By Button = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    public void Click_continue(){

        driver.findElement(Button1).click();
        driver.findElement(Button).click();
    }
}


