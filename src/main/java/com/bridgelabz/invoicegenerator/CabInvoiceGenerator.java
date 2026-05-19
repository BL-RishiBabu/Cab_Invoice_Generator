package com.bridgelabz.invoicegenerator;

public class CabInvoiceGenerator {
    private RideRepository rideRepository;

    public CabInvoiceGenerator() {
        this.rideRepository = new RideRepository();
    }

    public double calculateFare(double distance, int time) {
        return RideCategory.NORMAL.calculateCategoryFare(distance, time);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.rideCategory.calculateCategoryFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }

    public InvoiceSummary getInvoiceSummary(String userId) {
        return this.calculateFare(rideRepository.getRides(userId));
    }
}
