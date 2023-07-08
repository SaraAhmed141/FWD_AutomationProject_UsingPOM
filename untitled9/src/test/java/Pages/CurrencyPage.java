package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyPage {
    private WebDriver driver;

    public CurrencyPage(WebDriver driver) {
        this.driver = driver;
    }

    private By Currency=By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/div/select");
    private By CurrencyEU=By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]");

    private By PricesEU=By.className("prices");

    public void Currency_Customer() throws InterruptedException {

        driver.findElement(Currency).click();
        driver.findElement(CurrencyEU).click();
        Thread.sleep(5000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1200)");

    }

  public void Prices_Eu(){

    List<WebElement> EuroElmnt = driver.findElements(PricesEU);
    System.out.println(EuroElmnt.size());

    for (WebElement webElement : EuroElmnt) {
        String name = webElement.getText();
        System.out.println(name);

    }
}

}
