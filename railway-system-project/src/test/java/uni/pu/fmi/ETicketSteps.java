package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.ETicketScreenModel;

public class ETicketSteps {

	ETicketScreenModel eTicketScreen = new ETicketScreenModel();
	
	@Given("^Потребителят достъпва страницата за купуване на електронен билет$")
	public void navigateToScreen() throws Throwable {
	    this.eTicketScreen.navigate();
	}

	@Given("^Потребителят разполага с \"([^\"]*)\" BGN$")
	public void setCurrentFunds(float funds) throws Throwable {
	    this.eTicketScreen.setCurrentFunds(funds);
	}

	@When("^Потребителят избере желания маршрут$")
	public void setEntry() throws Throwable {
	    this.eTicketScreen.setEntry();
	}
	
	@When("^Потребителят натиска бутона за купуване на електронен билет$")
	public void clickBuyButton() throws Throwable {
	    this.eTicketScreen.clickBuyButton();
	}

	@Then("^Потребителят вижда съобщение \"([^\"]*)\"\\.$")
	public void checkMessage(String message) throws Throwable {
	    assertEquals(message, this.eTicketScreen.showMessage());
	}
	
}
