/*package main.java.com.example.virtualclassroom;

import main.java.com.example.virtualclassroom.commands.*;
import main.java.com.example.virtualclassroom.exceptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassroomManager manager = ClassroomManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 3);

            try {
                switch (parts[0]) {
                    case "add_classroom":
                        if (parts.length != 2) throw new InvalidInputFormatException("Invalid format for add_classroom command.");
                        manager.executeCommand(new AddClassroomCommand(manager, parts[1]));
                        break;
                    case "add_student":
                        if (parts.length != 3) throw new InvalidInputFormatException("Invalid format for add_student command.");
                        String[] studentParts = parts[1].split(" ", 2);
                        manager.executeCommand(new AddStudentCommand(manager, studentParts[0], studentParts[1]));
                        break;
                    case "schedule_assignment":
                        if (parts.length != 3) throw new InvalidInputFormatException("Invalid format for schedule_assignment command.");
                        manager.executeCommand(new ScheduleAssignmentCommand(manager, parts[1], parts[2]));
                        break;
                    case "submit_assignment":
                        if (parts.length != 3) throw new InvalidInputFormatException("Invalid format for submit_assignment command.");
                        String[] submitParts = parts[1].split(" ", 2);
                        manager.executeCommand(new SubmitAssignmentCommand(manager, submitParts[0], submitParts[1], parts[2]));
                        break;
                    default:
                        throw new InvalidCommandException("Unknown command: " + parts[0]);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
*/
package main.java.com.example.virtualclassroom;

import main.java.com.example.virtualclassroom.commands.*;
import main.java.com.example.virtualclassroom.exceptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassroomManager manager = ClassroomManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 4);

            try {
                switch (parts[0]) {
                    case "add_classroom":
                        if (parts.length != 2) throw new InvalidInputFormatException("Invalid format for add_classroom command.");
                        manager.executeCommand(new AddClassroomCommand(manager, parts[1]));
                        break;
                    case "add_student":
                        if (parts.length != 3) throw new InvalidInputFormatException("Invalid format for add_student command.");
                        manager.executeCommand(new AddStudentCommand(manager, parts[1], parts[2]));
                        break;
                    case "schedule_assignment":
                        if (parts.length != 3) throw new InvalidInputFormatException("Invalid format for schedule_assignment command.");
                        manager.executeCommand(new ScheduleAssignmentCommand(manager, parts[1], parts[2]));
                        break;
                    case "submit_assignment":
                        if (parts.length != 4) throw new InvalidInputFormatException("Invalid format for submit_assignment command.");
                        manager.executeCommand(new SubmitAssignmentCommand(manager, parts[1], parts[2], parts[3]));
                        break;
                    case "list_classrooms":
                        if (parts.length != 1) throw new InvalidInputFormatException("Invalid format for list_classrooms command.");
                        manager.executeCommand(new ListClassroomsCommand(manager));
                        break;
                    case "remove_classroom":
                        if (parts.length != 2) throw new InvalidInputFormatException("Invalid format for remove_classroom command.");
                        manager.executeCommand(new RemoveClassroomCommand(manager, parts[1]));
                        break;
                    /*case "list_students":
                        if (parts.length != 2) throw new InvalidInputFormatException("Invalid format for list_students command.");
                        manager.listStudentsInClassroom(parts[1]);
                        break;*/
                    case "list_students":
                        if (parts.length != 2) throw new InvalidInputFormatException("Invalid format for list_students command.");
                        manager.executeCommand(new ListStudentsCommand(manager, parts[1]));
                        break;
                    default:
                        throw new InvalidCommandException("Unknown command: " + parts[0]);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
