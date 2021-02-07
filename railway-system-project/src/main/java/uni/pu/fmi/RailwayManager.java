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
    	this.courses = new ArrayList<Course>();
    	this.entries = new ArrayList<ScheduleEntry>();
    }

    public RailwayManager(List<Course> courses, List<ScheduleEntry> entries) {
    	this.courses = courses;
    	this.entries = entries;
    }  
    
    public ScheduleQueryResult getEntries(TrainStation fromStation, TrainStation toStation, Date date1, Date date2) {
    	
    	if(null == fromStation || null == toStation) {
    		return new ScheduleQueryResult(null, "");
    	}
    	
    	if("".equals(fromStation.getName())) {
    		return new ScheduleQueryResult(null, "Моля, въведете начална спирка.");
    	}
    		
    	if("".equals(toStation.getName())) {
    		return new ScheduleQueryResult(null, "Моля, въведете крайна спирка.");
    	}
    		
    	if(null == date1) {
    		return new ScheduleQueryResult(null, "Моля, въведете начална дата.");
    	}
    		
    	if(null == date2) {
    		return new ScheduleQueryResult(null, "Моля, въведете крайна дата.");
    	}
    	
    	if(fromStation.getName().equals(toStation.getName())) {
    		return new ScheduleQueryResult(null, "Начална и крайна гара трябва да са различни.");
    	}
    	
    	if(date1.after(date2)) {
    		return new ScheduleQueryResult(null, "Началната дата трябва да е по-скоро от крайната.");
    	}
    	
    	List<ScheduleEntry> result = this.entries.stream()
        .filter(   x -> x.getCourse().getFromStation().getName().equals(fromStation.getName())
        			 && x.getCourse().getToStation().getName().equals(toStation.getName())
        			 && !x.getDate().before(date1)
        			 && !x.getDate().after(date2)
        ).collect(Collectors.toList());
    	
    	if(result.isEmpty())
    		return new ScheduleQueryResult(null, "Няма данни за направеното търсене.");
    		
    	return new ScheduleQueryResult(result, "Списък с пътувания");
    }

    /**
     * @param id 
     * @return
     */
    public ScheduleEntry getEntry(int id) {
    	
    	return this.entries.size() > 0 ? this.entries.get(id) : null;
    }

    /**
     * @param entry 
     * @return
     */
    public void createEntry(ScheduleEntry entry) {
    	this.entries.add(entry);
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
    public String deleteEntry(int id, User user) {
    	
    	if(null == this.getEntry(id)) {
			return "Моля, изберете запис за изтриване";
		}
		else if(null == user) {
			return "Грешка: не сте логнати в системата";
		}
		else if(user instanceof Employee) {
			this.entries.remove(id);
			return "Запис успешно изтрит";
		}
		else if(user instanceof Client) {
			return "Грешка: нямате необходимите права за изтриване на запис";
		}
    	return "Неочакван резултат";
    }

    /**
     * @param name 
     * @return
     */
    public Course getCourse(int id) {
        return this.courses.get(id);
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
    
    public String deleteCourse(int id) {
    	Course course = this.getCourse(id);
    	List<ScheduleEntry> result = this.entries.stream()
    	        .filter( x -> x.getCourse() == course)
    	        .collect(Collectors.toList());
    	if(!result.isEmpty())
    		return "Грешка: маршрутът не може да бъде изтрит";
        return "Успешно изтрит запис";
    }

}