package com.hexaware.courier.dao;

import java.util.List;

import com.hexaware.courier.entity.Courier;
import com.hexaware.courier.exception.*;

public class CourierUserServiceImpl implements com.hexaware.courier.service.ICourierUserService {

 
    public String getOrderStatus(String trackingNumber) throws TrackingNumberNotFoundException {
      
        if (!trackingNumber.equals("TRK001")) {
            throw new TrackingNumberNotFoundException(trackingNumber);
        }
        return "Delivered";
    }

	public String placeOrder(Courier courierObj) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean cancelOrder(String trackingNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Courier> getAssignedOrder(int courierStaffId) {
		// TODO Auto-generated method stub
		return null;
	}

   
}
