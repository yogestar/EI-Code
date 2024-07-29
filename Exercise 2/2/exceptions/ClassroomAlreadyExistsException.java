package main.java.com.example.virtualclassroom.exceptions;

public class ClassroomAlreadyExistsException extends RuntimeException {
    public ClassroomAlreadyExistsException(String message) {
        super(message);
    }
}
