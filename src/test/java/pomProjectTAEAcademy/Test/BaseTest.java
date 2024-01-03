package pomProjectTAEAcademy.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pomProjectTAEAcademy.Pages.CartPage;
import pomProjectTAEAcademy.Pages.CheckoutPage;
import pomProjectTAEAcademy.Pages.LoginPage;
import pomProjectTAEAcademy.Pages.ProductsPage;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUpBeforeClass(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        this.driver = new ChromeDriver(options);
        getLoginPage().login();
    }

    public LoginPage getLoginPage(){
        return new LoginPage(driver, "https://www.saucedemo.com/");
    }
    public ProductsPage getProductsPage(){return new ProductsPage(this.driver,"https://www.saucedemo.com/inventory.html");}
    public CartPage getCartPage(){return new CartPage(this.driver,"https://www.saucedemo.com/cart.html");}
    public CheckoutPage getCheckOut(){return new CheckoutPage(this.driver, "https://www.saucedemo.com/checkout-step-one.html");}

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
