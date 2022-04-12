package com.Booking.Train;

import java.util.LinkedList;
import java.util.List;


public class TicketService {
	
	private static List<Ticket> allTikets = new LinkedList<>();
	

	public static void addNewTicket(int trainNumber, List<Passenger> passengerList) {
		
		int pnr = allTikets.size()+1; 
		Train bookTrain = TrainService.findTrain(trainNumber);
		allTikets.add(new Ticket(pnr, bookTrain, passengerList));
		System.out.println("Ticket Booked Successfully");
	}
	public static void showTicketDetails(int pnr) {
		
		Ticket tempTicket = null;
		for(Ticket ticket : allTikets) {
			if(ticket.getPnrNumber() == pnr) {
				tempTicket = ticket;
				break;
			}
		}
		
		List<Passenger> passengerList = tempTicket.getPassengerList();
		int totalPrice = tempTicket.getTrain().getPrice() * passengerList.size();
		
		System.out.println("********* YOU BOOKING DETAILS ********");
		System.out.println("PNR=> " + tempTicket.getPnrNumber());
		System.out.println("Train Name " + tempTicket.getTrain().getTrainName());
		System.out.println("From statuin " + tempTicket.getTrain().getFromStation() + 
				" To Station " + tempTicket.getTrain().getToStation());
		
		System.out.println("Date of journey: " + tempTicket.getTrain().getDateOfjourny());
		System.out.println("Price : " + tempTicket.getTrain().getPrice() + 
				" Total price : " + totalPrice);
		
		System.out.println();
		System.out.println("********* Passenger Details ********");
		
		for(Passenger passenger: passengerList) {
			System.out.println("Passenger Name: " + passenger.getNameString() + " Passenger Age: " +  passenger.getPassengerAge() );   
		}
	}
}
