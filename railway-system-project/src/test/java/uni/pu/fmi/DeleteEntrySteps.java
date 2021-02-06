package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.DeleteEntryScreenModel;

public class DeleteEntrySteps {
	
	DeleteEntryScreenModel deleteEntryScreenModel = new DeleteEntryScreenModel();
	
	@Given("^Потребителят достъпва страницата за изтриване на запис в разписанието$")
	public void navigate() {
		this.deleteEntryScreenModel.navigate();
	}

	@When("^Потребителя натиска бутона за изтриване на запис в разписанието$")
	public void clickDeleteButton() {
		this.deleteEntryScreenModel.clickDeleteButton();
	}

	@When("^Потребителя избере запис в разписанието$")
	public void setSelectedEntry() {
		this.deleteEntryScreenModel.setSelectedEntry();
	}

	@Given("^Потребителя е логнат като  обикновен потребител$")
	public void loginAsClient() {
		this.deleteEntryScreenModel.login(new Client());
	}

	@Given("^Потребителя е логнат като служител$")
	public void loginAsEmployee() {
		this.deleteEntryScreenModel.login(new Employee());
	}

	@Then("^Потребителят вижда съобщение за резултат от опита \"([^\"]*)\"\\.$")
	public void getResultMessage(String expectedMessage) {
		assertEquals(expectedMessage, this.deleteEntryScreenModel.getResultMessage());
	}
	
	@Then("^Изтритите записи са (\\d+)\\.$")
	public void изтритите_записи_са(int expectedNumber) {
		assertEquals(expectedNumber, this.deleteEntryScreenModel.getLastDeleteCount());
	}
	
}
