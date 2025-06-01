package action;

import locator.LoginPage;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class LoginAction {
    WebDriver driver = Driver.getDriver();

    public void openLoginPage() throws InterruptedException {
        driver.get("http://ptbsp.ddns.net:6882/login");
        Thread.sleep(3000);
    }

    public void login(String username, String password) {
        driver.findElement(LoginPage.usernameField).sendKeys(username);
        driver.findElement(LoginPage.passwordField).sendKeys(password);
        driver.findElement(LoginPage.loginButton).click();
    }


}
