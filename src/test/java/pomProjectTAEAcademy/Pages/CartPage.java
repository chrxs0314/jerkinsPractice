package pomProjectTAEAcademy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy(id = "checkout")
    private WebElement checkoutBtn;
    @FindBy(className="cart_button")
    private List<WebElement> removeBtn;

    @FindBy(className = "cart_item")
    private List<WebElement> products;


    public void checkout(){
        checkoutBtn.click();
    }

    public void removeElements(){
        while(!removeBtn.isEmpty()){
            removeBtn.get(0).click();
        }
    }

    public CartPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }


}
