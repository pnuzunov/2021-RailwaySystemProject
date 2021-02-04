package uni.pu.fmi.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import uni.pu.fmi.Course;
import uni.pu.fmi.DateMapper;
import uni.pu.fmi.RailwayManager;
import uni.pu.fmi.ScheduleEntry;
import uni.pu.fmi.ScheduleQueryResult;
import uni.pu.fmi.TrainStation;

public class QueryScreenModel {
	
	private RailwayManager railwayManager;
	private TrainStation toStation;
	private TrainStation fromStation;
	private Date date1;
	private Date date2;
	private ScheduleQueryResult queryResult;

	public void navigate() {
		System.out.println("Потребителят достъпва страницата за търсене в разписанието по критерии");
		List<Course> courses = new ArrayList<Course>();
		List<ScheduleEntry> entries = new ArrayList<ScheduleEntry>();
		
		courses.add(
				new Course(new TrainStation("Sofia"), new TrainStation("Plovdiv"), 1.25f)
		);
		
		entries.add(
			new ScheduleEntry(new DateMapper().transform("02-01-2021"), courses.get(0))	
		);
		
		this.railwayManager = new RailwayManager(courses, entries);
		
	}

	public void setToStation(TrainStation toStation) {
		this.toStation = toStation;
	}

	public void setFromStation(TrainStation fromStation) {
		this.fromStation = fromStation;
		
	}

	public void setDate1(Date date1) {
		this.date1 = date1;		
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
		
	}

	public void clickQueryButton() {
		this.queryResult = this.railwayManager.getEntries(
				fromStation,
				toStation,
				date1,
				date2
		);
	}

	public String getResultMessage() {
		return this.queryResult.printResult();
	}

}
