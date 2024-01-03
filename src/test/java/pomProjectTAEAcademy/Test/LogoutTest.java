package pomProjectTAEAcademy.Test;

import org.testng.annotations.Test;
import pomProjectTAEAcademy.Pages.CartPage;
import pomProjectTAEAcademy.Pages.CheckoutPage;
import pomProjectTAEAcademy.Pages.ProductsPage;

public class LogoutTest extends BaseTest{
    ProductsPage productsPage;

    @Test
    public void logoutTest(){
        productsPage = getProductsPage();
        productsPage.logout();
    }
}
