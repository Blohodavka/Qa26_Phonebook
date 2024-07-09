package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginRegistrationForm(){
//        WebElement loginTab = wd.findElement(By.cssSelector("a[href='/login']"));
//        //xpath = //*a[text()'LOGIN']
//
//        loginTab.click();

        click(By.cssSelector("a[href='/login']"));
    }

    public void fillLoginRegistrationForm(String email, String password){

        type(By.name("email"), email);
//        WebElement emailInput;
//        emailInput = wd.findElement(By.name("email"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("blohodavka@mail.ru");

type(By.xpath("//input[last()]"), password);
//        WebElement passwordInput;
//        passwordInput = wd.findElement(By.xpath("//input[last()]"));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys("Mama123$");
    }

    public void submitLogin(){
        click(By.xpath("//button[text()='Login']"));
    }




}
