package pomProjectTAEAcademy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pomProjectTAEAcademy.Providers.DataProviderLogin;

import javax.xml.crypto.Data;

public class LoginPage extends BasePage{
    DataProviderLogin dataProviderLogin = new DataProviderLogin();
    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(className = "title")
    private WebElement loginTitleValidate;

    public void enterUserName(){
        username.sendKeys(dataProviderLogin.getUsername());
    }

    public void enterPassword(){
        password.sendKeys(dataProviderLogin.getPassword());
    }
    public void clickOnLogin(){
        loginButton.click();
    }

    public String getTextValidate(){
        return null;
    }

    public String validateLogin(){
        this.isElementDisplayed(loginTitleValidate);
        return loginTitleValidate.getText();
    }

    public void login(){
        this.username.sendKeys(dataProviderLogin.getUsername());
        this.password.sendKeys(dataProviderLogin.getPassword());
        loginButton.click();
        validateLogin();
    }

    public LoginPage(WebDriver driver, String url){
        super(driver);
        driver.get(url);
    }
}
