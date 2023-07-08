
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By CheckList = By.cssSelector("#gender-female");
    private By Fname = By.cssSelector("#FirstName");
    private By Lname = By.cssSelector("#LastName");

    private By Day = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    private By Month = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    private By Year = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");

    private By mail = By.cssSelector("#Email");
    private By CompName = By.cssSelector("#Company");
    private By Pass = By.cssSelector("#Password");
    private By Cpass = By.cssSelector("#ConfirmPassword");
    private By Submit = By.cssSelector("#register-button");

    public void register_Form(String Firstname,String Lastname,String Email ,String Companyname, String Password,String Confirmpassword) {
        WebElement Check = driver.findElement(CheckList);
            Check.click();

        driver.findElement(Fname).sendKeys(Firstname);
        driver.findElement(Lname).sendKeys(Lastname);

        Select dropdown = new Select(driver.findElement(Day));
        dropdown.selectByValue("7");

        Select dropdown1 = new Select(driver.findElement(Month));
        dropdown1.selectByValue("5");

        Select dropdown2 = new Select(driver.findElement(Year));
        dropdown2.selectByValue("1924");


        driver.findElement(mail).sendKeys(Email);
        driver.findElement(CompName).sendKeys(Companyname);
        driver.findElement(Pass).sendKeys(Password);
        driver.findElement(Cpass).sendKeys(Confirmpassword);

        driver.findElement(Submit).click();

    }
}





