package com.Booking.Train;

import java.time.LocalDate;

public class Train {

	private int trainNumber;
	private String trainName;
	private String fromStation;
    private String toStation;
    private int seatAvailability;
    private LocalDate dateOfjourny;
    private int price;
    
    
    
    
   public Train(int trainNumber, String trainName, String fromStation, String toStation, int seatAvailability,
			LocalDate dateOfjourny, int price) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.seatAvailability = seatAvailability;
		this.dateOfjourny = dateOfjourny;
		this.price = price;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public int getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(int seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public LocalDate getDateOfjourny() {
		return dateOfjourny;
	}
	public void setDateOfjourny(LocalDate dateOfjourny) {
		this.dateOfjourny = dateOfjourny;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    
    
}
