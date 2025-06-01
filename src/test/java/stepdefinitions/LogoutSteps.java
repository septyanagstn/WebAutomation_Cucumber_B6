package stepdefinitions;

import action.DashboardAction;
import action.LoginAction;
import action.LogoutAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoutSteps {
    WebDriver driver = Driver.getDriver();
    LoginAction loginAction = new LoginAction();
    LogoutAction logoutAction = new LogoutAction();
    DashboardAction dashboardAction = new DashboardAction();

    @Given("User has login with credentials bendahara")
    public void user_has_login_with_credentials_bendahara() throws InterruptedException {
        loginAction.openLoginPage();
        loginAction.login("bendahara", "admin123");
    }

    @And("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        assertEquals("Dasbor - Bendahara", dashboardAction.getDashboardTitle());
    }

    @When("User clicks the logout button in the header")
    public void user_clicks_the_logout_button_in_the_header() {
        logoutAction.logout();
    }

    @And("User clicks {string} on the confirmation dialog")
    public void user_clicks_on_the_confirmation_dialog(String string) {
         logoutAction.confirmLogout();
    }

    @Then("User is on the login page")
    public void user_is_on_the_login_page() {
        assertTrue(driver.getCurrentUrl().contains("/login"));
    }
}
