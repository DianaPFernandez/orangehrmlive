package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import Orange.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);

	
    //clase
	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
	}
	
	@When("^ingrese el usuario (.*) y la contraseña (.*)$") // se relaciona una variable o parametro  (.*)
	public void diligenciarLogin(String userName, String password) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.loginIn(userName,password);
		
	}
	
	@And("^Acceder a la opcion add employee$")
	public void addEmployee() {
		this.pimPage = new PimPage(driver);
		this.pimPage.diligenciarAddEmployee(driver);
	}
	
	@Then("^diligenciar los campos firtname (.*) y lastname (.*)$")
	public void diligenciarEmployee(String firstName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.llenarAddEmployee(firstName, lastName, driver);
		
	}
		

}