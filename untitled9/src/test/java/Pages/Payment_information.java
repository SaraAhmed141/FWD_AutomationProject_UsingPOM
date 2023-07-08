package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Payment_information {
    private WebDriver driver;

    public Payment_information(WebDriver driver) {

        this.driver = driver;
    }

    private By Selectcreditcard = By.cssSelector("#CreditCardType");
    private By Cardholder  = By.cssSelector("#CardholderName");
    private By Cardnumber = By.cssSelector("#CardNumber");
    private By Expirationdate = By.cssSelector("#ExpireMonth");
    private By Expirationyear = By.cssSelector("#ExpireYear");
    private By Cardcode = By.cssSelector("#CardCode");
    private By Button = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    private By Button7 = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/button[1]");
    private By Button3 = By.linkText("Click here for order details.");
    public void Payment_info(String Card,String Cardnum,String Code){

        Select dropdown1 = new Select(driver.findElement(Selectcreditcard));
        dropdown1.selectByValue("MasterCard");

        driver.findElement(Cardholder).sendKeys(Card);
        driver.findElement(Cardnumber).sendKeys(Cardnum);

        Select dropdown2 = new Select(driver.findElement(Expirationdate));
        dropdown2.selectByValue("2");

        Select dropdown3 = new Select(driver.findElement(Expirationyear));
        dropdown3.selectByValue("2027");

        driver.findElement(Cardcode).sendKeys(Code);
        driver.findElement(Button).click();

    }
    public void ContiunsButton6() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(Button7).click();
    }

    public void ContiunsButton3() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(Button3).click();
    }
}

