package uni.pu.fmi;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Client extends User {

	private List<Course> favorites;
	
    /**
     * Default constructor
     */
    public Client(float currentFunds) {
    	this();
    	this.currentFunds = currentFunds;
    }

    public Client(List<Course> favorites) {
    	this.favorites = favorites;
    }
    
    public Client() {
    	this.favorites = new ArrayList<Course>();
    	this.eTicketRepo = new ETicketRepository();
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
    	if(entry.getPrice() > this.currentFunds)
    		return "Грешка: недостатъчно средства";
		
    	this.eTicketRepo.createTicket(entry);
		return "Успешно закупен електронен билет";
    }


	public void setFunds(float funds) {
		this.currentFunds = funds;
	}

    public String markAsFavorite(Course course) {
    	if(null == course)
    		return "Моля, изберете запис";
    	if(this.favorites.contains(course))
    		return "Грешка: записът вече е маркиран";
    	return "Успешно маркиран запис";
    }
	
}