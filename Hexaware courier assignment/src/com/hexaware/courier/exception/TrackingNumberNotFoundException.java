package com.hexaware.courier.exception;

public class TrackingNumberNotFoundException extends Exception {

    public TrackingNumberNotFoundException(String trackingNumber) {
        super("Tracking Number Not Found: " + trackingNumber);
    }
}