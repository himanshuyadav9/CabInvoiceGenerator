package com.invoice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	@Test
	public void givenDistanceAndTime_ShouldReturnTheTotalFare() {
		InvoiceService invoice = new InvoiceService();
		double distance =2.0;
		int time =5;
		double fare = invoice.calculateFare(distance , time);
		Assert.assertEquals(25, fare , 0);
	}
	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		InvoiceService invoice = new InvoiceService();
		double distance = 0.1;
		int time = 1;
		double fare = invoice.calculateFare(distance , time);
		Assert.assertEquals(5, fare , 0);
	}
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		InvoiceService invoice = new InvoiceService();
		Ride[] rides = {new Ride(2.0 , 5),
				        new Ride(0.1 , 1)};
		double fare = invoice.calculateFare(rides);
		Assert.assertEquals(30, fare , 0);
	}

}
