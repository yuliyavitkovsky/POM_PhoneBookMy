package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationScreen extends BaseScreen{

    public AuthenticationScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/inputEmail']")
    MobileElement editTextEmail;

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/inputPassword']")
    MobileElement editTextPassword;

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/regBtn']")
    MobileElement registrationButton;

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/loginBtn']")
    MobileElement loginButton;

    public AuthenticationScreen fillEmail(String email){
        waitElement(editTextEmail, 5);
        type(editTextEmail, email);
        return this;
    }

    public AuthenticationScreen fillPassword(String password){
        waitElement(editTextPassword, 5);
        type(editTextPassword, password);
        return this;
    }

    public ContactListScreen submitLogin(){
        loginButton.click();
        pause(3000);
        return new ContactListScreen(driver);
    }
    public ContactListScreen submitRegistration(){
        registrationButton.click();
        pause(3000);
        return new ContactListScreen(driver);
    }
}
