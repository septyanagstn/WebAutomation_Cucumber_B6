package locator;

import org.openqa.selenium.By;

public class LoginPage {
    public static By usernameField = By.name("username");

    public static By passwordField = By.name("password");

    public static By loginButton = By.xpath("/html/body/div[2]/div/div[2]/div/div/form/button");

    public static By errorMessage = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div");
}
