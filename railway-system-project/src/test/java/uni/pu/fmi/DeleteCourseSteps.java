package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.DeleteCourseScreenModel;

public class DeleteCourseSteps {
	
	DeleteCourseScreenModel model = new DeleteCourseScreenModel();
	
	@Given("^Потребителят достъпва страницата за изтриване на маршрут$")
	public void navigate() {
		this.model.navigate();
	}

	@When("^Потребителят избере маршрут с идентификатор (\\d+)$")
	public void setCourse(int id) {
		this.model.setCourse(id);
	}

	@When("^Потребителят натисне бутона за изтриване на маршрут$")
	public void clickDeleteButton() {
		this.model.clickDeleteButton();
	}

	@Then("^Потребителят вижда съобщение от страницата за изтриване на маршрут \"([^\"]*)\"\\.$")
	public void getReturnMessage(String expectedMessage) {
		assertEquals(expectedMessage, this.model.getReturnMessage());
	}

	@Given("^Потребителят е служител$")
	public void потребителят_е_служител() {
		this.model.setEmployee();
	}
}
