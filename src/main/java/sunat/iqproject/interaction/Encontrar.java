package sunat.iqproject.interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encontrar {

    WebDriver driver;

    public Encontrar(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement elemento(By locator) {
        return driver.findElement(locator);
    }

    public boolean elementoSeMuestra(By locator) {
        return driver.findElement(locator).isDisplayed();
    }


}
