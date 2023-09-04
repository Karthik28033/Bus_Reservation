package com.Bus_Reservation;

public class BusInfo {
	private int BusNumber;
	private boolean Ac;
	private int TotalSeats; // Use Getter And Setter Methods
	
	BusInfo(int BusNumber,boolean Ac,int TotalSeats){
		this.BusNumber=BusNumber;
		this.Ac=Ac;
		this.TotalSeats=TotalSeats;
	}
	//BusNumber (Get And Set)
	public int getBusNumber() {
		return BusNumber;	
	}
	public void setBusNumber(int BusNumber) {
		this.BusNumber = BusNumber;
	}
	//AC (Get And Set)
	public boolean getAc() {
		return Ac;
	}
	public void setAc(boolean Ac) {
		this.Ac = Ac;
	}
	//TotalSeats (Get And Set)
	public int getTotalSeats() {
		return TotalSeats;	
	}
	public void setTotalSeats(int TotalSeats) {
		this.TotalSeats=TotalSeats;
	}
	
	public void BusInformation() {
	
		System.out.println("Bus Number : " +BusNumber);
		System.out.println("Ac         : " + Ac);
		System.out.println("Total Seats: " + TotalSeats);
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
	}
}
