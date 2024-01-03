package pomProjectTAEAcademy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pomProjectTAEAcademy.Providers.DataProviderCheckOut;

import javax.xml.crypto.Data;

public class CheckoutPage extends BasePage {
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    @FindBy(id = "finish")
    private WebElement finishBtn;

    @FindBy(className = "complete-header")
    private WebElement completeHeader;

    DataProviderCheckOut providerCheckOut = new DataProviderCheckOut();

    public void checkoutProducts(){
        checkoutStepOne();
        checkoutStepTwo();
        Assert.assertEquals(completeHeader.getText(), "Thank you for your order!");
    }

    public void checkoutStepOne(){
        firstName.sendKeys(providerCheckOut.getFirstName());
        lastName.sendKeys(providerCheckOut.getLastName());
        postalCode.sendKeys(providerCheckOut.getPostalCode());
        continueBtn.click();
    }

    public void checkoutStepTwo(){
        finishBtn.click();
    }
    public CheckoutPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
}
