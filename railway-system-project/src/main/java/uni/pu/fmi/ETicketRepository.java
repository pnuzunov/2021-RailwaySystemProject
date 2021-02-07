package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class ETicketRepository {

    /**
     * Default constructor
     */
    public ETicketRepository() {
    	this.tickets = new ArrayList<ETicket>();
    }

    /**
     * 
     */
    private List<ETicket> tickets;






    /**
     * @param ticketNumber 
     * @return
     */
    public ScheduleEntry getEntry(int ticketNumber) {
        // TODO implement here
        return null;
    }

    /**
     * @param ticketNumber 
     * @return
     */
    public float getPrice(int ticketNumber) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param entry 
     * @return
     */
    public void createTicket(ScheduleEntry entry) {
        // TODO implement here
    }

    /**
     * @param ticketNumber 
     * @return
     */
    public void deleteTicket(int ticketNumber) {
        // TODO implement here
    }

}