package sunat.iqproject.task;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import sunat.iqproject.interaction.Click;
import sunat.iqproject.interaction.IngresarValor;
import sunat.iqproject.ui.ConsultaHomePage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConsultarCliente {

    WebDriver driver;

    public ConsultarCliente(WebDriver driver) {
        this.driver=driver;
    }

    public void consultaPorRUC() throws IOException {
        Click click = new Click(driver);
        IngresarValor escribe = new IngresarValor(driver);
        String readJSON = new String(Files.readAllBytes(Paths.get("src/test/resources/ConsultarJuridico.json")), StandardCharsets.UTF_8);
        JSONObject cliente = new JSONObject(readJSON);

        click.enElemento(ConsultaHomePage.busquedaRUCBtn);
        escribe.texto(cliente.getString("ruc"), ConsultaHomePage.rucTextbox);
        click.enElemento(ConsultaHomePage.aceptarBtn);

    }

    public void consultaPorRazonSocial() throws IOException {
        Click click = new Click(driver);
        IngresarValor escribe = new IngresarValor(driver);
        String readJSON = new String(Files.readAllBytes(Paths.get("src/test/resources/ConsultarJuridico.json")), StandardCharsets.UTF_8);
        JSONObject cliente = new JSONObject(readJSON);

        click.enElemento(ConsultaHomePage.busquedaRazonSocialBtn);
        escribe.texto(cliente.getString("nombre"), ConsultaHomePage.razonSocialTextbox);
        click.enElemento(ConsultaHomePage.aceptarBtn);

    }
}
