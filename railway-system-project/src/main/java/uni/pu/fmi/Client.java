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

    public Client() {
		// TODO Auto-generated constructor stub
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
    	if(null == entry)
    		return "Грешка: няма избран маршрут";
    	else if(entry.getPrice() > this.currentFunds)
    		return "Грешка: недостатъчно средства";
		else
			return "Успешно закупен електронен билет";
    }


	public void setFunds(float funds) {
		this.currentFunds = funds;
	}

}