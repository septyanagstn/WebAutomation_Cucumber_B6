package stepdefinitions;

import action.DashboardAction;
import action.LoginAction;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    WebDriver driver = Driver.getDriver();
    Hooks hooks = new Hooks();
    LoginAction loginAction = new LoginAction();
    DashboardAction dashboardAction = new DashboardAction();

    @Given("User has open the browser")
    public void user_has_open_the_browser() {
        System.out.println("✅ Login page opened: http://ptbsp.ddns.net:6882/login");
    }

    @And("has navigated on the login page")
    public void has_navigated_on_the_login_page() throws InterruptedException {
        loginAction.openLoginPage();
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginAction.login(username, password);
    }

    @Then("User should see dashboard with title {string}")
    public void user_should_see_dashboard_with_title(String expectedTitle) {
        assertEquals(expectedTitle, dashboardAction.getDashboardTitle());
    }

    @Then("User should be able to see navigation bar for bendahara")
    public void user_should_be_able_to_see_navigation_bar_for_bendahara() {
        List<String> expectedNavbar = Arrays.asList(
                "Dasbor",
                "Tagihan Siswa",
                "Transaksi Penerimaan Dana",
                "Pengaturan Notifikasi",
                "Status Pembayaran",
                "Rekapitulasi",
                "Progres Transaksi Penerimaan Dana"
        );
        List<String> actualNavbar = dashboardAction.getNavbarItems();
        assertEquals(expectedNavbar, actualNavbar);
    }

    @Then("User should see error message {string}")
    public void user_should_see_error_message(String expectedError) {
        String actualError = driver.getPageSource();
        assertTrue(actualError.contains(expectedError));
    }
}
