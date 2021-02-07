package uni.pu.fmi.models;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.Client;
import uni.pu.fmi.Course;
import uni.pu.fmi.RailwayManager;
import uni.pu.fmi.User;

public class FavoritesScreenModel {

	private Client user;
	private List<Course> courses = new ArrayList<Course>();
	private Course markedCourse;
	private String returnMessage;
	
	public void navigate() {
		courses = new ArrayList<Course>();
		courses.add(new Course());
		courses.add(new Course());
	}

	public void clickMarkButton() {
		if(null == this.user) {
			this.returnMessage = "Грешка: не сте логнати";
			return;
		}
		this.returnMessage = this.user.markAsFavorite(this.markedCourse);
	}

	public String getResultMessage() {
		return this.returnMessage;
	}

	public void setMarkedCourse(int id) {
		ArrayList<Course> favorites = new  ArrayList<Course>();
		favorites.add(courses.get(0));
		this.user = new Client(favorites);
	}

	public void setLogged() {
		this.user = new Client();		
	}

	public void markCourse(int id) {
		this.markedCourse = this.courses.get(id);
	}
	
}
