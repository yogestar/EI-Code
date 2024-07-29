package main.java.com.example.virtualclassroom.commands;

import main.java.com.example.virtualclassroom.ClassroomManager;

public class ListClassroomsCommand implements Command {
    private ClassroomManager manager;

    public ListClassroomsCommand(ClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.listAllClassrooms();
    }
}
