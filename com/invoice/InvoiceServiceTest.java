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

}
