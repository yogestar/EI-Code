package main.java.com.example.virtualclassroom.exceptions;

public class ClassroomCapacityExceededException extends RuntimeException {
    public ClassroomCapacityExceededException(String message) {
        super(message);
    }
}
