package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    public static By navbarTitle = By.xpath("/html/body/div[2]/main/div/div[1]/div/div/div[1]/h1");

    public static By navbarItems = By.xpath("//ul[@data-sidebar='menu']/li/a/span");;
}
