package main.java.com.example.virtualclassroom.commands;

import main.java.com.example.virtualclassroom.ClassroomManager;

public class AddStudentCommand implements Command {
    private final ClassroomManager manager;
    private final String studentId;
    private final String className;

    public AddStudentCommand(ClassroomManager manager, String studentId, String className) {
        this.manager = manager;
        this.studentId = studentId;
        this.className = className;
    }

    @Override
    public void execute() {
        try {
            manager.addStudent(studentId, className);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
