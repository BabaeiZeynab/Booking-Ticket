package com.Booking.Train;

import java.util.List;

public class Ticket {
	
	
	private int pnr;
	private Train bookTrain;
	private List<Passenger> passengerList;
	
	
	
	public Ticket(int pnrNumber, Train train, List<Passenger> passengerList) {
		super();
		this.pnr = pnrNumber;
		this.bookTrain = train;
		this.passengerList = passengerList;
	}
	
	public int getPnrNumber() {
		return pnr;
	}
	
	public void setPnrNumber(int pnrNumber) {
		this.pnr = pnrNumber;
	}
	
	public Train getTrain() {
		return bookTrain;
	}
	
	
	public void setTrain(Train train) {
		this.bookTrain= train;
	}
	
	
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	
	
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}


}
