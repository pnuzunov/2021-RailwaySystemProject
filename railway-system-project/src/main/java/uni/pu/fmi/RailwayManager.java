package uni.pu.fmi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class RailwayManager {

    /**
     * 
     */
    private List<ScheduleEntry> entries;

    /**
     * 
     */
    private List<Course> courses;
	
    /**
     * Default constructor
     */
    public RailwayManager() {
    }

    public RailwayManager(List<Course> courses, List<ScheduleEntry> entries) {
    	this.courses = courses;
    	this.entries = entries;
    }
        
    /**
     * @param course 
     * @param date1 
     * @param date2 
     * @return
     */
    public ScheduleQueryResult getEntries(TrainStation fromStation, TrainStation toStation, Date date1, Date date2) {
    	
    	if(null == fromStation) {
    		return new ScheduleQueryResult(null, "Моля, въведете начална спирка.");
    	}
    		
    	if(null == toStation) {
    		return new ScheduleQueryResult(null, "Моля, въведете крайна спирка.");
    	}
    		
    	if(null == date1) {
    		return new ScheduleQueryResult(null, "Моля, въведете начална дата.");
    	}
    		
    	if(null == date2) {
    		return new ScheduleQueryResult(null, "Моля, въведете крайна дата.");
    	}
    	
    	if(fromStation.getName() == toStation.getName()) {
    		return new ScheduleQueryResult(null, "Начална и крайна гара трябва да са различни.");
    	}
    	
    	if(date1.after(date2)) {
    		return new ScheduleQueryResult(null, "Началната дата трябва да е по-скоро от крайната.");
    	}
    	
    	List<ScheduleEntry> result = this.entries.stream()
        .filter(x -> x.getCourse().getFromStation() == fromStation
        			 && x.getCourse().getToStation() == toStation
        			 && x.getDate().after(date1))
        .collect(Collectors.toList());
    	
    	if(null == result)
    		return new ScheduleQueryResult(null, "Няма данни за направеното търсене.");
    		
    	return new ScheduleQueryResult(result, "Направление София-Пловдив в периода 01.01 - 02.01");
    }

    /**
     * @param id 
     * @return
     */
    public ScheduleEntry getEntry(int id) {
        return this.entries.stream()
        		.filter(x -> x.getId() == id)
        		.findFirst()
        		.get();
    }

    /**
     * @param entry 
     * @return
     */
    public void createEntry(ScheduleEntry entry) {
        // TODO implement here
    }

    /**
     * @param id 
     * @param entry 
     * @return
     */
    public void updateEntry(int id, ScheduleEntry entry) {
        // TODO implement here
    }

    /**
     * @param id 
     * @return
     */
    public ScheduleEntry deleteEntry(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param name 
     * @return
     */
    public Course getCourse(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param course 
     * @return
     */
    public void createCourse(Course course) {
        // TODO implement here
    }

    /**
     * @param name 
     * @param course 
     * @return
     */
    public void updateCourse(String name, Course course) {
        // TODO implement here
    }

    /**
     * @param name 
     * @return
     */
    public void deleteCourse(String name) {
        // TODO implement here
    }

}