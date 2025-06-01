package action;

import locator.DashboardPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class DashboardAction {
    WebDriver driver = Driver.getDriver();

    public String getDashboardTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardPage.navbarTitle));
        return titleElement.getText();
    }

    public List<String> getNavbarItems() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardPage.navbarItems));

        List<WebElement> elements = driver.findElements(DashboardPage.navbarItems);

        List<String> navbarTexts = elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        return navbarTexts;
    }
}