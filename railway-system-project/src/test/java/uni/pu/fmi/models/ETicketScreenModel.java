package uni.pu.fmi.models;

import uni.pu.fmi.ETicketService;

public class ETicketScreenModel {

	private float currentFunds;
	private ETicketService eTicketService = new ETicketService();
	private String message;
	
	public void navigate() {
		System.out.println("Потребителят достъпва страницата за купуване на електронен билет");
	}
	
	public void setCurrentFunds(float funds) {
		this.currentFunds = funds;
	}
	
	public void clickBuyButton() {
		this.message = this.eTicketService.createTicket(this.currentFunds);
	}
	
	public String showMessage() {
		return this.message;
	}
	
}
