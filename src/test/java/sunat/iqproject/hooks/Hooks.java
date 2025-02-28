package sunat.iqproject.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import sunat.iqproject.utils.DriverManager;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        DriverManager.initDriver();
    }

    @After
    public void tearDown() {
        DriverManager.finisDriver();

    }
}
