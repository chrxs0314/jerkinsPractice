package pomProjectTAEAcademy.Test;

import org.testng.annotations.Test;
import pomProjectTAEAcademy.Pages.CartPage;
import pomProjectTAEAcademy.Pages.CheckoutPage;
import pomProjectTAEAcademy.Pages.ProductsPage;

public class PurchaseProductTest extends BaseTest{
    ProductsPage productsPage;
    CartPage cart;
    CheckoutPage checkout;

    @Test
    public void testPurchase(){
        productsPage = getProductsPage();
        productsPage.addProducts();
        productsPage.openShoppingCart();

        cart = getCartPage();
        cart.checkout();

        checkout = getCheckOut();
        checkout.checkoutProducts();
    }
}
