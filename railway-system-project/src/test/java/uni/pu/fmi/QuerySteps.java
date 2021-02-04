package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.QueryScreenModel;

public class QuerySteps {
	
	QueryScreenModel queryScreenModel = new QueryScreenModel();
	
	@Given("^Потребителят достъпва страницата за търсене в разписанието по критерии$")
	public void navigate() throws Throwable {
		this.queryScreenModel.navigate();
	}

	@Given("^Потребителят въвежда начална гара \"([^\"]*)\"$")
	public void setFromStation(String fromStation) throws Throwable {
		this.queryScreenModel.setFromStation(new TrainStation(fromStation));
	}

	@Given("^Потребителят въвежда крайна гара \"([^\"]*)\"$")
	public void setToStation(String toStation) throws Throwable {
		this.queryScreenModel.setToStation(new TrainStation(toStation));
	}
	
	@Given("^Потребителят въвежда начални дата и час \"([^\"]*)\"$")
	public void setDate1(@Transform(DateMapper.class) Date date1) throws Throwable {
		this.queryScreenModel.setDate1(date1);
	}

	@Given("^Потребителят въвежда крайни дата и час \"([^\"]*)\"$")
	public void setDate2(@Transform(DateMapper.class) Date date2) throws Throwable {
		
		this.queryScreenModel.setDate2(date2);
	}

	@When("^Потребителят натиска бутона за търсене$")
	public void clickQueryButton() throws Throwable {
		this.queryScreenModel.clickQueryButton();
	}

	@Then("^Потребителят вижда съобщение \"([^\"]*)\"$")
	public void checkMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, this.queryScreenModel.getResultMessage());
	}
}
