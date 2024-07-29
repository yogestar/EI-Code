/*package main.java.com.example.virtualclassroom.entities;

public class Student {
    private final String id;
    private int assignmentsSubmitted;

    public Student(String id) {
        this.id = id;
        this.assignmentsSubmitted = 0;
    }

    public String getId() {
        return id;
    }

    public void submitAssignment(String details) {
        assignmentsSubmitted++;
    }
}*/
package main.java.com.example.virtualclassroom.entities;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private Map<String, String> assignments;
    private String name;

    public Student(String id) {
        this.id = id;
        this.assignments = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "Student ID: " + id;
    }

    public void submitAssignment(String assignmentDetails) {
        assignments.put(assignmentDetails, "Submitted");
    }
}
