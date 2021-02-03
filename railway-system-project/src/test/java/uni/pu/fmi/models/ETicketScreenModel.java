package uni.pu.fmi.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;

import cucumber.deps.com.thoughtworks.xstream.converters.basic.DateConverter;
import uni.pu.fmi.Client;
import uni.pu.fmi.Course;
import uni.pu.fmi.RailwayManager;
import uni.pu.fmi.ScheduleEntry;
import uni.pu.fmi.TrainStation;

public class ETicketScreenModel {

	private Client client;
	private RailwayManager railwayManager;
	private String message;
	
	public void navigate() {
		System.out.println("Потребителят достъпва страницата за купуване на електронен билет");
		List<Course> courses = new ArrayList<Course>();
		List<ScheduleEntry> entries = new ArrayList<ScheduleEntry>();
		
		courses.add(
				new Course(new TrainStation("Sofia"), new TrainStation("Plovdiv"), 1.25f)
		);
		
		entries.add(
			new ScheduleEntry(new Date(System.currentTimeMillis()), courses.get(0))	
		);
		
		this.railwayManager = new RailwayManager(courses, entries);
		
	}
	
	public void setCurrentFunds(float funds) {
		this.client = new Client(funds);
	}
	
	public void clickBuyButton() {
		this.message = this.client.buyTicket(this.railwayManager.getEntry(0));
	}
	
	public String showMessage() {
		return this.message;
	}
	
}
