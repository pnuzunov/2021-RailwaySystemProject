package uni.pu.fmi;

/**
 * 
 */
public class Client extends User {

    /**
     * Default constructor
     */
    public Client(float currentFunds) {
    	this.currentFunds = currentFunds;
    }

    /**
     * 
     */
    private ETicketRepository eTicketRepo;

    /**
     * 
     */
    private float currentFunds;

    public float getCurrentFunds() {
    	return this.currentFunds;
    }


    /**
     * @param entry
     */
    public String buyTicket(ScheduleEntry entry) {
    	if(entry.getPrice() > this.currentFunds)
    		return "Грешка: недостатъчно средства";
		else
			return "Успешно закупен електронен билет";
    }

}