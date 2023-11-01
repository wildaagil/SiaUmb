package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By fieldUsername(){
        return By.id("username");
    }

    private By fieldPassword(){
        return By.id("password");
    }

    private By loginButton(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/input");
    }

    private By boxPopup(){
        return By.xpath("/html/body/div[6]/div[1]/button/span[1]");
    }

    private By headerProduct(){
        return By.xpath("//*[@id=\"main_form\"]/div/div[2]/div[1]");
    }

    public void openUrl(){
        openAt("/gate.php/login");
    }

    public void inputUsername(String username){
        $(fieldUsername()).type(username);
    }

    public void inputPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void clickLogin(){
        $(loginButton()).click();
    }

    public void clickPopup(){
        $(boxPopup()).click();
    }

    public void headerDisplayed(){
        $(headerProduct()).isDisplayed();
    }
}
