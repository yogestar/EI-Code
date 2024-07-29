package main.java.com.example.virtualclassroom.commands;

import main.java.com.example.virtualclassroom.ClassroomManager;
import main.java.com.example.virtualclassroom.entities.Classroom;
import main.java.com.example.virtualclassroom.exceptions.ClassroomNotFoundException;

public class ListStudentsCommand implements Command {
    private final ClassroomManager manager;
    private final String className;

    public ListStudentsCommand(ClassroomManager manager, String className) {
        this.manager = manager;
        this.className = className;
    }

    @Override
    /*public void execute() {
        try {
            manager.listStudentsInClassroom(className);
        } catch (ClassroomNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }*/

     public void execute() {
        try {
            manager.getClassroom(className).listStudents();
            //classroom.listAllStudents();
        } catch (ClassroomNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
