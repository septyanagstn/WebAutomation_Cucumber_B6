package action;

import locator.LogoutPage;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class LogoutAction {
    WebDriver driver = Driver.getDriver();

    public void logout() {
        driver.findElement(LogoutPage.logoutButton).click();
    }

    public void confirmLogout() {
        driver.findElement(LogoutPage.confirmLogout).click();
    }
}
