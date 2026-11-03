package org.example;

public class InvalidTrainDataException extends RuntimeException {
    public InvalidTrainDataException(String message) {
        super(message);
    }
    public  InvalidTrainDataException(String message, RuntimeException name){ super (message, name);}
}
