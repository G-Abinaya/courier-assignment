package com.hexaware.courier.entity;

import java.util.Date;

public class Payment {
    private long paymentID;
    private long courierID;
    private double amount;
    private Date paymentDate;

    public Payment() {}

    public Payment(long paymentID, long courierID, double amount, Date paymentDate) {
        this.paymentID = paymentID;
        this.courierID = courierID;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters, Setters & toString
    public long getPaymentID() { return paymentID; }
    public void setPaymentID(long paymentID) { this.paymentID = paymentID; }

    public long getCourierID() { return courierID; }
    public void setCourierID(long courierID) { this.courierID = courierID; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }

    @Override
    public String toString() {
        return "Payment [paymentID=" + paymentID + ", courierID=" + courierID + ", amount=" + amount + "]";
    }
}
