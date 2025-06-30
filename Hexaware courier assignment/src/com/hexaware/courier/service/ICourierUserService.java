package com.hexaware.courier.service;

import com.hexaware.courier.entity.*;
import com.hexaware.courier.exception.TrackingNumberNotFoundException;

import java.util.List;

public interface ICourierUserService {

   
    String placeOrder(Courier courierObj);

    String getOrderStatus(String trackingNumber) throws TrackingNumberNotFoundException;

  
    boolean cancelOrder(String trackingNumber);

    
    List<Courier> getAssignedOrder(int courierStaffId);
}
