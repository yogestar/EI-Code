package main.java.com.example.virtualclassroom.exceptions;

public class ClassroomNotFoundException extends RuntimeException {
    public ClassroomNotFoundException(String message) {
        super(message);
    }
}
