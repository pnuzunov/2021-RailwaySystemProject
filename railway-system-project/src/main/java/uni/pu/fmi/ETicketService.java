package uni.pu.fmi;

public class ETicketService {

	private float requiredFunds = 5;
	
	public String createTicket(final float currentFunds) {
		if(this.requiredFunds > currentFunds)
			return "Грешка: недостатъчно средства";
		else
			return "Успешно закупен електронен билет";
	}

}
