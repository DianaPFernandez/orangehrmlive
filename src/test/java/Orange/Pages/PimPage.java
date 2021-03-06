package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;

public class PimPage {
	
	private ButtonPages buttonPages;
	private Questions questions;
	
	@FindBy(how = How.ID, using = "firstName")
	private WebElement txtfirstName;
	
	@FindBy(how = How.ID, using = "lastName")
	private WebElement txtlastName;
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		this.buttonPages = new ButtonPages(driver);	
		this.questions = new Questions(driver);
	}
	
	public void diligenciarAddEmployee(WebDriver driver) {
		buttonPages.btnPim();
		buttonPages.btnAddEmployee(driver);
	}
	
	public void llenarAddEmployee(String firstName, String lastName, WebDriver driver) {
		txtfirstName.sendKeys(firstName); //sendKeys comando para ingregar la informacion de un campo text
		txtlastName.sendKeys(lastName);
		questions.screenShot(driver);
		buttonPages.btnSave();
	
	}

}
