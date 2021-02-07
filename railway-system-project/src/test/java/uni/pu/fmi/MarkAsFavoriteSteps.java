package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.FavoritesScreenModel;

public class MarkAsFavoriteSteps {
	
	FavoritesScreenModel model = new FavoritesScreenModel();
	
	@Given("^Потребителят достъпва страницата за маркиране на запис в любими$")
	public void navigate() {
		this.model.navigate();
	}

	@When("^Потребителят натисне бутона за маркиране на запис$")
	public void clickMarkButton() {
		this.model.clickMarkButton();
	}

	@Then("^Потребителят вижда съобщение от страницата за маркиране на запис \"([^\"]*)\"\\.$")
	public void getResultMessage(String expectedMessage) {
		assertEquals(expectedMessage, this.model.getResultMessage());
	}

	@Given("^Потребителят е логнат като обикновен потребител$")
	public void setLogged() {
		this.model.setLogged();
	}

	@Given("^Потребителят вече има маркиран запис с идентификатор (\\d+)$")
	public void setMarkedCourse(int id) {
		this.model.setMarkedCourse(id);		
	}

	@When("^Потребителят маркира запис с идентификатор (\\d+)$")
	public void markCourse(int id) {
		this.model.markCourse(id);
	}
}
