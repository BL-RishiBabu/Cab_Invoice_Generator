package com.bridgelabz.invoicegenerator;

public class Ride {
    public final double distance;
    public final int time;
    public final RideCategory rideCategory;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
        this.rideCategory = RideCategory.NORMAL;
    }

    public Ride(double distance, int time, RideCategory rideCategory) {
        this.distance = distance;
        this.time = time;
        this.rideCategory = rideCategory;
    }
}
