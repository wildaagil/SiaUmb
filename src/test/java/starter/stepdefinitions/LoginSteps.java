package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("I on the login page")
    public void iOnTheLoginPage() {
        loginPage.openUrl();
    }

    @When("I input username")
    public void iInputUsername() {
        loginPage.inputUsername("41519010096");
    }

    @And("I input password")
    public void iInputPassword() {
        loginPage.inputPassword("13052001");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        loginPage.headerDisplayed();
    }

    @And("I click exit in popup")
    public void iClickExitInPopup() {
        loginPage.clickPopup();
    }
}
