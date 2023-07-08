package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddToCart {

    private WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    public By OpenItem = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/a[1]/img[1]");
    public By AddItem = By.cssSelector("#product_enteredQuantity_18");
    public By ClickAddCart = By.cssSelector("#add-to-cart-button-18");

    public By OpenItem2 = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public By AddItem2 = By.cssSelector("#product_enteredQuantity_23");
    public By ClickAddCart2 = By.cssSelector("#add-to-cart-button-23");

    public void Open_Item() throws InterruptedException {

        driver.findElement(OpenItem).click();
        Thread.sleep(4000);
    }

    public void Add_Item(String NumberOfItems) throws InterruptedException {

        driver.findElement(AddItem).clear();
        driver.findElement(AddItem).sendKeys(NumberOfItems);
        Thread.sleep(2000);
        driver.findElement(ClickAddCart).click();
        Thread.sleep(2000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,1400)");
    }
//Second Item
    public void Open_Item2() throws InterruptedException {

        driver.findElement(OpenItem2).click();
        Thread.sleep(4000);
    }

    public void Add_Item2(String NumberOfItems2) throws InterruptedException {

        driver.findElement(AddItem2).clear();
        driver.findElement(AddItem2).sendKeys(NumberOfItems2);
        Thread.sleep(2000);
        driver.findElement(ClickAddCart2).click();

    }
}
