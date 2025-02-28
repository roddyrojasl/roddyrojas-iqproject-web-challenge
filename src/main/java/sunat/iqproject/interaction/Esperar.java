package sunat.iqproject.interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sunat.iqproject.utils.DriverManager;

import java.time.Duration;

public class Esperar {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public Esperar(WebDriver driver) {
        this.driver=driver;
    }

    public void elementoSeaVisible(By localizador)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(localizador));
    }
}
