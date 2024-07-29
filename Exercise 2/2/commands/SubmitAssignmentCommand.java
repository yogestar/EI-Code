package main.java.com.example.virtualclassroom.commands;

import main.java.com.example.virtualclassroom.ClassroomManager;

public class SubmitAssignmentCommand implements Command {
    private final ClassroomManager manager;
    private final String studentId;
    private final String className;
    private final String assignmentDetails;

    public SubmitAssignmentCommand(ClassroomManager manager, String studentId, String className, String assignmentDetails) {
        this.manager = manager;
        this.studentId = studentId;
        this.className = className;
        this.assignmentDetails = assignmentDetails;
    }

    @Override
    public void execute() {
        try {
            manager.submitAssignment(studentId, className, assignmentDetails);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
