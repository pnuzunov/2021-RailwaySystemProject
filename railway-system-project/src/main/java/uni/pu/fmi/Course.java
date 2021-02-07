package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Course {

    /**
     * Default constructor
     */
    public Course() {
    	
    }

    public Course(TrainStation fromStation, TrainStation toStation, float price) {
       	this.fromStation = fromStation;
    	this.toStation = toStation;
    	this.price = price;
    	this.name = fromStation.getName() + " - " + toStation.getName();
	}

	/**
     * 
     */
    private String name;

    /**
     * 
     */
    private TrainStation fromStation;

    /**
     * 
     */
    private TrainStation toStation;

    /**
     * 
     */
    private float price;


    public float getPrice() {
    	return this.price;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the fromStation
	 */
	public TrainStation getFromStation() {
		return fromStation;
	}

	/**
	 * @return the toStation
	 */
	public TrainStation getToStation() {
		return toStation;
	}


}