package sunat.iqproject.ui;

import org.openqa.selenium.By;

public class PaginaResultadoPage {

    public static By consultaRUCTitle = By.xpath("//h1[contains(text(),'Consulta RUC')]");
    public static By nombreRazonSocial = By.xpath("//*[contains(text(),'Número de RUC:')]/../following-sibling::*/*[contains(text(),'')]");
    public static By estadoContribuyente = By.xpath("//*[contains(text(),'Estado del Contribuyente:')]/../following-sibling::*/*[contains(text(),'')]");
    public static By condicionContribuyente = By.xpath("//*[contains(text(),'Condición del Contribuyente')]/../following-sibling::*/*[contains(text(),'')]");
    public static By relacionContribuyentes = By.xpath("//*[contains(text(),'Relación de contribuyentes')]");


}
