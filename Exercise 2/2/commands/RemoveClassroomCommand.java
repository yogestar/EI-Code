package main.java.com.example.virtualclassroom.commands;

import main.java.com.example.virtualclassroom.ClassroomManager;
import main.java.com.example.virtualclassroom.exceptions.ClassroomNotFoundException;

public class RemoveClassroomCommand implements Command {
    private ClassroomManager manager;
    private String name;

    public RemoveClassroomCommand(ClassroomManager manager, String name) {
        this.manager = manager;
        this.name = name;
    }

    @Override
    public void execute() {
        try {
            manager.removeClassroom(name);
        } catch (ClassroomNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
