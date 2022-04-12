package com.Booking.Train;

import java.nio.channels.NonWritableChannelException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class MainTrain {

	public static void main(String[] args) {
		System.out.println("Now Seraching for Trains ... \n ");
		TrainService.searchTrain("Toronto", "Monteral", LocalDate.now(), 20);

		BankAccount b1 = new BankAccount(99, 10000);
		BankAccount b2 = new BankAccount(88, 12000);
		///int passengerID, String nameString, int passengerAge, BankAccount bankAccount
		Passenger p1 = new Passenger(2213, "safa Babaei", 27, b1);
		Passenger p2 = new Passenger(2215, "Eric baxta", 29, b2);
		Passenger p3 = new Passenger(2217, "can apple", 37, b2);
		
		
		List<Passenger> passengerList = new LinkedList<Passenger>();
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		
		System.out.println("Now Booking tickets for three passenger in train 101\n ");
		
		TrainService.bookticket(101, passengerList);

       System.out.println("Printing Ticket details ... \n");
       TicketService.showTicketDetails(1);


	}

}
