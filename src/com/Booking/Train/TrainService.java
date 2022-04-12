package com.Booking.Train;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {

	private static List<Train> allTrains = new LinkedList<Train>();

	static {
		allTrains.add(new Train(101, "Train-one", "Toronto", "Monteral", 100, LocalDate.now(), 50));
		allTrains.add(new Train(102, "Train-two", "Toronto", "Monteral", 55, LocalDate.now(), 200));
		allTrains.add(new Train(103, "Train-three", "Monteral", "Qubeq", 30, LocalDate.now(), 150));
		allTrains.add(new Train(104, "Train-four", "Monteral", "Qubeq", 50, LocalDate.now(), 250));
		allTrains.add(new Train(105, "Train-five", "Toronto", "Ottawa", 77, LocalDate.now(), 1000));
		allTrains.add(new Train(106, "Train-six", "Ottawa", "Monteral", 100, LocalDate.now(), 50));
	}

	public TrainService() {
		super();
	}


	public static Train findTrain(int trainNumber) {
		Train tempTrain = null;
		for(Train t: allTrains) {
			if(t.getTrainNumber() == trainNumber) {
				tempTrain = t;
			}
		}
		return tempTrain;
	}


	public static void searchTrain(String fromStation, String toStation, LocalDate localDate, int seatsNumber) {
		List<Train> searchTrains = new LinkedList<Train>();

		for(Train t: allTrains) {
			if(t.getFromStation().equals(fromStation) &&
					t.getToStation().equals(toStation) &&
					t.getDateOfjourny().equals(localDate) && 
					t.getSeatAvailability() > seatsNumber) {

				searchTrains.add(t);

			}
		}
		if(searchTrains.size() == 0) {
			System.out.println("sorry information input is wrong");
		}else {
			System.out.println("TrainNo  TrainName   FromStation   toStation  No.Seats   "
					+ "dateOfjourny\t price  ");

			for(Train t: searchTrains) {
				System.out.printf("%4d%15s%15s %10s%10d%15s%10d",t.getTrainNumber(), t.getTrainName()
						, t.getFromStation(), t.getToStation(), t.getSeatAvailability(), t.getDateOfjourny(), t.getPrice());
				System.out.println();
			}

		}

	}


	public static void  bookticket(int trainNumber, List<Passenger> passengerList) {

		int numberOfSeats = passengerList.size();
		BankAccount bankAccount = passengerList.get(0).getBankAccount();
		Train tempTrain = findTrain(trainNumber);
		int price = tempTrain.getPrice();
		int totalPrice = price * numberOfSeats;
		bankAccount.withdraw(totalPrice);
		
		
		tempTrain.setSeatAvailability(tempTrain.getSeatAvailability() - numberOfSeats);
		
		
		TicketService.addNewTicket(trainNumber, passengerList);
	}







} 
