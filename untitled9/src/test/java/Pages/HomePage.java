package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.junit.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private By registerbutton = By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(1) > a.ico-register");

    private By registertext = By.xpath("//h1[contains(text(),'Register')]");
    public void register(){
   WebElement register_Button = driver.findElement(registerbutton);
        register_Button.click();

    }

    public void registerText(){

        String actualString = driver.findElement(registertext).getText();
        assertEquals("Register",actualString);
        System.out.println("True");
    }

}
