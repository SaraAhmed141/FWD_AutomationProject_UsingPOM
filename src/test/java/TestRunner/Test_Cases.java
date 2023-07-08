package TestRunner;
import Pages.*;
import org.testng.annotations.Test;

public class Test_Cases extends Before_test {
    HomePage home;
    RegisterPage register;
    registrationcompleted regcomp;
    CurrencyPage Currency;
    AddToCart Product;
    Shoppingcart Cart;
    CheckOut Check_out;
    Returning_Customer return_cutomer;
    @Test(priority = 1)
    public void HomePage1() {
        home = new HomePage(driver);
        home.register();
        home.registerText();
    }
    @Test(priority = 2)
    public void testStorePage() {
        register = new RegisterPage(driver);
        register.register_Form("Tom", "Mick", "Mick17@gmail.om", "Tech", "Tom@12345", "Tom@12345");
    }
    @Test(priority = 3)
    public void MessageRegister() throws InterruptedException {
        regcomp = new registrationcompleted(driver);
        regcomp.Message();
        regcomp.contains_Button();

    }
    @Test(priority = 4)
    public void Currency_Page() throws InterruptedException {
        Currency = new CurrencyPage(driver);
        Currency.Currency_Customer();
        Currency.Prices_Eu();
    }
    @Test(priority = 5)
    public void Add_To_Cart() throws InterruptedException {
        Product = new AddToCart(driver);
        Product.Open_Item();
        Product.Add_Item("2");
        Product.Open_Item2();
        Product.Add_Item2("3");

    }
    @Test(priority = 6)
    public void Open_Cart() {
        Cart = new Shoppingcart(driver);
        Cart.Open_Cart();
    }
    @Test(priority = 7)
    public void Shoppingcart() {
        Check_out = new CheckOut(driver);
        Check_out.CheckOut_Page();
    }
    @Test(priority = 8)
    public void ReturningCust() {
        return_cutomer = new Returning_Customer(driver);
        return_cutomer.ReturningCustomer("Mick17@gmail.om","Tom@12345");
    }

    @Test(priority = 9)
    public void Shoppingcart2() {
        Check_out = new CheckOut(driver);
        Check_out.CheckOut_Page();
    }
}
