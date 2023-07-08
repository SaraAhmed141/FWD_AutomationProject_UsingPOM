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
    Billing_address address;
    Returning_Customer return_cutomer;
    Shipping_method meth;
    Payment_method payment;
    Payment_information Info;


    @Test(priority = 1)
    public void HomePage1() {
        home = new HomePage(driver);
        home.register();
        home.registerText();
    }
    @Test(priority = 2)
    public void testStorePage() {
        register = new RegisterPage(driver);
        register.register_Form("Tom", "Mick", "Mick199@gmail.om", "Tech", "Tom@12345", "Tom@12345");
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
        return_cutomer.ReturningCustomer("Mick199@gmail.om","Tom@12345");
    }
    @Test(priority = 9)
    public void Shoppingcart2() {
        Check_out = new CheckOut(driver);
        Check_out.CheckOut_Page();
    }
    @Test(priority = 10)
    public void BillingAdd() {
        address = new Billing_address(driver);
        address.Address_Page("Perferendis eius iur","35 Cowley Extension","86876","+1 (884) 106-7015");
    }

    @Test(priority = 12)
    public void Shipp_meth() {
        meth = new Shipping_method(driver);
        meth.Click_continue();
    }
    @Test(priority = 13)
    public void Payment_met() {
        payment = new Payment_method(driver);
        payment.Payment_meth();
    }
    @Test(priority = 14)
    public void Payment_info() throws InterruptedException {
        Info = new Payment_information(driver);
        Info.Payment_info("Shea Meyer","400000000002","123");
        Info.ContiunsButton6();
        Info.ContiunsButton3();

        }

    }

