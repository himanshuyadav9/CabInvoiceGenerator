package com.invoice;

public class InvoiceService {

	private static final double MINIMUM_COST_PER_KM = 10;
	private static final int COST_PER_TIME = 1;

	public double calculateFare(double distance, int time) {
		return distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
	}

	public static void main(String[] args) {
		InvoiceService invoice = new InvoiceService();
		System.out.println("Cost " + invoice.calculateFare(2, 30));
	}
}
