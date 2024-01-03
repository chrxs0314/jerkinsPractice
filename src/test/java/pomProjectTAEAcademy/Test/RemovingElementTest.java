package pomProjectTAEAcademy.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pomProjectTAEAcademy.Pages.CartPage;
import pomProjectTAEAcademy.Pages.CheckoutPage;
import pomProjectTAEAcademy.Pages.ProductsPage;

public class RemovingElementTest extends BaseTest{
    ProductsPage productsPage;
    CartPage cart;
    CheckoutPage checkout;

    @Test
    public void removingElementsTest(){
        productsPage = getProductsPage();
        productsPage.addProducts();
        productsPage.openShoppingCart();

        cart = getCartPage();
        cart.removeElements();

    }
}
