package uni.pu.fmi.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import uni.pu.fmi.Course;
import uni.pu.fmi.Employee;
import uni.pu.fmi.RailwayManager;
import uni.pu.fmi.ScheduleEntry;

public class DeleteCourseScreenModel {

	private RailwayManager railwayManager;
	private List<ScheduleEntry> entries;
	private List<Course> courses;
	private Course selectedCourse;
	private Employee employee;
	private String returnMessage;
	private int courseId;
	
	public void navigate() {
		
		this.courses = new ArrayList<Course>();
		this.courses.add(new Course());
		this.courses.add(new Course());
		
		this.entries = new ArrayList<ScheduleEntry>();
		this.entries.add(new ScheduleEntry(new Date(), courses.get(0)));
		
		this.railwayManager = new RailwayManager(courses, entries);
	}

	public void setCourse(int id) {
		this.selectedCourse = this.courses.get(id);
		this.courseId = id;
	}

	public void clickDeleteButton() {
		if(this.employee == null)
			this.returnMessage = "Грешка: нямате нужните права";
		else
			this.returnMessage = this.railwayManager.deleteCourse(this.courseId);
	}

	public String getReturnMessage() {
		return this.returnMessage;
	}

	public void setEmployee() {
		this.employee = new Employee();
	}

}
