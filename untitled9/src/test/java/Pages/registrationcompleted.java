package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class registrationcompleted {
    private WebDriver driver;

    public registrationcompleted(WebDriver driver) {
        this.driver = driver;
    }

    private By Regmessage = By.xpath("//div[contains(text(),'Your registration completed')]");
    private By continue_button = By.xpath("//a[contains(text(),'Continue')]");

    public void Message() throws InterruptedException {

        WebElement Success_Message = driver.findElement(Regmessage);
        String stylcolor = Success_Message.getCssValue("color");
        System.out.println(stylcolor);

        String hexcolor = Color.fromString(stylcolor).asHex();
        System.out.println(hexcolor);

        if(hexcolor.equals("#4cb17c")){
            System.out.println("the color of this message is Green ");
        }else {
            System.out.println("the color of this message is NOT Green ");
        }

        Thread.sleep(5000);
    }

    public void contains_Button(){

       WebElement Click_button = driver.findElement(continue_button);
        Click_button.click();


    }
}
