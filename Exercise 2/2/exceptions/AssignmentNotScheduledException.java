package main.java.com.example.virtualclassroom.exceptions;

public class AssignmentNotScheduledException extends RuntimeException {
    public AssignmentNotScheduledException(String message) {
        super(message);
    }
}
