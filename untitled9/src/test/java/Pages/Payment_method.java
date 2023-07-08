package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment_method {
    private WebDriver driver;

    public Payment_method(WebDriver driver) {

        this.driver = driver;
    }

    private By Button1 = By.cssSelector("#paymentmethod_1");
    private By Button = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    public void Payment_meth(){

        driver.findElement(Button1).click();
        driver.findElement(Button).click();
    }
}

