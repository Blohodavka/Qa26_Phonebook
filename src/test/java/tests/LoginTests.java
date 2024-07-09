package tests;

import manager.HelperUser;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test

    public void loginSuccess(){
       app.getHelperUser().openLoginRegistrationForm();
       app.getHelperUser().fillLoginRegistrationForm("blohodavka@mail.ru", "Mama123$");
       app.getHelperUser().submitLogin();
    }


}
