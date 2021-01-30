package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ETicketSteps {

	@Given("^The user has marked a shedule entry$")
	public void the_user_has_marked_a_shedule_entry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^the user has sufficient funds$")
	public void the_user_has_sufficient_funds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^The user clicks the e-ticket buy button$")
	public void the_user_clicks_the_e_ticket_buy_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The user sees the \"([^\"]*)\" message\\.$")
	public void the_user_sees_the_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("e-ticket bought successfully", "");
	}

	@Given("^the user has insufficient funds$")
	public void the_user_has_insufficient_funds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
