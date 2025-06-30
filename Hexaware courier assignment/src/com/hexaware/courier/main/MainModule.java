package com.hexaware.courier.main;

import com.hexaware.courier.dao.*;
import com.hexaware.courier.exception.*;

public class MainModule {
    public static void main(String[] args) {
        CourierUserServiceImpl service = new CourierUserServiceImpl();

        try {
            String status = service.getOrderStatus("TRK999");  // wrong tracking number
            System.out.println("Order Status: " + status);
        } catch (TrackingNumberNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using Courier Service.");
        }
    }
}
