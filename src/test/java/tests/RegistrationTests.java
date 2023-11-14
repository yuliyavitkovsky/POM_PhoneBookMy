package tests;

import config.AppiumConfig;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class RegistrationTests extends AppiumConfig {

    @Test
    public void registrationPositive(){
        new SplashScreen(driver)
                .gotoAuthenticationScreen()
                .fillEmail("dan@mail.com")
                .fillPassword("Mm23456$")
                .submitRegistration();

    }

}
