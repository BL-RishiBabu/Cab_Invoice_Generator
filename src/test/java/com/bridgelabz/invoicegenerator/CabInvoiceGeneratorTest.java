package com.bridgelabz.invoicegenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(25.0, fare, 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(5.0, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnAggregateFare() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = { new Ride(2.0, 5),
                         new Ride(0.1, 1) };
        double fare = invoiceGenerator.calculateFare(rides);
        assertEquals(30.0, fare, 0.0);
    }
}
