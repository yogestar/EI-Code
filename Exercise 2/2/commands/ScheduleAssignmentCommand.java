package main.java.com.example.virtualclassroom.commands;

import main.java.com.example.virtualclassroom.ClassroomManager;

public class ScheduleAssignmentCommand implements Command {
    private final ClassroomManager manager;
    private final String className;
    private final String assignmentDetails;

    public ScheduleAssignmentCommand(ClassroomManager manager, String className, String assignmentDetails) {
        this.manager = manager;
        this.className = className;
        this.assignmentDetails = assignmentDetails;
    }

    @Override
    public void execute() {
        try {
            manager.scheduleAssignment(className, assignmentDetails);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
