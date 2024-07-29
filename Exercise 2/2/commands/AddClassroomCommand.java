package main.java.com.example.virtualclassroom.commands;

import main.java.com.example.virtualclassroom.ClassroomManager;

public class AddClassroomCommand implements Command {
    private final ClassroomManager manager;
    private final String className;

    public AddClassroomCommand(ClassroomManager manager, String className) {
        this.manager = manager;
        this.className = className;
    }

    @Override
    public void execute() {
        try {
            manager.addClassroom(className);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
