package sunat.iqproject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import sunat.iqproject.questions.ResultadoConsulta;
import sunat.iqproject.task.ConsultarCliente;
import sunat.iqproject.utils.DriverManager;

import java.io.IOException;

public class ConsultaSteps {

    WebDriver driver = DriverManager.getDriver();

    ConsultarCliente cliente = new ConsultarCliente(driver);
    ResultadoConsulta validar = new ResultadoConsulta(driver);

    @Given("que se carga la pagina de SUNAT")
    public void cargarPaginaSUNAT() {

        driver.get("https://e-consultaruc.sunat.gob.pe/cl-ti-itmrconsruc/FrameCriterioBusquedaWeb.jsp");

    }

    @When("se busca a persona juridica por RUC")
    public void consultaRUC() throws IOException {

        cliente.consultaPorRUC();
    }

    @When("se busca a persona juridica pór Razon Social")
    public void consultaRazonSocial() throws IOException {

        cliente.consultaPorRazonSocial();
    }

    @Then("se valida la consulta por RUC")
    public void validaPorRUc() throws IOException {

       Assert.assertTrue(validar.resultadoConsultaPorRuc(),
               "Validacion fallida de busqueda por RUC");

    }

    @Then("se valida la consulta por Razon Social")
    public void validaPorRazonSocial() {

        Assert.assertTrue(validar.resultadoConsultaPorRazonSocial(),
                "Validacion fallida de busqueda por Razon Social");

    }

}
