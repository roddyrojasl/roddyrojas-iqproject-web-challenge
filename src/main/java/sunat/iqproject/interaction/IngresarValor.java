package sunat.iqproject.interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sunat.iqproject.utils.DriverManager;

public class IngresarValor {

    WebDriver driver;

    public IngresarValor(WebDriver driver){
        this.driver=driver;
    }

    public void texto(String texto, By locator) {
        driver.findElement(locator).sendKeys(texto);
    }
}
