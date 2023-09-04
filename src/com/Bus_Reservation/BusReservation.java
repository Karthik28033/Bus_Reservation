package com.Bus_Reservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusReservation {
	public static void main(String[] args) {
		System.out.println("*****WELCOME TO KARTHIK TRAVELS*****");
		System.out.println("       PLAN YOUR TRIP WITH US       \n");
		System.out.println("AVAILABLE BUSES:-");
		ArrayList<BusInfo> Buses= new ArrayList<BusInfo>();

		Buses.add(new BusInfo(1,true,2));    //(BusNumber,AC,TotalSeats)
		Buses.add(new BusInfo(2,true,3));
		Buses.add(new BusInfo(3,false,3));


		for(BusInfo bi:Buses ) {
			bi.BusInformation();
		}
		int PassengerOption=1;

		ArrayList<TicketBooking> Bookings = new ArrayList<TicketBooking>();

		while(PassengerOption==1) {

			System.out.println("ENTER 1 TO BOOK TICKET \nENTER 2 TO EXIT");
			Scanner sc=new Scanner(System.in);
			PassengerOption = sc.nextInt();
			if (PassengerOption==1) {
				TicketBooking Booking=new TicketBooking();
				if (Booking.isAvailable(Buses,Bookings)) {
					Bookings.add(Booking);
					System.out.println("YOUR TICKET IS CONFIRMED");

				}else {
					System.out.println("SORRY, SEAT IS NOT AVAILABLE");
				}
			} 
			else {
				System.out.println("THANK YOU");
			}
			//sc.close();
		}

	}

}
