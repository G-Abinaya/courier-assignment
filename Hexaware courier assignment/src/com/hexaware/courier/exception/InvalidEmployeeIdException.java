package com.hexaware.courier.exception;

public class InvalidEmployeeIdException extends Exception {

    public InvalidEmployeeIdException(int id) {
        super("Invalid Employee ID: " + id);
    }
}
