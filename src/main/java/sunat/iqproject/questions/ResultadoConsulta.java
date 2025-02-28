package sunat.iqproject.questions;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import sunat.iqproject.interaction.Encontrar;
import sunat.iqproject.ui.PaginaResultadoPage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResultadoConsulta {

    WebDriver driver;

    public ResultadoConsulta(WebDriver driver) {
        this.driver=driver;
    }

    public boolean resultadoConsultaPorRuc() throws IOException {
        Encontrar validar = new Encontrar(driver);
        String readJSON = new String(Files.readAllBytes(Paths.get("src/test/resources/ConsultarJuridico.json")), StandardCharsets.UTF_8);
        JSONObject cliente = new JSONObject(readJSON);

        if(validar.elemento(PaginaResultadoPage.nombreRazonSocial).getText().contains(cliente.get("nombre").toString()) &&
                validar.elemento(PaginaResultadoPage.estadoContribuyente).getText().equals(cliente.get("estado")) &&
                validar.elemento(PaginaResultadoPage.condicionContribuyente).getText().equals(cliente.get("condicion")))
            return true;
        else
            return false;

    }

    public boolean resultadoConsultaPorRazonSocial() {
        Encontrar validar = new Encontrar(driver);

        if (validar.elementoSeMuestra(PaginaResultadoPage.relacionContribuyentes))
            return true;
        else
            return false;

    }
}
