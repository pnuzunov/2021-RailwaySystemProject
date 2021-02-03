package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class ScheduleEntry {

	private static int idIncrement = 0; 
	
    /**
     * Default constructor
     */
    public ScheduleEntry() {
    }

    public ScheduleEntry(Date date, Course course) {
    	this.id = ++idIncrement;
    	this.date = date;
    	this.course = course;
    	this.price = course.getPrice();
    }
    
    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private Course course;

    /**
     * 
     */
    private float price;



    /**
     * @return
     */
    public Date getDate() {
        // TODO implement here
        return null;
    }

    /**
     * @param date 
     * @return
     */
    public void setDate(Date date) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return 0;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(int id) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Course getCourse() {
        // TODO implement here
        return null;
    }

    /**
     * @param course 
     * @return
     */
    public void setCourse(Course course) {
        // TODO implement here
    }

    /**
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(float price) {
        // TODO implement here
    }

}