package uni.pu.fmi.models;

import uni.pu.fmi.RailwayManager;
import uni.pu.fmi.ScheduleEntry;
import uni.pu.fmi.User;

public class DeleteEntryScreenModel {

	private ScheduleEntry entry;
	private User user;
	private RailwayManager railwayManager;
	private String returnMessage;

	public String getResultMessage() {
		return this.returnMessage;
	}

	public int getLastDeleteCount() {
		return (null != entry && null == this.railwayManager.getEntry(0) ? 1 : 0);
	}

	public void navigate() {
		this.railwayManager = new RailwayManager();
	}

	public void clickDeleteButton() {
		this.returnMessage = this.railwayManager.deleteEntry(0, this.user);
	}

	public void setSelectedEntry() {
		this.entry = new ScheduleEntry();
		this.railwayManager.createEntry(this.entry);	
	}

	public void login(User user) {
		this.user = user;
	}
	
}
