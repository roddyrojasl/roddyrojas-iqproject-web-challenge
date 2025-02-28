package sunat.iqproject.interaction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sunat.iqproject.utils.DriverManager;

public class Click {

   WebDriver driver;

   public Click(WebDriver driver){
       this.driver=driver;
   }

    public void enElemento(By locator) {
        driver.findElement(locator).click();
    }

}
