package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class ScheduleQueryResult {

    private String message;

	/**
     * Default constructor
     */
    public ScheduleQueryResult(List<ScheduleEntry> entries, String message) {
    	this.entries = entries;
    	this.message = message;
    }

    /**
     * 
     */
    private List<ScheduleEntry> entries;

    /**
     * @return
     */
    public String printResult() {
        return message;
    }

}