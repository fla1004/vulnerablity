package testCases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObject.LoginModal;
import pageObject.MainPage;
import sesion.Sesion;

public class Todoist {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    @BeforeEach
    public void initSesion(){
        Sesion.getInstance().getDriver().get("https://todoist.com/es");
    }

   @Test

    public void login(){
        mainPage.initSesion.click();
        loginModal.emailTextBox.setValue("favita_bell@hotmail.com");
        loginModal.passwordTextBox.setValue("4Rgr3$Mxcxr8UX,");
        loginModal.loginButton.click();
    }


}
