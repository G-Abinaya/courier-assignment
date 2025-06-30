package com.hexaware.courier.dao;



import com.hexaware.courier.entity.*;
import com.hexaware.courier.exception.*;
import com.hexaware.courier.service.*;

import java.util.ArrayList;
import java.util.List;

public class CourierUserServiceCollectionImpl implements ICourierUserService {

    protected CourierCompanyCollection companyObj;

    private static int trackingCounter = 1000;  // for generating unique tracking numbers

    public CourierUserServiceCollectionImpl() {
        companyObj = new CourierCompanyCollection("Abinaya Courier Express");
    }

    public String placeOrder(Courier courierObj) {
        String trackingNum = "TRK" + (++trackingCounter);
        courierObj.setTrackingNumber(trackingNum);
        companyObj.addCourier(courierObj);
        return trackingNum;
    }

  
    public String getOrderStatus(String trackingNumber) {
        for (Courier c : companyObj.getCourierDetails()) {
            if (c.getTrackingNumber().equals(trackingNumber)) {
                return c.getStatus();
            }
        }
        throw new TrackingNumberNotFoundException(trackingNumber);
    }


    public boolean cancelOrder(String trackingNumber) {
        for (Courier c : companyObj.getCourierDetails()) {
            if (c.getTrackingNumber().equals(trackingNumber)) {
                c.setStatus("Cancelled");
                return true;
            }
        }
        return false;
    }

    public List<Courier> getAssignedOrder(int courierStaffId) {
        // Sample dummy logic (enhance later)
        List<Courier> assigned = new ArrayList<Courier>();
        for (Courier c : companyObj.getCourierDetails()) {
            if (c.getCourierID() % 10 == courierStaffId % 10) {
                assigned.add(c);
            }
        }
        return assigned;
    }
}
