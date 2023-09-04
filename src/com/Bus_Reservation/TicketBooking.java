package com.Bus_Reservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class TicketBooking {
	String PassengerName;
	int BusNumber;
	Date Date;

	TicketBooking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NAME OF PASSENGER");
		PassengerName = sc.nextLine();

		System.out.println("ENTER BUS NUMBER");
		BusNumber = sc.nextInt();

		System.out.println("ENTER DATE(DD/MM/YYYY)");
		String DateInput=sc.next();
		SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date = DateFormat.parse(DateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<BusInfo> Buses,ArrayList<TicketBooking> Bookings) {
		int totalseats=0;
		int booked=0;
		for(BusInfo bus:Buses) {
			if (bus.getBusNumber()==BusNumber) {
				totalseats=bus.getTotalSeats();
			}
		}
		for(TicketBooking Ticketbookingc:Bookings) {
			if(Ticketbookingc.BusNumber==BusNumber && Ticketbookingc.Date.equals(Date)) {
				booked++;

			}

		}
		return booked<totalseats?true:false; //booked is less than totalseats in the above method	
	}


}


