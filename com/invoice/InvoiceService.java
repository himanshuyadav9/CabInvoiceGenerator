package com.invoice;

public class InvoiceService {

	private static final double MINIMUM_COST_PER_KM = 10;
	private static final int COST_PER_TIME = 1;
	private static final int MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		double totalfare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
		if(totalfare < MINIMUM_FARE)
		   return MINIMUM_FARE;
		return totalfare;
	}
	public double calculateFare(Ride[] rides) {
		double totalfare = 0;
		for (Ride ride : rides) {
		totalfare += this.calculateFare(ride.distance, ride.time);
		}
		return totalfare;
	}

	public static void main(String[] args) {
		InvoiceService invoice = new InvoiceService();
		System.out.println("Cost " + invoice.calculateFare(0.1, 1));
		Ride [] rides = {new Ride(2.0, 5), new Ride(0.1 , 1)};
		System.out.println("Cost " + invoice.calculateFare(rides));
	}
}
