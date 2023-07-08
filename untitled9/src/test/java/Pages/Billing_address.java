package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Billing_address {

    private WebDriver driver;

    public Billing_address(WebDriver driver) {

        this.driver = driver;
    }

    private By Country = By.cssSelector("#BillingNewAddress_CountryId");
    private By City = By.cssSelector("#BillingNewAddress_City");
    private By Address1 = By.cssSelector("#BillingNewAddress_Address1");
    private By Zippostalcode = By.cssSelector("#BillingNewAddress_ZipPostalCode");
    private By Phonenumber = By.cssSelector("#BillingNewAddress_PhoneNumber");
    private By Button = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");


    public void Address_Page(String city,String address1,String zippostalcode,String phonenumber) {

        Select dropdown1 = new Select(driver.findElement(Country));
        dropdown1.selectByValue("185");

        driver.findElement(City).sendKeys(city);
        driver.findElement(Address1).sendKeys(address1);
        driver.findElement(Zippostalcode).sendKeys(zippostalcode);
        driver.findElement(Phonenumber).sendKeys(phonenumber);

        driver.findElement(Button).click();

    }
}
