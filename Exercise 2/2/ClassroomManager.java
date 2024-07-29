/*package main.java.com.example.virtualclassroom;

import main.java.com.example.virtualclassroom.commands.Command;
import main.java.com.example.virtualclassroom.exceptions.*;

import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private static ClassroomManager instance;
    private final Map<String, Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public void addClassroom(String name) throws ClassroomAlreadyExistsException {
        if (classrooms.containsKey(name)) {
            throw new ClassroomAlreadyExistsException("Classroom already exists: " + name);
        }
        classrooms.put(name, new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    public void addStudent(String studentId, String className) throws ClassroomNotFoundException, StudentAlreadyEnrolledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        if (classroom.hasStudent(studentId)) {
            throw new StudentAlreadyEnrolledException("Student already enrolled: " + studentId);
        }
        classroom.addStudent(new Student(studentId));
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String details) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        classroom.addAssignment(new Assignment(details));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) throws ClassroomNotFoundException, StudentNotFoundException, AssignmentNotScheduledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }
        Assignment assignment = classroom.getAssignment(assignmentDetails);
        if (assignment == null) {
            throw new AssignmentNotScheduledException("Assignment not scheduled: " + assignmentDetails);
        }
        student.submitAssignment(assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }
}


package main.java.com.example.virtualclassroom;

import main.java.com.example.virtualclassroom.commands.Command;
import main.java.com.example.virtualclassroom.exceptions.*;
import main.java.com.example.virtualclassroom.entities.Classroom;
import main.java.com.example.virtualclassroom.entities.Student;
import main.java.com.example.virtualclassroom.entities.Assignment;

import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private static ClassroomManager instance;
    private final Map<String, Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public void addClassroom(String name) throws ClassroomAlreadyExistsException {
        if (classrooms.containsKey(name)) {
            throw new ClassroomAlreadyExistsException("Classroom already exists: " + name);
        }
        classrooms.put(name, new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    public void addStudent(String studentId, String className) throws ClassroomNotFoundException, StudentAlreadyEnrolledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        if (classroom.hasStudent(studentId)) {
            throw new StudentAlreadyEnrolledException("Student already enrolled: " + studentId);
        }
        classroom.addStudent(new Student(studentId));
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String details) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        classroom.addAssignment(new Assignment(details));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) throws ClassroomNotFoundException, StudentNotFoundException, AssignmentNotScheduledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }
        Assignment assignment = classroom.getAssignment(assignmentDetails);
        if (assignment == null) {
            throw new AssignmentNotScheduledException("Assignment not scheduled: " + assignmentDetails);
        }
        student.submitAssignment(assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }
    public void listAllClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("List of Classrooms:");
        for (String name : classrooms.keySet()) {
            System.out.println(name);
        }
    }

    public void removeClassroom(String name) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.remove(name);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + name);
        }
        System.out.println("Classroom " + name + " has been removed.");
    }
}
*/
/* 
package main.java.com.example.virtualclassroom;

import main.java.com.example.virtualclassroom.commands.Command;
import main.java.com.example.virtualclassroom.exceptions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassroomManager {
    private static ClassroomManager instance;
    private final Map<String, Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public void addClassroom(String name) throws ClassroomAlreadyExistsException {
        if (classrooms.containsKey(name)) {
            throw new ClassroomAlreadyExistsException("Classroom already exists: " + name);
        }
        classrooms.put(name, new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    public void addStudent(String studentId, String className) throws ClassroomNotFoundException, StudentAlreadyEnrolledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        if (classroom.hasStudent(studentId)) {
            throw new StudentAlreadyEnrolledException("Student already enrolled: " + studentId);
        }
        classroom.addStudent(new Student(studentId));
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String details) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        classroom.addAssignment(new Assignment(details));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) throws ClassroomNotFoundException, StudentNotFoundException, AssignmentNotScheduledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }
        Assignment assignment = classroom.getAssignment(assignmentDetails);
        if (assignment == null) {
            throw new AssignmentNotScheduledException("Assignment not scheduled: " + assignmentDetails);
        }
        student.submitAssignment(assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    public void listAllClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("List of Classrooms:");
        for (String name : classrooms.keySet()) {
            System.out.println(name);
        }
    }

    public void removeClassroom(String name) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.remove(name);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + name);
        }
        System.out.println("Classroom " + name + " has been removed.");
    }
}
*/

package main.java.com.example.virtualclassroom;

import main.java.com.example.virtualclassroom.commands.Command;
import main.java.com.example.virtualclassroom.exceptions.*;
import main.java.com.example.virtualclassroom.entities.Classroom;
import main.java.com.example.virtualclassroom.entities.Student;
import main.java.com.example.virtualclassroom.entities.Assignment;

import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private static ClassroomManager instance;
    private final Map<String, Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public void addClassroom(String name) throws ClassroomAlreadyExistsException {
        if (classrooms.containsKey(name)) {
            throw new ClassroomAlreadyExistsException("Classroom already exists: " + name);
        }
        classrooms.put(name, new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    public void addStudent(String studentId, String className) throws ClassroomNotFoundException, StudentAlreadyEnrolledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        if (classroom.hasStudent(studentId)) {
            throw new StudentAlreadyEnrolledException("Student already enrolled: " + studentId);
        }
        classroom.addStudent(new Student(studentId));
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String details) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        classroom.addAssignment(new Assignment(details));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) throws ClassroomNotFoundException, StudentNotFoundException, AssignmentNotScheduledException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }
        Assignment assignment = classroom.getAssignment(assignmentDetails);
        if (assignment == null) {
            throw new AssignmentNotScheduledException("Assignment not scheduled: " + assignmentDetails);
        }
        student.submitAssignment(assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    public void listAllClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("List of Classrooms:");
        for (String name : classrooms.keySet()) {
            System.out.println(name);
        }
    }

    public void removeClassroom(String name) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.remove(name);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + name);
        }
        System.out.println("Classroom " + name + " has been removed.");
    }
    /*public void listStudentsInClassroom(String className) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        classroom.listStudents();
    }*/
    public Classroom getClassroom(String className) throws ClassroomNotFoundException {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new ClassroomNotFoundException("Classroom not found: " + className);
        }
        return classroom;
    }
}
