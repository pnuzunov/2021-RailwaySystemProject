package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
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
	public void setFromStation(TrainStation fromStation) throws Throwable {
		this.queryScreenModel.setFromStation(fromStation);
	}

	@Given("^Потребителят въвежда крайна гара \"([^\"]*)\"$")
	public void потребителят_въвежда_крайна_гара(TrainStation toStation) throws Throwable {
		this.queryScreenModel.setToStation(toStation);
	}

	@Given("^Потребителят въвежда начални дата и час \"([^\"]*)\"$")
	public void setDate1(String date1) throws Throwable {
		this.queryScreenModel.setDate1(new SimpleDateFormat("yyyy-MM-dd").parse(date1));
	}

	@Given("^Потребителят въвежда крайни дата и час \"([^\"]*)\"$")
	public void setDate2(String date2) throws Throwable {
		this.queryScreenModel.setDate2(new SimpleDateFormat("yyyy-MM-dd").parse(date2));
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
