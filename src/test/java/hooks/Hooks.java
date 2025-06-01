package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = Driver.createWebDriver(); 
        driver.manage().window().maximize(); 
        System.out.println("🟢 Browser siap digunakan sebelum scenario");
    }

    @BeforeStep
    public void slowDownEachStep() throws InterruptedException {
        Thread.sleep(100);
    }

    @After
    public void cleanUp() {
        Driver.quitDriver(); // Matikan browser melalui util
        System.out.println("🔴 Browser ditutup setelah scenario selesai");
    }
}
